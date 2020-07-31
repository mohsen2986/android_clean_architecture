package com.example.data.interactors

import com.example.data.repository.DocumentRepository
import com.example.domain.model.Document

class SetOpenDocument(
    private val documentRepository: DocumentRepository
){
    operator fun invoke(document: Document) =
        documentRepository.setOpenDocument(document= document)
}