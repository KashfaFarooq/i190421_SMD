package com.kashfafarooq.i190421;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class RecentSearchesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recent_searches);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView2);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.home){
                    Intent intent = new Intent(RecentSearchesActivity.this, WelcomePageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.search){
                    Intent intent = new Intent(RecentSearchesActivity.this, RecentSearchesActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.add){
                    Intent intent = new Intent(RecentSearchesActivity.this, ItemPageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.chat){
                    Intent intent = new Intent(RecentSearchesActivity.this, ChatViewActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.profile){
                    Intent intent = new Intent(RecentSearchesActivity.this, ProfilePageActivity.class);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });
    }
}