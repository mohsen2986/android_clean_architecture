package com.example.cleanarchitecture.framework.db.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.cleanarchitecture.framework.db.entities.BookmarkEntity

@Dao
interface BookmarkDao{
    @Insert(onConflict = REPLACE)
    suspend fun addBookmark(bookmark: BookmarkEntity)

    @Query("SELECT * FROM bookmark_tbl WHERE documentUri = :documentUri")
    suspend fun getBookmarks(documentUri:String) :List<BookmarkEntity>

    @Delete
    suspend fun removeBookmark(bookmark: BookmarkEntity)
}