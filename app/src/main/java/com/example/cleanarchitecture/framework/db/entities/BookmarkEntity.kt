package com.example.cleanarchitecture.framework.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bookmark_tbl")
data class BookmarkEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0 ,
    @ColumnInfo(name = "documentUri")
    val documentUri:String  ,
    @ColumnInfo(name = "page")
    val pages:Int = 0
)