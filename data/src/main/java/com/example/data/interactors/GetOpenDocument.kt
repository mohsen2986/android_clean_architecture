package com.example.data.interactors

import com.example.data.repository.DocumentRepository

class GetOpenDocument(
    private val documentRepository: DocumentRepository
){
    operator fun invoke() =
        documentRepository.getOpenDocument()
}