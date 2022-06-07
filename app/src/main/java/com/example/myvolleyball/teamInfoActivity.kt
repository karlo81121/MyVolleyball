package com.example.myvolleyball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class teamInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_info)

        supportFragmentManager.beginTransaction().add(R.id.teamInfo, teamFragment()).commit()
    }

    override fun finish(){
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}