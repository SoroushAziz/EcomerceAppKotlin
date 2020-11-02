package com.example.ecomerceappkotlin

import android.app.VoiceInteractor
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.net.URI
import java.net.URL

private var sharedP:SharedPreferences?=null


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.btnGetData).setOnClickListener {

            val serverURL: String ="https://192.168.0.18/PHPTest/test_file.php"
            var requestQ: RequestQueue=Volley.newRequestQueue(this)
            var stringRequest=StringRequest(Request.Method.GET, serverURL, Response.Listener { response ->


                findViewById<TextView>(R.id.txtHelloWorld).text=response

            },Response.ErrorListener {
                error->


                findViewById<TextView>(R.id.txtHelloWorld).text=error.message


            })

            requestQ.add(stringRequest)

        }


        }
}