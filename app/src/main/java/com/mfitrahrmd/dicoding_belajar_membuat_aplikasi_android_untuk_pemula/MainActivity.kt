package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var _mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_mainBinding.root)

        _mainBinding.btnCalculate.setOnClickListener {
            val length = _mainBinding.etLength.text.toString().trim()
            val width = _mainBinding.etWidth.text.toString().trim()
            val height = _mainBinding.etHeight.text.toString().trim()

            var isEmptyFields = false
            val errorMessage = "Field ini tidak boleh kosong"

            if (length.isEmpty()) {
                isEmptyFields = true
                _mainBinding.etLength.error = errorMessage
            }
            if (width.isEmpty()) {
                isEmptyFields = true
                _mainBinding.etWidth.error = errorMessage
            }
            if (height.isEmpty()) {
                isEmptyFields = true
                _mainBinding.etHeight.error = errorMessage
            }

            if (isEmptyFields) return@setOnClickListener

            val volume = calculateVolume(length.toDouble(), width.toDouble(), height.toDouble())

            _mainBinding.tvResult.text = volume.toString()
        }
    }

    fun calculateVolume(length: Double, width: Double, height: Double): Double {
        return length * width * height
    }
}