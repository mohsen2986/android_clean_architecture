package com.example.cleanarchitecture.framework.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cleanarchitecture.framework.db.daos.BookmarkDao
import com.example.cleanarchitecture.framework.db.daos.DocumentDao
import com.example.cleanarchitecture.framework.db.entities.BookmarkEntity
import com.example.cleanarchitecture.framework.db.entities.DocumentEntity

@Database(
    entities = [BookmarkEntity::class , DocumentEntity::class] ,
    version = 1 ,
    exportSchema = false
)
abstract class ApplicationDatabase:RoomDatabase(){
    abstract fun bookmarkDao(): BookmarkDao
    abstract fun documentDao(): DocumentDao

    companion object {
        private const val DATABASE_NAME = "reader.db"
        @Volatile
        private var instance: ApplicationDatabase? = null
        private val LOCK = Any()
        operator fun invoke(context: Context) =
            instance ?: synchronized(LOCK) {
                instance ?: buildDatabase(context).also { instance = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context,
                ApplicationDatabase::class.java,
                DATABASE_NAME
            ).build()
    }

}