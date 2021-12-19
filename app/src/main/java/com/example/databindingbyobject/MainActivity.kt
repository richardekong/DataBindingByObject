package com.example.databindingbyobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingbyobject.databinding.ActivityMainBinding
import com.example.databindingbyobject.model.Student

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.student = createStudent()
    }

    private fun createStudent(): Student {
        return Student("dev@mail.com", "Vlad",16)
    }
}