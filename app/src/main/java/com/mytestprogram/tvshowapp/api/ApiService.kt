package com.mytestprogram.tvshowapp.api

import com.mytestprogram.tvshowapp.helper.Constants
import com.mytestprogram.tvshowapp.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShows(): Response<TvShowResponse>
    
}