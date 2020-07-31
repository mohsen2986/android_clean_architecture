package com.example.data.interactors

import com.example.data.repository.BookmarkRepository
import com.example.domain.model.Document

class GetBookmarks(
    private val bookmarkRepository: BookmarkRepository
){
    suspend operator fun invoke(document: Document) =
        bookmarkRepository.getBookmark(document= document)
}