package com.example.data.interactors

import com.example.data.repository.DocumentRepository
import com.example.domain.model.Document

class AddDocument(
    private val documentRepository: DocumentRepository
){
    suspend operator fun invoke(document: Document) =
        documentRepository.addDocument(document= document)
}