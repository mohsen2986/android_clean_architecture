package com.example.data.dataSource

import com.example.domain.model.Bookmark
import com.example.domain.model.Document


interface BookmarkDataSource{
    suspend fun add(document : Document, bookmark : Bookmark)

    suspend fun read(document :Document):List<Bookmark>

    suspend fun remove(document :Document , bookmark: Bookmark)
}