package com.example.a.l.api;

import com.example.a.l.model.SOAnswersResponse;
import com.example.a.l.model.gitmodel;

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.*;
import retrofit2.http.Query;

/**
 * Created by 12917 on 2017/4/23.
 */

public interface gitapi {
    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<List<SOAnswersResponse>> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<List<SOAnswersResponse>> getAnswers(@Query("tagged") String tags);

}
