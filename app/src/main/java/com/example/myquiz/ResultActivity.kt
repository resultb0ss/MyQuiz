package com.example.myquiz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myquiz.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentData = getIntent()
        val data = intentData.getIntExtra("score",0)
        binding.resultActivityScoreTextTV.text = "Верных ответов: ${data}"

        when(data){
            in 0..2 -> binding.resulDescriptionTV.text = "Вам необходимо улучшить знания по истории"
            in 3..4 -> binding.resulDescriptionTV.text = "Ваши знания по истории удовлетворительные"
            5 -> binding.resulDescriptionTV.text = "Вы специалист в области истории"
            else -> binding.resulDescriptionTV.text = "Ошибка"
        }

    }
}