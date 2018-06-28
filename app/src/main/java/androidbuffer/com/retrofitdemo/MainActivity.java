package androidbuffer.com.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv)
    RecyclerView recyclerView;

    private RecyclerView.LayoutManager layoutManager;
    private RetrofitAdapter adapter;
    private List<RetrofitModel> modelList;
    private RetrofitInterface retrofitInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        retrofitInterface = ApiClient.getApiClient().create(RetrofitInterface.class);
        Call<List<RetrofitModel>> call = retrofitInterface.getDetails();

        call.enqueue(new Callback<List<RetrofitModel>>() {
            @Override
            public void onResponse(Call<List<RetrofitModel>> call, Response<List<RetrofitModel>> response) {
                modelList = response.body();
                adapter = new RetrofitAdapter(modelList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<RetrofitModel>> call, Throwable t) {

            }
        });
    }
}
