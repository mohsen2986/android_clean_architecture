package com.example.cleanarchitecture.framework.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "document_tbl")
data class DocumentEntity(
    @PrimaryKey
    val uri:String ,
    @ColumnInfo( name = "title")
    val title:String ,
    @ColumnInfo( name = "size")
    val size:Int ,
    @ColumnInfo(name = "thumbnail_uri")
    val thumbnailUri:String
)