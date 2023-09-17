package com.ygs.permission

import android.Manifest
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private val cameraResultLauncher: ActivityResultLauncher<String> =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted ->
            if (isGranted) {
                Toast.makeText(this, "카메라 권한이 승인되었습니다.", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "카메라 권한을 승인하지 않았습니다.", Toast.LENGTH_LONG).show()
            }
        }

    private val cameraAndLocationResultLauncher: ActivityResultLauncher<Array<String>> =
        registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()) {
            permission ->
            permission.entries.forEach{
                val permissionName = it.key
                val isGranted = it.value
                if(isGranted){
                    if(permissionName == Manifest.permission.ACCESS_FINE_LOCATION){
                        Toast.makeText(this, "상세 위치 권한이 승인되었습니다.", Toast.LENGTH_LONG).show()
                    }else if(permissionName == Manifest.permission.ACCESS_COARSE_LOCATION){
                        Toast.makeText(this, "대략적인 위치 권한이 승인되었습니다.", Toast.LENGTH_LONG).show()
                    }else{
                        Toast.makeText(this, "카메라 권한이 승인되었습니다.", Toast.LENGTH_LONG).show()
                    }
                }else{
                    if(permissionName == Manifest.permission.ACCESS_FINE_LOCATION){
                        Toast.makeText(this, "상세 위치 권한이 거절되었습니다.", Toast.LENGTH_LONG).show()
                    }else if(permissionName == Manifest.permission.ACCESS_COARSE_LOCATION){
                        Toast.makeText(this, "대략적인 위치 권한이 거절되었습니다.", Toast.LENGTH_LONG).show()
                    }else{
                        Toast.makeText(this, "카메라 권한이 거절되었습니다.", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCameraPermission: Button = findViewById(R.id.btnCameraPermission)
        btnCameraPermission.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)
            ) {
                showRationaleDialog("해당 어플은 카메라 권한이 필요합니다.", "카메라 권한이 승인되지 않아 사용할 수 없습니다.")
            } else {
                // cameraResultLauncher.launch(Manifest.permission.CAMERA)
                cameraAndLocationResultLauncher.launch(
                    arrayOf(Manifest.permission.CAMERA,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                    )
                )
            }

        }
    }

    private fun showRationaleDialog(title: String, message: String) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle(title)
            .setMessage(message)
            .setPositiveButton("취소") { dialog, _ ->
                dialog.dismiss()
            }
        builder.create().show()
    }
}