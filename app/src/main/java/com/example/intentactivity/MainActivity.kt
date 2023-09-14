package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.intentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"

    private lateinit var binding : ActivityMainBinding

    companion object {
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)

        with(binding) {
            btnToSecond.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)

                val name = editTxtName.text.toString()
                intentToSecondActivity.putExtra(EXTRA_NAME,name)

                startActivity(intentToSecondActivity)
            }
        }
        Log.d(TAG, "onCreate dipanggil")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart dipanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume dipanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause dipanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop dipanggil")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy dipanggil")
    }
}
