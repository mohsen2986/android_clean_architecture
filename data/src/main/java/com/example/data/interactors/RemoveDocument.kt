package com.example.data.interactors

import com.example.data.repository.DocumentRepository
import com.example.domain.model.Document

class RemoveDocument(
    private val documentRepository: DocumentRepository
){
    suspend operator fun invoke(document: Document) =
        documentRepository.removeDocument(document= document)
}