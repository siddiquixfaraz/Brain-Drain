package com.example.braindrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.braindrain.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<CategoryModal> category = new ArrayList<>();

        category.add(new CategoryModal("","Mathematics","https://th.bing.com/th/id/OIP.JtUrcPmqVRI7E9R6KmzacwHaFN?pid=ImgDet&rs=1"));
        category.add(new CategoryModal("","Drama","https://th.bing.com/th/id/R.6462c81d662300aef48741421d63a79c?rik=J%2b3L0A3pOXCmoQ&riu=http%3a%2f%2fclipground.com%2fimages%2fdraba-clipart-8.jpg&ehk=4zjPvL7XuCe05%2bdu58tGyY5kFLZrLmXfet3FKDLAKBE%3d&risl=&pid=ImgRaw&r=0"));
        category.add(new CategoryModal("","Science","https://th.bing.com/th/id/OIP.hgzEhygZdJXDZVH5zeLFHAHaHa?pid=ImgDet&rs=1"));
        category.add(new CategoryModal("","History",""));
        category.add(new CategoryModal("","Language",""));

        adapter = new CategoryAdapter(this,category);

        binding.categoryList.setLayoutManager(new GridLayoutManager(this,2));
        binding.categoryList.setAdapter(adapter);


    }
}