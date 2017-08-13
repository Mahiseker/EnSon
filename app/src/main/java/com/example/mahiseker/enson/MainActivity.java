package com.example.mahiseker.enson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mahiseker.enson.Model.EarthQueueModel;
import com.example.mahiseker.enson.network.Factory;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity implements View.OnClickListener {




    @BindView(R.id.button)Button button;

     @Override
    public int getLayoutId() {
         return R.layout.activity_main;
     }

     @Override
    public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         ButterKnife.bind(this);

         button.setOnClickListener(this);

     }


    @Override
    public void onClick(View v) {
        Factory.getInstance().getEarthQueue().enqueue(new Callback<EarthQueueModel>() {
            @Override
            public void onResponse(Call<EarthQueueModel> call, Response<EarthQueueModel>
                    response) {
                Toast.makeText(MainActivity.this, response.body().data.get(0).lokasyon,
                        Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<EarthQueueModel> call, Throwable t) {

            }
        });

    }
}
