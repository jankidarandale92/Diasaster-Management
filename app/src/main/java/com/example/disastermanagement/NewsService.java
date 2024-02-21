package com.example.disastermanagement;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsService {
    @GET("top-headlines")
    Call<NewsResponse> getDisasterNews(
            @Query("apiKey") String apiKey,
            @Query("q") String query,
            @Query("sortBy") String sortBy
    );
}
