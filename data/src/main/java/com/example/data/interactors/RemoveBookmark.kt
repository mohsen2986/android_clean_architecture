package com.example.data.interactors

import com.example.data.repository.BookmarkRepository
import com.example.domain.model.Bookmark
import com.example.domain.model.Document

class RemoveBookmark(
    private val bookmarkRepository: BookmarkRepository
){
    suspend operator fun invoke(document: Document, bookmark:Bookmark) =
        bookmarkRepository.removeBookmark(document= document , bookmark= bookmark)
}