package pl.edu.wat.tpid.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Certificate(
    val name: String,
    val type: String,
    val date: String
) : Parcelable