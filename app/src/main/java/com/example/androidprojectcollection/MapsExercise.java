package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.example.androidprojectcollection.MapEnum.MapKeys;
import com.example.androidprojectcollection.databinding.ActivityMapsExerciseBinding;

public class MapsExercise extends AppCompatActivity {

    private ActivityMapsExerciseBinding binding;
    private MapKeys map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapsExerciseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.mapBtnElCap.setOnClickListener(v -> {
            binding.mapMain.setBackground(getDrawable(R.drawable.el_capitan));
            map = MapKeys.ElCap;
        });

        binding.mapBtnSiargao.setOnClickListener(v -> {
            binding.mapMain.setBackground(getDrawable(R.drawable.siargao_resort));
            map = MapKeys.Siargao;
        });

        binding.mapBtnTokyo.setOnClickListener(v -> {
            binding.mapMain.setBackground(getDrawable(R.drawable.tokyo_tower));
            map = MapKeys.Tokyo;
        });

        binding.mapBtnRabbit.setOnClickListener(v -> {
            binding.mapMain.setBackground(getDrawable(R.drawable.flying_rabbit));
            map = MapKeys.Rabbit;
        });

        binding.mapBtnMonica.setOnClickListener(v -> {
            binding.mapMain.setBackground(getDrawable(R.drawable.santa_monica_studio));
            map = MapKeys.Monica;
        });

        binding.mapBtnGoTo.setOnClickListener(v -> {
            if(map != null){
                switch(map){
                    case ElCap:
                        goTo("geo:37.7340704,-119.6374147");
                        break;
                    case Tokyo:
                        goTo("geo:35.65834,139.7449483");
                        break;
                    case Monica:
                        goTo("geo:33.9725082,-118.4252326");
                        break;
                    case Rabbit:
                        goTo("geo:49.9180216,19.9374314");
                        break;
                    case Siargao:
                        goTo("geo:9.7706052,126.1296805");
                        break;
                }
            }else{
                Toast.makeText(MapsExercise.this, "Pick a location!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void goTo(String coords){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(coords)));
    }

    //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.3399, 127.5101")))
    //35.65834,139.7449483 Tokyo Tower
    //9.7706052,126.1296805 Siargao Retreat Resort
    //33.9725082,-118.4252326 Santa Monica Studios
    //37.7340704,-119.6374147 El Capitan
    //49.9180216,19.9374314 Flying Rabbit
}