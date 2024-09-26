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
            binding.thirdActivityQuestionAnswerOneRB -> {
                var score = data
                score += 0
                intentMain.putExtra("score",score)
                startActivity(intentMain)


            }
            binding.thirdActivityQuestionAnswerTwoRB -> {
                var score = data
                score += 0
                intentMain.putExtra("score",score)
                startActivity(intentMain)


            }
            binding.thirdActivityQuestionAnswerThreeRB -> {
                var score = data
                score += 1
                intentMain.putExtra("score",score)
                startActivity(intentMain)


            }
        }
    }

}