package com.example.myvolleyball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val allGamesButton = findViewById<Button>(R.id.firstButton)
        val allPlayersButton = findViewById<Button>(R.id.secondButton)
        val allTeamsButton = findViewById<Button>(R.id.thirdButton)
        val resultTableButton = findViewById<Button>(R.id.fourthButton)

        allGamesButton.setOnClickListener {
            val intent = Intent(this, allGamesActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        allPlayersButton.setOnClickListener {
            val intent = Intent(this, allPlayersActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        allTeamsButton.setOnClickListener {
            val intent = Intent(this, allTeamsActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        resultTableButton.setOnClickListener {
            val intent = Intent(this, allResultsActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}