package `in`.lingaraj.root.utils

import `in`.lingaraj.root.R
import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.os.Build
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

object MarshmallowPermissions {
    const val CAMERA_PERMISSION_REQUEST_CODE = 103
    private val CAMERA_PERMS =
        arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE)

    fun checkPermissionForCamera(activity: Activity): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val result1 =
                ContextCompat.checkSelfPermission(activity, Manifest.permission.CAMERA)
            val result2 = ContextCompat.checkSelfPermission(
                activity,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            )
            (result1 == PackageManager.PERMISSION_GRANTED
                    && result2 == PackageManager.PERMISSION_GRANTED)
        } else {
            true
        }
    }

    fun requestPermissionForCamera(activity: Activity) {
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                activity,
                Manifest.permission.CAMERA
            )
        ) {
            Toast.makeText(
                activity,
                "Camera permission needed. Please allow in App Settings for additional functionality.",
                Toast.LENGTH_LONG
            ).show()
        } else {
            ActivityCompat.requestPermissions(
                activity,
                CAMERA_PERMS,
                CAMERA_PERMISSION_REQUEST_CODE
            )
        }
    }

    fun showPermissionError(activity: Activity) {
        Toast.makeText(
            activity,
            activity.getString(R.string.error_permission_denied),
            Toast.LENGTH_SHORT
        ).show()
    }
}