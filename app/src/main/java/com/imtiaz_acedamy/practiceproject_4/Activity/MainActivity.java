package com.imtiaz_acedamy.practiceproject_4.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.imtiaz_acedamy.practiceproject_4.Adapter.TrendsAdapter;
import com.imtiaz_acedamy.practiceproject_4.Domain.TrendsDomain;
import com.imtiaz_acedamy.practiceproject_4.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterTrendList;
    private RecyclerView recyclerViewTrends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        BottomNavigation();
    }

    private void BottomNavigation() {

        LinearLayout profileBtn = (LinearLayout) findViewById(R.id.profileBtn);

        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));


            }
        });

    }

    private void initRecyclerView() {
        ArrayList<TrendsDomain> items = new ArrayList<>();
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like?","The National","trends"));
        items.add(new TrendsDomain("Important points in concluding a work contract","Reuters","trends2"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like?","BBC","trends3"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like?","The National","trends"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like?","The National","trends2"));


        recyclerViewTrends = (RecyclerView) findViewById(R.id.view1);
        recyclerViewTrends.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapterTrendList = new TrendsAdapter(items);
        recyclerViewTrends.setAdapter(adapterTrendList);

    }
}