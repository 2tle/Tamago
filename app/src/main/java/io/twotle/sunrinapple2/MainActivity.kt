package io.twotle.sunrinapple2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import io.twotle.sunrinapple2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var eggTouch = 100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.main = this@MainActivity
        binding.egg = eggTouch


    }

    fun touchEgg() : Unit {
        if(eggTouch >0) {
            eggTouch--
            this.binding.egg = eggTouch
        }
        when(eggTouch) {
            80 -> {
                binding.ivEgg.setImageResource(R.drawable.egg2)
            }
            50 -> {
                binding.ivEgg.setImageResource(R.drawable.egg3);
            }
            10 -> {
                binding.ivEgg.setImageResource(R.drawable.egg4);
            }
            0 -> {
                binding.ivEgg.setImageResource(R.drawable.fry);
            }
        }
    }

    fun restart() : Unit {
        eggTouch = 100
        this.binding.egg = eggTouch
        binding.ivEgg.setImageResource(R.drawable.egg);
    }


}