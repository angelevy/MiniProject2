package com.angellevyne0045.miniproject2.database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.angellevyne0045.miniproject2.model.Resep

@Database(entities = [Resep::class], version = 2, exportSchema = false)  // Update the version to 3
abstract class ResepDb : RoomDatabase() {
    abstract val dao: ResepDao

    companion object {

        @Volatile
        private var INSTANCE: ResepDb? = null

        fun getInstance(context: Context): ResepDb {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ResepDb::class.java,
                        "resep.db"
                    )
                        .addMigrations(MIGRATION_2_3)
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }

        private val MIGRATION_2_3 = object : Migration(2, 3) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("ALTER TABLE resep ADD COLUMN isDelete INTEGER NOT NULL DEFAULT 0")
                db.execSQL("ALTER TABLE resep ADD COLUMN deleteAt TEXT")
            }
        }
    }
}
