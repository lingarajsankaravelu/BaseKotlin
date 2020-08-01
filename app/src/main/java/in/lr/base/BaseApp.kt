package `in`.lr.base

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber


@HiltAndroidApp
class BaseApp: Application() {

    override fun onCreate() {
        super.onCreate()
        setUpTimber()



    }

    private fun setUpTimber() {
        if (BuildConfig.DEBUG){ Timber.plant(Timber.DebugTree())}
        else {TimberRelease()}
        Timber.d("Timber setup Done")

    }

    class TimberRelease : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        }
    }

}