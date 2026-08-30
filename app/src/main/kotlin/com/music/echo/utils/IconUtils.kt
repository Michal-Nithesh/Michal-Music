

package iad1tya.echo.music.utils

import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager

object IconUtils {
    fun setIcon(context: Context, isDynamic: Boolean, isLegacy: Boolean) {
        val pm = context.packageManager
        val dynamic = ComponentName(context, "iad1tya.echo.music.MainActivityAlias")

        pm.setComponentEnabledSetting(
            dynamic,
            if (isDynamic && !isLegacy) PackageManager.COMPONENT_ENABLED_STATE_ENABLED else PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
            PackageManager.DONT_KILL_APP
        )
    }
}
