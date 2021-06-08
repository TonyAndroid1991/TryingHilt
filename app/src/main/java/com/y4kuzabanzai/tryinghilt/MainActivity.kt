package com.y4kuzabanzai.tryinghilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.EntryPoint
import javax.inject.Inject

@EntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var injectedString: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MyTag", "onCreate: $injectedString")
    }
}