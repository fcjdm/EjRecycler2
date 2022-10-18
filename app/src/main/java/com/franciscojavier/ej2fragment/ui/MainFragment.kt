package com.franciscojavier.ej2fragment.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.franciscojavier.ej2fragment.model.Place
import com.franciscojavier.ej2fragment.R
import com.franciscojavier.ej2fragment.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)


        val binding = FragmentMainBinding.bind(view).apply {
            recycler.adapter = PlaceAdapter(places) {
                    place->
                val gmmIntentUri = Uri.parse("geo:"+place.latitud+","+place.longitud)
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                val packageManager = requireActivity().packageManager
                mapIntent.resolveActivity(packageManager)?.let {
                    startActivity(mapIntent)
                }
            }
        }
        (requireActivity() as AppCompatActivity).supportActionBar?.title = getString(R.string.app_name)
    }

    private val places =
        listOf(
            Place("Giralda", "37.38614", "-5.99238", "https://loremflickr.com/240/320/giralda_sevilla"),
            Place("Museo Prado", "40.41390431035264", "-3.692105644047252", "https://loremflickr.com/240/320/museo,prado"),
            Place("Alcazar Toledo", "39.8578944888275", "-4.020571303580541", "https://loremflickr.com/240/320/alcazar,toledo"),
            Place("Acueducto Segovia", "40.94804344250887", "-4.117750760345476", "https://loremflickr.com/240/320/acueducto,segovia"),
            Place("Mezquita Cordoba", "37.879058010314026", "-4.7793010710932675", "https://loremflickr.com/240/320/mezquita,cordoba"),
            Place("Alhambra Granada", "37.17626628307758", "-3.588034026341552", "https://loremflickr.com/240/320/alhambra,granada"),

        )
}
