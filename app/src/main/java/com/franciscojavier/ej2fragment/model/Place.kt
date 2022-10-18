package com.franciscojavier.ej2fragment.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Place(val name: String, val latitud: String, val longitud: String, val url: String):Parcelable {
}