package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityMainBinding

class MainVM : ViewModel() {
    val result = MutableLiveData<Int>(0)
}

class MainActivity : AppCompatActivity() {
    private lateinit var _mainBinding: ActivityMainBinding
    private lateinit var _mainVM: MainVM

    private val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == MoveForResultActivity.RESULT_CODE) {
            if (it.data != null) {
                val selectedValue = it.data?.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0)

                _mainVM.result.postValue(selectedValue)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_mainBinding.root)

        _mainVM = ViewModelProvider(this).get(MainVM::class.java)

        _mainVM.result.observe(this) {
            _mainBinding.tvResult.text = "Hasil : $it"
        }

        _mainBinding.btnMove.setOnClickListener {
            move()
        }

        _mainBinding.btnMoveWithData.setOnClickListener {
            moveWithData()
        }

        _mainBinding.btnMoveWithObject.setOnClickListener{
            moveWithObject()
        }

        _mainBinding.btnDialNumber.setOnClickListener {
            val phoneNumber = "081234567890"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        _mainBinding.btnMoveForResult.setOnClickListener {
            moveForResult()
        }
    }

    private fun moveForResult() {
        val moveForResultIntent = Intent(this@MainActivity, MoveForResultActivity::class.java)
        resultLauncher.launch(moveForResultIntent)
    }

    private fun moveWithObject() {
        val moveWithObjectIntent = Intent(this@MainActivity, MoveWithObjectActivity::class.java)
        moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, Person("John Doe", 23))
        startActivity(moveWithObjectIntent)
    }

    private fun moveWithData() {
        val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "John Doe")
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 23)
        startActivity(moveWithDataIntent)
    }

    private fun move() {
        val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
        startActivity(moveIntent)
    }

}