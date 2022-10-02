package com.empedocles.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Timer initilized
        var timer = 0


        // Infinity loop
        while (true){
            // Coroutine scope
            CoroutineScope(Dispatchers.IO).launch{
                val answer = doNetworkCall()
                withContext(Dispatchers.Main){
                    Log.v("PATIKA",answer)
                }
            }
            println(timer)
            timer += 1
        }
    }

    // Suspend function, 2 sec delay
    suspend fun doNetworkCall() :String{
        delay(2000L)
        return "PATIKA DEV"
    }

}