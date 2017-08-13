package com.example.mahiseker.enson.network;

import com.example.mahiseker.enson.utils.Contanst;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mahiseker on 6.8.2017.
 */

public class Factory {
    public static ServiceGenerator serviceGenerator;

    public static ServiceGenerator getInstance(){
        if (serviceGenerator == null)
        {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Contanst.BASE_URL)
                    .client(new OkHttpClient().newBuilder()
                            .build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            serviceGenerator = retrofit.create(ServiceGenerator.class);
            return serviceGenerator;
        }else{
            return serviceGenerator;

        }
    }

}
