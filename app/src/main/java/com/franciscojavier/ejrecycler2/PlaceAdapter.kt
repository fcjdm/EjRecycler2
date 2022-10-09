package com.franciscojavier.ejrecycler2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.franciscojavier.ejrecycler2.databinding.ViewPlaceBinding

class PlaceAdapter(val list:List<Place>, val listener: (Place) -> Unit): RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val binding = ViewPlaceBinding.bind(view)
        fun bind(place: Place){
            Glide.with(binding.placeImage)
                .load(place.url)
                .into(binding.placeImage)
            binding.placeName.text = place.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_place, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener{
            listener(list[position])
        }
    }

    override fun getItemCount(): Int = list.size

}