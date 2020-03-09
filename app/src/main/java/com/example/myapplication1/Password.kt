package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_password.*

class Password : AppCompatActivity() {

    var passnumber=0
    var numlist =MutableList(4,{i->i})
    val tem_password= mutableListOf<Int>(1,2,3,4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        num0.setOnClickListener {
            getPassword(0)
        }
        num1.setOnClickListener {
            getPassword(1)
        }
        num2.setOnClickListener {
            getPassword(2)
        }
        num3.setOnClickListener {
            getPassword(3)
        }
        num4.setOnClickListener {
            getPassword(4)
        }
        num5.setOnClickListener {
            getPassword(5)
        }
        num6.setOnClickListener {
            getPassword(6)
        }
        num7.setOnClickListener {
            getPassword(7)
        }
        num8.setOnClickListener {
            getPassword(8)
        }
        num9.setOnClickListener {
            getPassword(9)
        }
        backbutton.setOnClickListener {
            removePassword()
        }

    }
    fun getPassword(num:Int){
        numlist[passnumber]=num
        passnumber++
        when(passnumber){
            1->passimage1.setImageResource(android.R.drawable.btn_star_big_on)
            2->passimage2.setImageResource(android.R.drawable.btn_star_big_on)
            3->passimage3.setImageResource(android.R.drawable.btn_star_big_on)
            4-> {
                passimage4.setImageResource(android.R.drawable.btn_star_big_on)
                if (numlist.equals(tem_password))
                    finish()
                else{
                    passnumber = 0
                    passimage1.setImageResource(android.R.drawable.btn_star_big_off)
                    passimage2.setImageResource(android.R.drawable.btn_star_big_off)
                    passimage3.setImageResource(android.R.drawable.btn_star_big_off)
                    passimage4.setImageResource(android.R.drawable.btn_star_big_off)
                }
            }
        }
    }
    fun removePassword(){
        when(passnumber){
            1->passimage1.setImageResource(android.R.drawable.btn_star_big_off)
            2->passimage2.setImageResource(android.R.drawable.btn_star_big_off)
            3->passimage3.setImageResource(android.R.drawable.btn_star_big_off)
        }
        passnumber--
    }
}
