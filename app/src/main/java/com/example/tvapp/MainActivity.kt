package com.example.tvapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.net.Socket

class MainActivity : AppCompatActivity() {
    val viewModel = TvViewModel()
    fun sendTCP(IP: String, port: Int, data: String) {
        val client = Socket(IP, port)
        client.outputStream.write(data.toByteArray())
        client.close()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        BtnPower.setOnClickListener() {
            viewModel.send(TV_POWER)
        }

        BtnYes.setOnClickListener() {
            viewModel.send(TV_YES)
        }

        Btn0.setOnClickListener() {
            viewModel.send(TV_CHANNEL_NUM_0)
        }

        Btn1.setOnClickListener() {
            viewModel.send(TV_CHANNEL_NUM_1)
        }

        Btn2.setOnClickListener() {
            viewModel.send(TV_CHANNEL_NUM_2)
        }

        Btn3.setOnClickListener() {
            viewModel.send(TV_CHANNEL_NUM_3)
        }

        Btn4.setOnClickListener() {
            viewModel.send(TV_CHANNEL_NUM_4)
        }

        Btn5.setOnClickListener() {
            viewModel.send(TV_CHANNEL_NUM_5)
        }

        Btn6.setOnClickListener() {
            viewModel.send(TV_CHANNEL_NUM_6)
        }

        Btn7.setOnClickListener() {
            viewModel.send(TV_CHANNEL_NUM_7)
        }

        Btn8.setOnClickListener() {
            viewModel.send(TV_CHANNEL_NUM_8)
        }

        Btn9.setOnClickListener() {
            viewModel.send(TV_CHANNEL_NUM_9)
        }

        BtnCHPlus.setOnClickListener() {
            viewModel.send(TV_CHANNEL_UP)
        }

        BtnCHMinus.setOnClickListener() {
            viewModel.send(TV_CHANNEL_DOWN)
        }

        BtnVolPlus.setOnClickListener() {
            viewModel.send(TV_VOLUME_UP)
        }

        BtnVolMinus.setOnClickListener() {
            viewModel.send(TV_VOLUME_DOWN)
        }

        BtnUp.setOnClickListener() {
            viewModel.send(TV_UP)
        }

        BtnDown.setOnClickListener() {
            viewModel.send(TV_DOWN)
        }

        BtnRight.setOnClickListener() {
            viewModel.send(TV_RIGHT)
        }

        BtnLeft.setOnClickListener() {
            viewModel.send(TV_LEFT)
        }

        BtnQuestionMark.setOnClickListener() {
            viewModel.send(TV_QUESTION_MARK)
        }

        BtnPlus.setOnClickListener() {
            viewModel.send(TV_PLUS)
        }

        BtnRevert.setOnClickListener() {
            viewModel.send(TV_RETURN)
        }
    }
}


