package com.ygs.roomdatabase

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.ygs.roomdatabase.databinding.ActivityMainBinding
import com.ygs.roomdatabase.databinding.DialogUpdateBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val employeeDao = (application as EmployeeApp).db.employeeDao()
        binding?.btnAdd?.setOnClickListener {
            addRecord(employeeDao)
        }

        lifecycleScope.launch{
            employeeDao.fetchAllEmployees().collect{
                val list = ArrayList(it)
                setupListOfDataIntoRecyclerView(list, employeeDao)
            }
        }
    }

    fun addRecord(employeeDAO: EmployeeDao){
        val name = binding?.etName?.text.toString()
        val email = binding?.etEmailId?.text.toString()

        if(email.isNotEmpty() && name.isNotEmpty()){
            lifecycleScope.launch {
                employeeDAO.insert(EmployeeEntity(name = name, email = email))
                Toast.makeText(applicationContext, "저장되었습니다.", Toast.LENGTH_LONG).show()
                binding?.etName?.text?.clear()
                binding?.etEmailId?.text?.clear()
            }
        }else{
            Toast.makeText(applicationContext, "이름과 이메일을 모두 입력해주세요.", Toast.LENGTH_LONG).show()
        }
    }

    private fun setupListOfDataIntoRecyclerView(
        employeesList: ArrayList<EmployeeEntity>, employeeDao: EmployeeDao
    ) {
        if(employeesList.isNotEmpty()){
            val itemAdapter = ItemAdapter(employeesList,
                {
                    updateId -> updateRecordDialog(updateId, employeeDao)
                },
                {
                    deleteId -> deleteRecordAlertDialog(deleteId, employeeDao)
                }
            )
            binding?.rvItemsList?.layoutManager = LinearLayoutManager(this)
            binding?.rvItemsList?.adapter = itemAdapter
            binding?.rvItemsList?.visibility = View.VISIBLE
            binding?.tvNoRecordsAvailable?.visibility = View.GONE
        }else{
            binding?.rvItemsList?.visibility = View.GONE
            binding?.tvNoRecordsAvailable?.visibility = View.VISIBLE
        }
    }

    private fun updateRecordDialog(id: Int, employeeDao: EmployeeDao){
        val updateDialog = Dialog(this, R.style.Theme_Dialog)
        updateDialog.setCancelable(false)
        val binding = DialogUpdateBinding.inflate(layoutInflater)
        updateDialog.setContentView(binding.root)

        lifecycleScope.launch {
            employeeDao.fetchAllEmployeeById(id).collect{ it ->
                if(it != null){
                    binding.etUpdateName.setText(it.name)
                    binding.etUpdateEmailId.setText(it.email)
                }
            }
        }

        binding.tvUpdate.setOnClickListener{
            val name = binding.etUpdateName.text.toString()
            val email = binding.etUpdateEmailId.text.toString()

            if(name.isNotEmpty() && email.isNotEmpty()){
                lifecycleScope.launch {
                    employeeDao.update(EmployeeEntity(id, name, email))
                    Toast.makeText(applicationContext, "저장되었습니다.", Toast.LENGTH_LONG).show()
                    updateDialog.dismiss()
                }
            }else{
                Toast.makeText(applicationContext, "이름 또는 이메일이 입력되지 않았습니다.", Toast.LENGTH_LONG).show()
            }
        }

        binding.tvCancel.setOnClickListener {
            updateDialog.dismiss()
        }

        updateDialog.show()
    }

    private fun deleteRecordAlertDialog(id: Int, employeeDao: EmployeeDao){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("기록 삭제")
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        builder.setPositiveButton("네"){ dialogInterface, _ ->
            lifecycleScope.launch{
                employeeDao.delete(EmployeeEntity(id))
                Toast.makeText(
                    applicationContext,
                    "성공적으로 삭제 되었습니다.",
                    Toast.LENGTH_LONG
                ).show()
            }
            dialogInterface.dismiss()
        }

        builder.setNegativeButton("아니오"){ dialogInterface, _ ->
            dialogInterface.dismiss()
        }

        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }

}