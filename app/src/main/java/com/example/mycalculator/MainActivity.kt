package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    private var tvInput : TextView? = null

    //숫자 버튼
    private var btnZero : Button? = null
    private var btnOne : Button? = null
    private var btnTwo : Button? = null
    private var btnThree : Button? = null
    private var btnFour : Button? = null
    private var btnFive : Button? = null
    private var btnSix : Button? = null
    private var btnSeven : Button? = null
    private var btnEight : Button? = null
    private var btnNine : Button? = null

    //그외
    private var btnClear : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)
        btnZero = findViewById(R.id.btnZero)
        btnZero?.setOnClickListener(clickedListener)

        btnOne = findViewById(R.id.btnOne)
        btnOne?.setOnClickListener(clickedListener)
        btnTwo = findViewById(R.id.btnTwo)
        btnTwo?.setOnClickListener(clickedListener)
        btnThree = findViewById(R.id.btnThree)
        btnThree?.setOnClickListener(clickedListener)
        btnFour = findViewById(R.id.btnFour)
        btnFour?.setOnClickListener(clickedListener)
        btnFive = findViewById(R.id.btnFive)
        btnFive?.setOnClickListener(clickedListener)
        btnSix = findViewById(R.id.btnSix)
        btnSix?.setOnClickListener(clickedListener)
        btnSeven = findViewById(R.id.btnSeven)
        btnSeven?.setOnClickListener(clickedListener)
        btnEight = findViewById(R.id.btnEight)
        btnEight?.setOnClickListener(clickedListener)
        btnNine = findViewById(R.id.btnNine)
        btnNine?.setOnClickListener(clickedListener)
        btnClear = findViewById(R.id.btnClear)
        btnClear?.setOnClickListener(clickedListener)

        initInputData()
    }

    private fun initInputData(){
        tvInput?.text = ""
    }

    private val clickedListener: View.OnClickListener = View.OnClickListener {
        if( it.id == R.id.btnClear )
            initInputData()
        else
            tvInput?.append((it as Button).text)

    }


}