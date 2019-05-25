package com.example.g5_week6.ROOM


import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
@Entity
class Task (
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var description: String,
    var completed: Boolean,
    var userid: String): Parcelable {
    constructor():this(null,"",false,"")
}