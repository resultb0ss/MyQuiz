package com.example.myquiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import com.example.myquiz.databinding.ActivityThirdQuestionBinding

class ThirdQuestionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_question)

        binding = ActivityThirdQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.thirdActivityQuestionAnswerOneRB.setOnClickListener(radioButtonClickListener)
        binding.thirdActivityQuestionAnswerTwoRB.setOnClickListener(radioButtonClickListener)
        binding.thirdActivityQuestionAnswerThreeRB.setOnClickListener(radioButtonClickListener)




    }

    private val radioButtonClickListener = View.OnClickListener { view ->

        val intentMain = Intent(this,FourthQuestionActivity::class.java)
        val intentData = getIntent()
        val data = intentData.getIntExtra("score",0)

        when (view) {
            binding.thirdActivityQuestionAnswerOneRB -> dataExtra(data, intentMain,0)
            binding.thirdActivityQuestionAnswerTwoRB -> dataExtra(data, intentMain,0)
            binding.thirdActivityQuestionAnswerThreeRB -> dataExtra(data, intentMain,1)
        }
    }

    private fun dataExtra(data: Int, intent: Intent,num:Int) {
        var score = data
        score += num
        intent.putExtra("score", score)
        startActivity(intent)
    }

}