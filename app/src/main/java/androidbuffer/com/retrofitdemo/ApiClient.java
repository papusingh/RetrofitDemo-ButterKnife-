package androidbuffer.com.retrofitdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by incred-dev on 26/6/18.
 */

public class ApiClient {

    public static final String BASE_URL = "https://api.github.com";
    public static  Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}
