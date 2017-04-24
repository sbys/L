package com.example.a.l;

import com.example.a.l.api.gitapi;
import com.example.a.l.remote.RetrofitClient;

/**
 * Created by 12917 on 2017/4/23.
 */

public class ApiUtils {

    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static gitapi getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(gitapi.class);
    }
}
