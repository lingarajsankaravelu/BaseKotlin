package `in`.lr.base.wrappers

import android.content.Context
import android.content.SharedPreferences

public class SharedPreference constructor(context:Context) {
    val preferenceName = "lrPreference"
     var preference:SharedPreferences

    companion object {
        val LOGGED_IN = "LOGGED_IN"
    }

    init {
        preference = context.getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    }

    public fun loggedIn(logged:Boolean) { preference.edit().putBoolean(LOGGED_IN,logged).apply() }

    public fun isLoggedIn():Boolean{ return preference.getBoolean(LOGGED_IN,false)}

}