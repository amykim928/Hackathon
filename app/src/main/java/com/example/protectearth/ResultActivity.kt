package com.example.protectearth

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity  : AppCompatActivity() {
    private lateinit var data: Data
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)
        val recognition = intent.getIntExtra("recognition", 0)
        val professional = intent.getIntExtra("professional", 0)
        val active = intent.getIntExtra("active", 0)
        val steady = intent.getIntExtra("steady", 0)
        data = Data(recognition, professional, active, steady)
        Log.d("result", "recognition: " + recognition + ", professional: " + professional + ", active: " + active + ", steady" + steady)

        val titleResult = findViewById<TextView>(R.id.titleResult)
        val nameResult = findViewById<TextView>(R.id.nameResult)
        val detailResult = findViewById<TextView>(R.id.detailResult)
        val firstTag = findViewById<TextView>(R.id.firstTag)
        val secondTag = findViewById<TextView>(R.id.secondTag)
        val thirdTag = findViewById<TextView>(R.id.thirdTag)
        val recText1 = findViewById<TextView>(R.id.recText1)
        val recText2 = findViewById<TextView>(R.id.recText2)
        val recText3 = findViewById<TextView>(R.id.recText3)
        val homeBtn = findViewById<Button>(R.id.homeBtn)
        if(data.recognition+data.active>=6){
            titleResult.text = "지구는 내가 지킨다"
            nameResult.text = "환경지킴이"
            detailResult.text = "환경 보호에 대한 관심이 많고 적극적으로 실천하려 하는 유형으로 다른 사람에게 긍정적인 영향을 주는 사람."
            firstTag.text = "#적극적"
            secondTag.text = "#긍정"
            thirdTag.text = "#지킴이"
            recText1.text = "쓰레기 줍기"
            recText2.text = "환경보호 중요성 알리기"
            recText3.text = "일회용품 사용 줄이기"

        } else if (data.steady == 3){
            titleResult.text = "꾸준함도 하나의 무기"
            nameResult.text = "환경보호 꾸준형"
            detailResult.text = "다른 사람의 영향을 덜 받으며 스스로 꾸준히 사소한 것 부터 실천하는 유형, 외부 활동을 통한 다양한 환경보호 실천이 필요한 사람."
            firstTag.text = "#꾸준"
            secondTag.text = "#스스로"
            thirdTag.text = "#사소한"
            recText1.text = "환경보호 캠페인 참여하기"
            recText2.text = "음식물 쓰레기 잘 버리기"
            recText3.text = "대중교통 이용하기"
        } else if (data.recognition+data.active+data.steady+data.professional<=5){
            titleResult.text = "지금부터 시작"
            nameResult.text = "환경보호 새싹이"
            detailResult.text = "환경문제의 관심과 적극적인 실천 태도가 필요한 유형으로 실생활에서 가능한 사소한 환경보호 실천을 중심으로 발전해야 하는 사람."
            firstTag.text = "#초보"
            secondTag.text = "#지식"
            thirdTag.text = "#걸음마"
            recText1.text = "걸어가기"
            recText2.text = "쓰레기 줍기"
            recText3.text = "분리수거 잘 하기"
        }
        homeBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}