package com.example.cleanarchitecture.framework.db.datasource

import com.example.data.dataSource.OpenDocumentDataSource
import com.example.domain.model.Document

class InMemoryOpenDocumentDataSource(): OpenDocumentDataSource {

    private var openDocument:Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
        openDocument = document
    }

    override fun getOpenDocument(): Document = openDocument

}