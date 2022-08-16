package com.example.myapplicationtest3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val et_number_1 : EditText by lazy{
        findViewById(R.id.et_number_1)
    }
    private val et_number_2 : EditText by lazy{
        findViewById(R.id.et_number_2)
    }
    private val btn_plus : Button by lazy{
        findViewById(R.id.btn_plus)
    }
    private val btn_minus : Button by lazy{
        findViewById(R.id.btn_minus)
    }
    private val btn_multi : Button by lazy{
        findViewById(R.id.btn_multi)
    }
    private val btn_divide : Button by lazy{
        findViewById(R.id.btn_divide)
    }
    private val btn_rest : Button by lazy{
        findViewById(R.id.btn_rest)
    }
    private val tv_result : TextView by lazy{
        findViewById(R.id.tv_result)
    }
    private val btn_init : Button by lazy{
        findViewById(R.id.btn_init)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_plus.setOnClickListener{
            setResultview(1)
        }

        btn_minus.setOnClickListener{
            setResultview(2)
        }

        btn_multi.setOnClickListener{
            setResultview(3)
        }

        btn_divide.setOnClickListener{
            setResultview(4)
        }

        btn_rest.setOnClickListener{
            setResultview(5)
        }

        btn_init.setOnClickListener{
            et_number_1.setText("")  //입력 뷰 초기화
            et_number_2.setText("")
            tv_result.text = ""      //결과 뷰 초기화
        }
    }

    private fun setResultview(o: Int){
        try {
            val num1: Int = et_number_1.text.toString().toInt()
            val num2: Int = et_number_2.text.toString().toInt()
            var numResult : Int = -1
            when(o) {
                1 -> numResult = num1 + num2
                2 -> numResult = num1 - num2
                3 -> numResult = num1 * num2
                4 -> numResult = num1 / num2
                5 -> numResult = num1 % num2
            }
            tv_result.text = numResult.toString()
        } catch (e:Exception){
            Toast.makeText(
                this,"숫자 입력 오류!!",Toast.LENGTH_SHORT).show()
        }
    }
    }

