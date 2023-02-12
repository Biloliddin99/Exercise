package com.bilol.exercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bilol.exercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNext.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            val user = User(binding.editName.text.toString(),binding.editNumber.text.toString().toInt())
            intent.putExtra("keyUser",user)
            startActivity(intent)
        }
    }
}