package com.example.tutorial05part2.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity
data class Todo(
    var item: String?
) {
    @PrimaryKey(autoGenerate = true)                 //auto add line when new one created
    var id: Int? = null
}
