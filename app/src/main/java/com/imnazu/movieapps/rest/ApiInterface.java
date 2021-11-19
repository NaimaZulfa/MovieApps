package com.imnazu.movieapps.rest;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/b/618dd6084a56fb3dee0da690")
    Call<Response> getMovie(
            @Path("popularity") String popularity,
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );
}
