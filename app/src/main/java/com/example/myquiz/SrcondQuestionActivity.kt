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
            binding.secondActivityQuestionAnswerOneRB -> dataExtra(data, intentMain,0)
            binding.secondActivityQuestionAnswerTwoRB -> dataExtra(data, intentMain,1)
            binding.secondActivityQuestionAnswerThreeRB -> dataExtra(data, intentMain,0)
        }
    }

    private fun dataExtra(data: Int, intent: Intent,num:Int) {
        var score = data
        score += num
        intent.putExtra("score", score)
        startActivity(intent)
    }


}