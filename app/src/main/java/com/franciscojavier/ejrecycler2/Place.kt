package com.franciscojavier.ejrecycler2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Place(val name: String, val latitud: String, val longitud: String, val url: String):Parcelable {
}