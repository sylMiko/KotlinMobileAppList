package pl.edu.wat.tpid.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonalTrainer(
    val firstName: String,
    val lastName: String,
    val phone: String,
    val address: String,
    val age: Int,
    val certificates: List<Certificate>
) : Parcelable
