package com.example.cleanarchitecture.framework.db.roomdatasource

import android.content.Context
import com.example.cleanarchitecture.framework.db.ApplicationDatabase
import com.example.cleanarchitecture.framework.db.entities.BookmarkEntity
import com.example.data.dataSource.BookmarkDataSource
import com.example.domain.model.Bookmark
import com.example.domain.model.Document

class RoomBookmarkDataSource(
    val context: Context
):BookmarkDataSource{
    private val bookmarkDao = ApplicationDatabase(context = context).bookmarkDao()
    override suspend fun add(document: Document, bookmark: Bookmark) {
        bookmarkDao.addBookmark(BookmarkEntity(
            documentUri = document.url ,
            pages = bookmark.page
        ))
    }

    override suspend fun read(document: Document): List<Bookmark> =
        bookmarkDao.getBookmarks(documentUri = document.url).map { Bookmark(it.id , it.pages) }

    override suspend fun remove(document: Document, bookmark: Bookmark) =
        bookmarkDao.removeBookmark(
            BookmarkEntity(id = bookmark.id , documentUri = document.url , pages = bookmark.page)
        )


}