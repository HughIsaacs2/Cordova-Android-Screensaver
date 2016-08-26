package com.acrylicstyle.asmg;

import android.annotation.TargetApi;
import android.service.dreams.DreamService;
import android.webkit.WebView;
@TargetApi(17)
public class MyDreamService extends DreamService {
     @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        // Allow user touch
        setInteractive(true);
        // Hide system UI
        setFullscreen(true);
        // Set the dream layout
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("file:///android_asset/www/screensaver.html");
    }
}