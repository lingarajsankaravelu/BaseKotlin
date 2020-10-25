package `in`.lingaraj.root.di

import `in`.lingaraj.root.database.AppDatabase
import android.content.Context
import androidx.room.Room
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