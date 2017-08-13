package com.example.mahiseker.enson.network;

import com.example.mahiseker.enson.Model.EarrthQueueItems;
import com.example.mahiseker.enson.Model.EarthQueueModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Mahiseker on 5.8.2017.
 */

public interface ServiceGenerator {

  @GET("/depremler")
    Call<EarthQueueModel> getEarthQueue();




}
