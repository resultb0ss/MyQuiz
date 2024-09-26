package com.example.myquiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myquiz.databinding.ActivityFirstQuestionBinding

class FirstActivityQuestion : AppCompatActivity() {

    private lateinit var binding: ActivityFirstQuestionBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_question)

        binding = ActivityFirstQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firsActivityQuestionAnswerOneRB.setOnClickListener(radioButtonClickListener)
        binding.firsActivityQuestionAnswerTwoRB.setOnClickListener(radioButtonClickListener)
        binding.firsActivityQuestionAnswerThreeRB.setOnClickListener(radioButtonClickListener)



    }

    private val radioButtonClickListener = View.OnClickListener { view ->

        val intent = Intent(this,SrcondQuestionActivity::class.java)
        when (view) {
            binding.firsActivityQuestionAnswerOneRB -> dataExtra(0, intent,1)
            binding.firsActivityQuestionAnswerTwoRB -> dataExtra(0, intent,0)
            binding.firsActivityQuestionAnswerThreeRB -> dataExtra(0, intent,0)
        }
    }

    private fun dataExtra(data: Int, intent: Intent,num:Int) {
        var score = data
        score += num
        intent.putExtra("score", score)
        startActivity(intent)
    }


}