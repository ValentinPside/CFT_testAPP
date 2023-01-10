package com.example.cft_testapp

import android.app.DownloadManager.Request
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.cft_testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.CheckBut.setOnClickListener {

        }
    }

    private fun getBINResult(bin : Integer){
        var bin = 3996708
        val url = "https://lookup.binlist.net/$bin"

        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(com.android.volley.Request.Method.GET,
        url,
            {
                response -> Log.d("MyLog", "Volley Error: $response")
            },
            {
                Log.d("MyLog", "Volley Error: $it")
            }
        )
        queue.add(stringRequest)
    }
}