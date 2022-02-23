package com.mytestprogram.tvshowapp.repository

import com.mytestprogram.tvshowapp.api.ApiService
import javax.inject.Inject

class TvShowRepository
@Inject
constructor(private val apiService: ApiService){
    suspend fun getTvShows() = apiService.getTvShows()
}