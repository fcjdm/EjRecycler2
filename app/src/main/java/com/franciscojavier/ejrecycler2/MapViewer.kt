package com.franciscojavier.ejrecycler2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.franciscojavier.ejrecycler2.databinding.ActivityMapViewerBinding
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapViewer : AppCompatActivity(), OnMapReadyCallback {
    companion object{
        const val EXTRA_PLACE = "place"
    }

    private lateinit var binding: ActivityMapViewerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapViewerBinding.inflate(layoutInflater).apply{
            setContentView(binding.root)

            val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
            mapFragment.getMapAsync(this@MapViewer)

        }


    }

    override fun onMapReady(googleMap: GoogleMap) {
        googleMap.addMarker(
            MarkerOptions()
                .position(LatLng(0.0, 0.0))
                .title("Marker")
        )
    }
}