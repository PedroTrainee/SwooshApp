package com.example.swooshapp.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.swooshapp.Model.Player
import com.example.swooshapp.R
import com.example.swooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player?.league} ${player?.skill} league near you..."
    }
}