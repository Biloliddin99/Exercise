package com.bilol.exercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bilol.exercise.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user:User = intent.getSerializableExtra("keyUser") as User
        binding.text.text = "$user"
    }
}