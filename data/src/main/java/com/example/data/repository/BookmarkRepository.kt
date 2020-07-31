package com.example.data.repository

import com.example.data.dataSource.BookmarkDataSource
import com.example.domain.model.Bookmark
import com.example.domain.model.Document

class BookmarkRepository(
    private val dataSource: BookmarkDataSource
){
    suspend fun addBookmark(document: Document, bookmark:Bookmark) =
        dataSource.add(document = document , bookmark = bookmark)

    suspend fun getBookmark(document:Document) =
        dataSource.read(document = document)

    suspend fun removeBookmark(document: Document , bookmark: Bookmark) =
        dataSource.remove(document = document , bookmark = bookmark)
}