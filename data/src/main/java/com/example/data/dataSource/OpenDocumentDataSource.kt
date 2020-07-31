package com.example.data.dataSource

import com.example.domain.model.Document


interface OpenDocumentDataSource{
    fun setOpenDocument(document: Document)

    fun getOpenDocument():Document
}