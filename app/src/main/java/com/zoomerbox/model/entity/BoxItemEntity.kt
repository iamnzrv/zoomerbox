package com.zoomerbox.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BoxItemEntity(
    @PrimaryKey(autoGenerate = true) var id: Long,
    var name: String,
    var description: String,
    var imageUrls: List<String>
)
