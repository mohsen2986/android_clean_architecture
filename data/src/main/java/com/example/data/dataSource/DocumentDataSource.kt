package com.example.data.dataSource

import com.example.domain.model.Document


interface DocumentDataSource{
    suspend fun add(document : Document)

    suspend fun readAll():List<Document>

    suspend fun remove(document :Document)
}