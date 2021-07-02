package com.cleancode.mvvmpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.cleancode.mvvmpattern.databinding.ActivityMainBinding
import com.cleancode.mvvmpattern.model.User

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this;
        binding.user = User("테", "스트")
        binding.changeBtn.setOnClickListener {
            binding.invalidateAll()
        }
        binding.changeDataBtn.setOnClickListener {
            binding.user = User("입", "니다")
        }
    }
}