package com.example.laconchaannexresturant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class MainActivity extends AppCompatActivity {

    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mywebView=(WebView) findViewById(R.id.webview);
        mywebView.setWebViewClient(new WebViewClient());

        mywebView.loadUrl("https://itsmichaeell.github.io/LaConchaResturant.App/");
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}