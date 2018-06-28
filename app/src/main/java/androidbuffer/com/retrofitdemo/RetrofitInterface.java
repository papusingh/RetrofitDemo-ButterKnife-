package androidbuffer.com.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by incred-dev on 26/6/18.
 */

public interface RetrofitInterface {

    @GET("/repositories?since=30")
    Call<List<RetrofitModel>> getDetails();
}
