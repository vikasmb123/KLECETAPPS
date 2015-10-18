package com.example.gadds.klecetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Transportation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation);
        WebView web= (WebView) findViewById(R.id.WebViewCollege);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("https://www.klescet.ac.in/transport.html");
    }
}
