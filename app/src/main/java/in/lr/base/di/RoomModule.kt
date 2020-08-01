package `in`.lr.base.di

import `in`.lr.base.database.AppDatabase
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun roomDatabase(@ApplicationContext context: Context):AppDatabase{
       return Room.databaseBuilder(context,AppDatabase::class.java,AppDatabase.DATABASE_NAME)
           .allowMainThreadQueries().build()

    }
}