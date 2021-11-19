package com.imnazu.movieapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAbout = (Button) findViewById(R.id.buttonAbout);
        buttonAbout.setOnClickListener(view -> {
            Intent aboutIntent = new Intent(this, AboutActivity.class);
            startActivity(aboutIntent);
        });

        Button buttonMovie = (Button) findViewById(R.id.buttonMovie);
        buttonMovie.setOnClickListener(view -> {
            Intent movieIntent = new Intent(this, MovieActivity.class);
            startActivity(movieIntent);
        });

        Button buttonLang = (Button) findViewById(R.id.buttonLang);
        buttonLang.setOnClickListener(view -> {
            Intent intentLang = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(intentLang);
        });
    }
}