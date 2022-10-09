package com.franciscojavier.ejrecycler2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.franciscojavier.ejrecycler2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            recycler.adapter = PlaceAdapter(places) {
                    place->
                val intent = Intent(this@MainActivity, MapViewer::class.java)
                intent.putExtra(MapViewer.EXTRA_PLACE, place)
                startActivity(intent)
            }
        }
    }

    private val places =
        listOf(
            Place("Giralda", "1111", "111", "https://loremflickr.com/g/240/320/sevilla"),
            Place("Quini", "1111", "111", "https://loremflickr.com/g/240/320/sevilla"),
            Place("Catedral", "1111", "111", "https://loremflickr.com/g/240/320/sevilla"),

        )
}
