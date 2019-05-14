package org.midori_browser.midori

import android.app.Activity
import android.content.Context
import android.support.v4.app.ActivityCompat
import android.Manifest
import android.content.pm.PackageManager

class PermissionCheck{

    fun readAndWriteExternalStorage(context: Context): Boolean{
        if (ActivityCompat.checkSelfPermission(context,Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
            || ActivityCompat.checkSelfPermission(context,Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
                {
            ActivityCompat.requestPermissions(context as Activity, Array<String?>(3){Manifest.permission.WRITE_EXTERNAL_STORAGE; Manifest.permission.READ_EXTERNAL_STORAGE},1 )
            return false
        }else{
            return true
        }
    }

}