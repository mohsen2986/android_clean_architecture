package com.example.cleanarchitecture.framework.db.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.cleanarchitecture.framework.db.entities.DocumentEntity
import com.example.domain.model.Document

@Dao
interface  DocumentDao{
    @Insert(onConflict = REPLACE)
    suspend fun addDocument(document: DocumentEntity)

    @Query("SELECT * FROM document_tbl")
    suspend fun getDocument():List<DocumentEntity>

    @Delete
    suspend fun removeDocument(document:DocumentEntity)
}