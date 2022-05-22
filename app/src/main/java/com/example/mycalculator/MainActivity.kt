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
    private var btnAdd : Button? = null
    private var btnDivide : Button? = null
    private var btnMinus : Button? = null
    private var btnMultiply : Button? = null
    private var btnEqual : Button? = null


    private var isLastNumber :Boolean = false
    private var isUsedDot : Boolean = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tvInput = findViewById(R.id.tvInput)

        btnZero = findViewById(R.id.btnZero)
        btnZero?.setOnClickListener(numberBtnClickedListener)
        btnOne = findViewById(R.id.btnOne)
        btnOne?.setOnClickListener(numberBtnClickedListener)
        btnTwo = findViewById(R.id.btnTwo)
        btnTwo?.setOnClickListener(numberBtnClickedListener)
        btnThree = findViewById(R.id.btnThree)
        btnThree?.setOnClickListener(numberBtnClickedListener)
        btnFour = findViewById(R.id.btnFour)
        btnFour?.setOnClickListener(numberBtnClickedListener)
        btnFive = findViewById(R.id.btnFive)
        btnFive?.setOnClickListener(numberBtnClickedListener)
        btnSix = findViewById(R.id.btnSix)
        btnSix?.setOnClickListener(numberBtnClickedListener)
        btnSeven = findViewById(R.id.btnSeven)
        btnSeven?.setOnClickListener(numberBtnClickedListener)
        btnEight = findViewById(R.id.btnEight)
        btnEight?.setOnClickListener(numberBtnClickedListener)
        btnNine = findViewById(R.id.btnNine)
        btnNine?.setOnClickListener(numberBtnClickedListener)


        btnDot = findViewById(R.id.btnDot)
        btnDot?.setOnClickListener(operationBtnClickedListener)

        btnAdd = findViewById(R.id.btnAdd)
        btnAdd?.setOnClickListener(operationBtnClickedListener)
        btnDivide = findViewById(R.id.btnDivide)
        btnDivide?.setOnClickListener(operationBtnClickedListener)
        btnMinus = findViewById(R.id.btnMinus)
        btnMinus?.setOnClickListener(operationBtnClickedListener)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnMultiply?.setOnClickListener(operationBtnClickedListener)
        btnEqual = findViewById(R.id.btnEqual)
        btnEqual?.setOnClickListener(operationBtnClickedListener)

        btnClear = findViewById(R.id.btnClear)
        btnClear?.setOnClickListener(operationBtnClickedListener)

        initInputData()
    }

    private fun initInputData(){
        tvInput?.text = ""
        isUsedDot = false
        isLastNumber = false

    }

    private  fun chkNum(str: String) : Boolean {
        var temp: Char
        var result = true
        for (i in 0 until str.length) {
            temp = str.elementAt(i)
            if (temp.toInt() < 48 || temp.toInt() > 57) {
                result = false
            }
        }
        return result
    }



    private val operationBtnClickedListener: View.OnClickListener = View.OnClickListener {
        if( it.id == R.id.btnClear )
            initInputData()
        else if( it.id == R.id.btnDot ) {
            if(isLastNumber && !isUsedDot ) {
                tvInput?.append((it as Button).text)
                isUsedDot = true
            }else if( tvInput?.text == "" ){
                tvInput?.append( "0" + (it as Button).text )
                isUsedDot = true
            }

        }
        else if( it.id == R.id.btnEqual ){
            var arrayText : CharArray = tvInput?.text.toString().toCharArray()

        }
        else{
            if( isLastNumber ) {
                isUsedDot = false
                tvInput?.append( (it as Button).text)
            }

        }


        isLastNumber = false

    }


    private val numberBtnClickedListener: View.OnClickListener = View.OnClickListener {

        isLastNumber = true
        tvInput?.append((it as Button).text)

    }


}