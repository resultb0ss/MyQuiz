package com.example.myquiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myquiz.databinding.ActivityFifthQuestionBinding


class FifthQuestionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFifthQuestionBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_question)

        binding = ActivityFifthQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fifthActivityQuestionAnswerOneRB.setOnClickListener(radioButtonClickListener)
        binding.fifthActivityQuestionAnswerTwoRB.setOnClickListener(radioButtonClickListener)
        binding.fifthActivityQuestionAnswerThreeRB.setOnClickListener(radioButtonClickListener)



    }

    private val radioButtonClickListener = View.OnClickListener { view ->

        val intent = Intent(this,ResultActivity::class.java)
        val intentData = getIntent()
        val data = intentData.getIntExtra("score",0)


        when (view) {
            binding.fifthActivityQuestionAnswerOneRB -> {
                var score = data
                score += 0
                intent.putExtra("score",score)
                startActivity(intent)


            }
            binding.fifthActivityQuestionAnswerTwoRB -> {
                var score = data
                score += 0
                intent.putExtra("score",score)
                startActivity(intent)


            }
            binding.fifthActivityQuestionAnswerThreeRB -> {
                var score = data
                score += 1
                intent.putExtra("score",score)
                startActivity(intent)


            }
        }
    }
}