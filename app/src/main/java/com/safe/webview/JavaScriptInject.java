package com.safe.webview;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JavaScriptInject {
    private Context mContext;

    JavaScriptInject(Context context) {
        this.mContext = context;
    }

    @JavascriptInterface
    public void callAndroid(String string) {
        Toast.makeText(mContext,"javascript call Android", Toast.LENGTH_LONG).show();
        Log.e("JavaScriptInject", "getAndroidInfo " + string);
    }
}
