package com.franciscojavier.ejrecycler2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.franciscojavier.ejrecycler2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            /*recycler.adapter = PlaceAdapter(places) {
                    place->
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_PERSON, person)
                startActivity(intent)
            }*/
        }
    }

    private val places =
        listOf(
            Place("Giralda", "1111", "111", "132131")
        )
}
