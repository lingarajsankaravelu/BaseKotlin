package `in`.lingaraj.root.utils

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

object ToastHelpers {

    fun Activity.shortToast(@StringRes resource:Int) {
        Toast.makeText(
            this,
            this.getString(resource),
            Toast.LENGTH_SHORT
        ).show()
    }


    fun Activity.longToast(@StringRes resource:Int) {
        Toast.makeText(
            this,
            this.getString(resource),
            Toast.LENGTH_LONG
        ).show()
    }


    fun Context.shortToast(@StringRes resource: Int) {
        Toast.makeText(
            this,
            this.getString(resource),
            Toast.LENGTH_SHORT
        ).show()
    }


    fun Context.longToast(@StringRes resource:Int) {
        Toast.makeText(
            this,
            this.getString(resource),
            Toast.LENGTH_LONG
        ).show()
    }

}