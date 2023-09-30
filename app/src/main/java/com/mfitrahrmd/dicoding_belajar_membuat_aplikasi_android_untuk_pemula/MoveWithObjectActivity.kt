package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityMoveWithObjectBinding

class MoveWithObjectActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    private lateinit var _moveWithObjectBinding: ActivityMoveWithObjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _moveWithObjectBinding = ActivityMoveWithObjectBinding.inflate(layoutInflater)
        setContentView(_moveWithObjectBinding.root)

        var person: Person?

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            person = intent.getParcelableExtra<Person>(EXTRA_PERSON, Person::class.java)
        } else {
            person = intent.getParcelableExtra<Person>(EXTRA_PERSON)
        }

        if (person != null) {
            _moveWithObjectBinding.tvObject.text = "Name : ${person.name}, Age : ${person.age}"
        }
    }
}