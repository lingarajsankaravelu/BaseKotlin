package `in`.lr.base.di

import `in`.lr.base.wrappers.SharedPreference
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ApplicationComponent::class)
object PreferenceModule {

    @Provides
    fun appPreferences(@ApplicationContext context: Context): SharedPreference {
      return SharedPreference(context);
    }

}