package com.example.myquiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myquiz.databinding.ActivitySrcondQuestionBinding

class SrcondQuestionActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySrcondQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_srcond_question)

        binding = ActivitySrcondQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.secondActivityQuestionAnswerTwoRB.setOnClickListener(radioButtonClickListener)
        binding.secondActivityQuestionAnswerOneRB.setOnClickListener(radioButtonClickListener)
        binding.secondActivityQuestionAnswerThreeRB.setOnClickListener(radioButtonClickListener)





    }

    private val radioButtonClickListener = View.OnClickListener { view ->

        val intentMain = Intent(this,ThirdQuestionActivity::class.java)

        val intentData = getIntent()
        val data = intentData.getIntExtra("score",0)



        when (view) {
            binding.secondActivityQuestionAnswerOneRB -> {
                var score = data
                score += 0
                intentMain.putExtra("score",score)
                startActivity(intentMain)



            }
            binding.secondActivityQuestionAnswerTwoRB -> {
                var score = data
                score += 1
                intentMain.putExtra("score",score)
                startActivity(intentMain)



            }
            binding.secondActivityQuestionAnswerThreeRB -> {
                var score = data
                score += 0
                intentMain.putExtra("score",score)
                startActivity(intentMain)


            }
        }
    }
}