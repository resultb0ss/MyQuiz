package com.example.myquiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myquiz.databinding.ActivityFourthQuestionBinding


class FourthQuestionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fourth_question)


        binding = ActivityFourthQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fourthActivityQuestionAnswerOneRB.setOnClickListener(radioButtonClickListener)
        binding.fourthActivityQuestionAnswerTwoRB.setOnClickListener(radioButtonClickListener)
        binding.fourthActivityQuestionAnswerThreeRB.setOnClickListener(radioButtonClickListener)

    }

    private val radioButtonClickListener = View.OnClickListener { view ->

        val intent = Intent(this,FifthQuestionActivity::class.java)
        val intentData = getIntent()
        val data = intentData.getIntExtra("score",0)

        when (view) {
            binding.fourthActivityQuestionAnswerOneRB -> dataExtra(data, intent,0)
            binding.fourthActivityQuestionAnswerTwoRB -> dataExtra(data, intent,1)
            binding.fourthActivityQuestionAnswerThreeRB -> dataExtra(data, intent,0)
        }
    }

    private fun dataExtra(data: Int, intent: Intent,num:Int) {
        var score = data
        score += num
        intent.putExtra("score", score)
        startActivity(intent)
    }
}