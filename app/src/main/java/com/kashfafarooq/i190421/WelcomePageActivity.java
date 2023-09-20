package com.kashfafarooq.i190421;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class WelcomePageActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        TextView textView = findViewById(R.id.welcome);
        CharSequence charSequence = textView.getText();
        String text = charSequence.toString();
        SpannableString spannableString = new SpannableString(text);
        int colorIndex = 8;
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.RED);
        spannableString.setSpan(colorSpan, colorIndex, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);

        Button button1 = findViewById(R.id.button1);
        formatButton(button1, Color.RED, 9);
        Button button2 = findViewById(R.id.button2);
        formatButton(button2, Color.RED, 9);
        Button button3 = findViewById(R.id.button3);
        formatButton(button3, Color.RED, 9);
        Button button4 = findViewById(R.id.button4);
        formatButton(button4, Color.RED, 9);
        Button button5 = findViewById(R.id.button5);
        formatButton(button5, Color.RED, 9);
        Button button6 = findViewById(R.id.button6);
        formatButton(button6, Color.RED, 9);
        Button button7 = findViewById(R.id.button7);
        formatButton(button7, Color.RED, 9);
        Button button8 = findViewById(R.id.button8);
        formatButton(button8, Color.RED, 9);
        Button button9 = findViewById(R.id.button9);
        formatButton(button9, Color.RED, 9);
        Button button10 = findViewById(R.id.button10);
        formatButton(button10, Color.RED, 9);
        Button button11 = findViewById(R.id.button11);
        formatButton(button11, Color.RED, 9);
        Button button12 = findViewById(R.id.button12);
        formatButton(button12, Color.RED, 9);

        Button view = findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomePageActivity.this, ProfilePageActivity.class);
                startActivity(intent);
            }
        });

        Button item = findViewById(R.id.button1);
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomePageActivity.this, ItemInfoActivity.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView2);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.home){
                    Intent intent = new Intent(WelcomePageActivity.this, WelcomePageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.search){
                    Intent intent = new Intent(WelcomePageActivity.this, RecentSearchesActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.add){
                    Intent intent = new Intent(WelcomePageActivity.this, ItemPageActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.chat){
                    Intent intent = new Intent(WelcomePageActivity.this, ChatViewActivity.class);
                    startActivity(intent);
                    return true;
                }
                if(item.getItemId() == R.id.profile){
                    Intent intent = new Intent(WelcomePageActivity.this, ProfilePageActivity.class);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });
    }

    @SuppressLint("RestrictedApi")
    private void formatButton(Button button1, int color, int colorIndex)
    {
        WindowDecorActionBar.TabImpl button = null;
        @SuppressLint("RestrictedApi") CharSequence buttonText = button.getText();
        String text = buttonText.toString();
        SpannableString spannableString = new SpannableString(text);
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(color);
        spannableString.setSpan(colorSpan, colorIndex, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        button.setText(spannableString);

    }
}