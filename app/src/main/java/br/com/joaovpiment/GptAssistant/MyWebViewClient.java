package br.com.joaovpiment.GptAssistant;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        String hostname;

        // YOUR HOSTNAME
        hostname = "br.com.joaovpiment.GptAssistant";

        Uri uri = Uri.parse(url);
        if (url.startsWith("file:") || uri.getHost() != null //&& uri.getHost().endsWith(hostname)
         ) {
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}
