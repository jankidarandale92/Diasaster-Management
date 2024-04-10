package com.example.disastermanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Alert extends AppCompatActivity {

    private static final String BASE_URL = "https://newsapi.org/v2/";
    private static final String API_KEY = "00d3586849ee4090842e6a0564475c52";

    private ListView listView;
    private NewsAdapter adapter;
    private List<Article> articles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        // Subscribe to the "news" topic for receiving notifications
        FirebaseMessaging.getInstance().subscribeToTopic("news");

        listView = findViewById(R.id.listView);
        articles = new ArrayList<>();
        adapter = new NewsAdapter(this, articles);
        listView.setAdapter(adapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NewsService service = retrofit.create(NewsService.class);
        Call<NewsResponse> call = service.getDisasterNews(API_KEY, "disaster", "publishedAt");

        call.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    articles = response.body().getArticles();
                    adapter.addAll(articles);
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                // Handle failure
            }
        });
    }

    private class NewsAdapter extends ArrayAdapter<Article> {

        public NewsAdapter(@NonNull AppCompatActivity context, @NonNull List<Article> articles) {
            super(context, 0, articles);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_news, parent, false);
            }

            final Article currentArticle = getItem(position);

            TextView newsTitleTextView = listItemView.findViewById(R.id.news_title);
            newsTitleTextView.setText(currentArticle.getTitle());

            ImageButton shareButton = listItemView.findViewById(R.id.share_button);
            shareButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareNews(currentArticle);
                }
            });

            listItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    displayNews(currentArticle);
                }
            });

            return listItemView;
        }
    }

    private void shareNews(Article article) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, article.getTitle());
        shareIntent.putExtra(Intent.EXTRA_TEXT, article.getUrl());
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }

    private void displayNews(Article article) {
        String newsUrl = article.getUrl();
        Intent intent = new Intent(this, NewsDetailActivity.class);
        intent.putExtra(NewsDetailActivity.EXTRA_URL, newsUrl);
        startActivity(intent);
    }
}
