package com.softserve.edu.rest;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MsgTest {
    @Test
    public void checkMsg() throws Exception {
        String lifeTime;
        String result;
        //
        OkHttpClient client = new OkHttpClient();
        RequestBody formBody;
        Request request;
        Response response;
        String resultJson;
        //
        request = new Request
                .Builder()
                .url("https://speak-ukrainian.org.ua/dev/api/messages/recipient/1")
                .get()
                .addHeader("accept","*/*")
                .addHeader("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbkBnbWFpbC5jb20iLCJqdGkiOiIxIiwiZXhwIjoxNjcyNzM5MzAwfQ.Bf8MLwm59lNKWV0El6QHIUyLfAFL1FtBleJG_qOdA8RxksQETQ6JoFr-8UXgABp8fLZZvcC6PJorE0wJRq14_A")
                .build();
        response = client.newCall(request).execute();
        resultJson = response.body().string();
        //
        System.out.println("resultJson: " + resultJson);
    }
}
