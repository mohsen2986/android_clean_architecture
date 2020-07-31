package com.example.data.repository

import com.example.data.dataSource.DocumentDataSource
import com.example.data.dataSource.OpenDocumentDataSource
import com.example.domain.model.Document

class DocumentRepository(
    private val documentDataSource: DocumentDataSource,
    private val openDocumentDataSource: OpenDocumentDataSource
    ){
    suspend fun addDocument(document: Document) =
        documentDataSource.add(document= document)

    suspend fun getDocument() =
        documentDataSource.readAll()

    suspend fun removeDocument(document: Document) =
        documentDataSource.remove(document= document)

    fun setOpenDocument(document: Document) =
        openDocumentDataSource.setOpenDocument(document= document)

    fun getOpenDocument() =
        openDocumentDataSource.getOpenDocument()

}