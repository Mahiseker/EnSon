package com.example.mahiseker.enson.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Mahiseker on 5.8.2017.
 */

public class LoggingInterceptor implements Interceptor {

    private static final String TAG_REQUEST="Request";
    private static final String TAG_RESPONSE= "Response";
    private static final String TAG_JSON= "Json-Response";

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        Request newRequest;
        newRequest = request.newBuilder()
                .addHeader("","")
                .build();
        return chain.proceed(newRequest);
    }
}
