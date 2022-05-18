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
    private var btnDot : Button? = null
    private var btnClear : Button? = null

    private var isLastNumber :Boolean = false
    private var isUsedDot : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)

        btnZero = findViewById(R.id.btnZero)
        btnZero?.setOnClickListener(numberlicBtnClickedListener)
        btnOne = findViewById(R.id.btnOne)
        btnOne?.setOnClickListener(numberlicBtnClickedListener)
        btnTwo = findViewById(R.id.btnTwo)
        btnTwo?.setOnClickListener(numberlicBtnClickedListener)
        btnThree = findViewById(R.id.btnThree)
        btnThree?.setOnClickListener(numberlicBtnClickedListener)
        btnFour = findViewById(R.id.btnFour)
        btnFour?.setOnClickListener(numberlicBtnClickedListener)
        btnFive = findViewById(R.id.btnFive)
        btnFive?.setOnClickListener(numberlicBtnClickedListener)
        btnSix = findViewById(R.id.btnSix)
        btnSix?.setOnClickListener(numberlicBtnClickedListener)
        btnSeven = findViewById(R.id.btnSeven)
        btnSeven?.setOnClickListener(numberlicBtnClickedListener)
        btnEight = findViewById(R.id.btnEight)
        btnEight?.setOnClickListener(numberlicBtnClickedListener)
        btnNine = findViewById(R.id.btnNine)
        btnNine?.setOnClickListener(numberlicBtnClickedListener)


        btnDot = findViewById(R.id.btnDot)
        btnDot?.setOnClickListener(operationBtnClickedListener)

        btnClear = findViewById(R.id.btnClear)
        btnClear?.setOnClickListener(operationBtnClickedListener)

        initInputData()
    }

    private fun initInputData(){
        tvInput?.text = ""
        isUsedDot = false
    }

    private val operationBtnClickedListener: View.OnClickListener = View.OnClickListener {
        if( it.id == R.id.btnClear )
            initInputData()
        else if( it.id == R.id.btnDot ) {
            if(isLastNumber && isUsedDot ) {
                tvInput?.append((it as Button).text)
                isUsedDot = true
            }else if( tvInput?.text == "" )
                tvInput?.append( "0" + (it as Button).text)
        }

        isLastNumber = false

    }


    private val numberlicBtnClickedListener: View.OnClickListener = View.OnClickListener {

        isLastNumber = true
        tvInput?.append((it as Button).text)


    }


}