package `in`.lr.base.database

import `in`.lr.base.database.user.User
import `in`.lr.base.database.user.UserDAO
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class],version = 1,exportSchema = false)
 public abstract class AppDatabase: RoomDatabase() {

    companion object{
        const val DATABASE_NAME:String = "LrDatabase"
    }

   abstract fun userDao(): UserDAO
}