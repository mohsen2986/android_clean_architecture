package com.example.data.interactors

import com.example.data.repository.DocumentRepository

class GetDocuments(
    private val documentRepository: DocumentRepository
){
    suspend operator fun invoke() =
        documentRepository.getDocument()
}