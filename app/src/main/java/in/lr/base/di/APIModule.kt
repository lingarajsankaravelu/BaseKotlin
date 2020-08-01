package `in`.lr.base.di

import `in`.lr.base.api.BaseRouter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object APIModule {

    @Provides
    @Singleton
    fun baseRouter(retrofit: Retrofit): BaseRouter { return retrofit.create(BaseRouter::class.java)}
}