package com.example.a.l;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.a.l.api.gitapi;
import com.example.a.l.model.SOAnswersResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private gitapi mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mService=ApiUtils.getSOService();
    }
    public void b(View view){
        mService.getAnswers().enqueue(new Callback<List<SOAnswersResponse>>() {
            @Override
            public void onResponse(Call<List<SOAnswersResponse>> call, Response<List<SOAnswersResponse>> response) {
                Log.e("aaa",""+response.body().get(0).getItems().get(0).getAnswerId().toString());
            }

            @Override
            public void onFailure(Call<List<SOAnswersResponse>> call, Throwable t) {

            }
        });
    }

}
