package com.example.wemet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;


public class account_profile extends AppCompatActivity {

    private ImageSlider imageSlider;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_profile);

        imageSlider=findViewById(R.id.pics);
        List<SlideModel> slideModels=new ArrayList<>();

       // imageSlider.setImageList(slideModels,true);




    }
}