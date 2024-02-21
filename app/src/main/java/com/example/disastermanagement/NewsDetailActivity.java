package com.example.disastermanagement;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NewsDetailActivity extends AppCompatActivity {

    public static final String EXTRA_URL = "extra_url";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(EXTRA_URL)) {
            String url = intent.getStringExtra(EXTRA_URL);
            WebView webView = findViewById(R.id.webView);
            webView.loadUrl(url);
        }
    }
}