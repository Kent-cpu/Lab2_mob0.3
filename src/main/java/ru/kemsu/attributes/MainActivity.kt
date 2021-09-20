package ru.kemsu.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.black_text_btn).setOnClickListener{
            findViewById<EditText>(R.id.edit_text).setTextColor(Color.BLACK);
        }

        findViewById<Button>(R.id.red_text_btn).setOnClickListener{
            findViewById<EditText>(R.id.edit_text).setTextColor(Color.RED);
        }

        findViewById<Button>(R.id.size_8sp_btn).setOnClickListener{
            findViewById<EditText>(R.id.edit_text).setTextSize(8F)
        }

        findViewById<Button>(R.id.size_24sp_btn).setOnClickListener{
            findViewById<EditText>(R.id.edit_text).setTextSize(24F)
        }

        findViewById<Button>(R.id.background_white_btn).setOnClickListener{
            findViewById<EditText>(R.id.edit_text).setBackgroundColor(Color.WHITE)
        }

        findViewById<Button>(R.id.background_yellow_btn).setOnClickListener{
            findViewById<EditText>(R.id.edit_text).setBackgroundColor(Color.YELLOW)
        }
    }
}