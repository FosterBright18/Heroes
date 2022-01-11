package com.foster.heroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foster.heroes.databinding.ActivityHeroesListBinding

class HeroesListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHeroesListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeroesListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: make a Hero.kt model class
        // TODO: load the hroes.json into List<Hero> using Gson
        // TODO: make an item_hero.xml lAYOUT FILE IN THE LAYOUT FOLDER

    }
}