package com.lordofcomputers.kuranikerim;
// Kur'an-ı Kerim — © 2026 Umut Günay (Lord of Computers). Tüm hakları saklıdır.
import android.app.Activity; import android.graphics.Color; import android.os.Bundle;
import android.webkit.WebSettings; import android.webkit.WebView; import android.webkit.WebViewClient;
public class MainActivity extends Activity {
    WebView w;
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        getWindow().setStatusBarColor(Color.parseColor("#06121A"));
        getWindow().setNavigationBarColor(Color.parseColor("#0A1C27"));
        w = new WebView(this); setContentView(w);
        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
        s.setMediaPlaybackRequiresUserGesture(false); s.setAllowFileAccess(true);
        w.setBackgroundColor(Color.parseColor("#06121A"));
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() { if (w.canGoBack()) w.goBack(); else super.onBackPressed(); }
}
