package org.diql.demoandroid.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by diql on 2016/10/14.
 */
public class ApkUtils {
    private static final String TAG = ApkUtils.class.getSimpleName();

    public static String getApkInfo(Context context, String apkPath) {
        String versionName = null;
        PackageManager pm = context.getPackageManager();
        PackageInfo info = pm.getPackageArchiveInfo(apkPath, PackageManager.GET_ACTIVITIES);
        if (info != null) {
            versionName = info.versionName;
        }
        return versionName;
    }
}
