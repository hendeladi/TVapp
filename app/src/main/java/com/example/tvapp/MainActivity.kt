package com.example.tvapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.net.Socket

class MainActivity : AppCompatActivity() {
    fun sendTCP(IP: String, port: Int, data: String){
        val client = Socket(IP, port)
        client.outputStream.write(data.toByteArray())
        client.close()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val IP_ADDR = "10.0.0.55"
        val PORT = 5005

        BtnPower.setOnClickListener(){
            println(" button power")
            sendTCP(IP_ADDR, PORT, "ir tv power")

        }

        BtnYes.setOnClickListener(){
            sendTCP(IP_ADDR, PORT, "ir tv yes")
            println(" button yes")
        }

        Btn0.setOnClickListener(){
            sendTCP(IP_ADDR, PORT, "ir tv 0")
            println(" button 0")
        }

        Btn1.setOnClickListener(){
            println(" button 1")
            sendTCP(IP_ADDR, PORT, "ir tv 1")
        }

        Btn2.setOnClickListener(){
            println(" button 2")
            sendTCP(IP_ADDR, PORT, "ir tv 2")
        }

        Btn3.setOnClickListener(){
            println(" button 3")
            sendTCP(IP_ADDR, PORT, "ir tv 3")
        }

        Btn4.setOnClickListener(){
            println(" button 4")
            sendTCP(IP_ADDR, PORT, "ir tv 4")
        }

        Btn5.setOnClickListener(){
            println(" button 5")
            sendTCP(IP_ADDR, PORT, "ir tv5 ")
        }

        Btn6.setOnClickListener(){
            println(" button 6")
            sendTCP(IP_ADDR, PORT, "ir tv 6")
        }

        Btn7.setOnClickListener(){
            println(" button 7")
            sendTCP(IP_ADDR, PORT, "ir tv 7")
        }

        Btn8.setOnClickListener(){
            println(" button 8")
            sendTCP(IP_ADDR, PORT, "ir tv 8")
        }

        Btn9.setOnClickListener(){
            println(" button 9")
            sendTCP(IP_ADDR, PORT, "ir tv 9")
        }

        BtnCHPlus.setOnClickListener(){
            println(" button CH+")
            sendTCP(IP_ADDR, PORT, "ir tv ch+")
        }

        BtnCHMinus.setOnClickListener(){
            println(" button CH-")
            sendTCP(IP_ADDR, PORT, "ir tv ch-")
        }

        BtnVolPlus.setOnClickListener(){
            println(" button vol+")
            sendTCP(IP_ADDR, PORT, "ir tv vol+")
        }

        BtnVolMinus.setOnClickListener(){
            println(" button vol-")
            sendTCP(IP_ADDR, PORT, "ir tv vol-")
        }

        BtnUp.setOnClickListener(){
            println(" button up")
            sendTCP(IP_ADDR, PORT, "ir tv up")
        }

        BtnDown.setOnClickListener(){
            println(" button down")
            sendTCP(IP_ADDR, PORT, "ir tv down")
        }

        BtnRight.setOnClickListener(){
            println(" button right")
            sendTCP(IP_ADDR, PORT, "ir tv right")
        }

        BtnLeft.setOnClickListener(){
            println(" button left")
            sendTCP(IP_ADDR, PORT, "ir tv left")
        }

        BtnQuestionMark.setOnClickListener(){
            println(" button ?")
            sendTCP(IP_ADDR, PORT, "ir tv ?")
        }

        BtnPlus.setOnClickListener(){
            println(" button +")
            sendTCP(IP_ADDR, PORT, "ir tv +")
        }

        BtnRevert.setOnClickListener(){
            println(" button revert")
            sendTCP(IP_ADDR, PORT, "ir tv return")
        }
    }



}