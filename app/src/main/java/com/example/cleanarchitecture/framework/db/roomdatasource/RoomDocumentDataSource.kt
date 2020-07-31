package com.example.cleanarchitecture.framework.db.roomdatasource

import android.content.Context
import com.example.cleanarchitecture.framework.db.ApplicationDatabase
import com.example.data.dataSource.DocumentDataSource
import com.example.domain.model.Document
import com.example.cleanarchitecture.framework.db.FileUtil
import com.example.cleanarchitecture.framework.db.entities.DocumentEntity

class RoomDocumentDataSource(
    val context: Context
):DocumentDataSource{
    private val documentDao = ApplicationDatabase(context).documentDao()

    override suspend fun add(document: Document) {
        val details = FileUtil.getDocumentDetails(context , document.url)
        documentDao.addDocument(
            DocumentEntity(document.url , details.name , document.size , document.thumbnail)
        )
    }

    override suspend fun readAll(): List<Document> =
        documentDao.getDocument().map {
            Document(
                it.uri ,
                it.title ,
                it.size ,
                it.thumbnailUri
            )
        }

    override suspend fun remove(document: Document) =
        documentDao.removeDocument(
            DocumentEntity(document.url , document.name , document.size , document.thumbnail)
        )
}