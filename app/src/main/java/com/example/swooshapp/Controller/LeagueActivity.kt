package com.example.swooshapp.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swooshapp.Model.Player
import com.example.swooshapp.R
/*import com.example.swooshapp.Utilities.EXTRA_LEAGUE*/
import com.example.swooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {


    var player = Player("", "")
        /*private lateinit var womensLeagueBtn: ToggleButton
        private lateinit var coedLeagueBtn: ToggleButton
        private lateinit var mensLeagueBtn: ToggleButton*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        /*womensLeagueBtn = findViewById(R.id.womensLeagueBtn)
        coedLeagueBtn =  findViewById(R.id.coedLeagueBtn)
        mensLeagueBtn =  findViewById(R.id.mensLeagueBtn)*/
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }




}