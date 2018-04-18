package com.queen.topanga.prisma.base.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.queen.topanga.prisma.R;

public class MissionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //BOTONES MENU---------------------------------------------------------------
    public void opencollection(View view) {
        Intent show = new Intent(this, CollectionActivity.class);
        startActivity(show);
    }

    public void openmissions(View view) {
        Intent show = new Intent(this, MissionsActivity.class);
        startActivity(show);
    }

    public void openmain(View view) {
        Intent show = new Intent(this, MainActivity.class);
        startActivity(show);
    }

    public void openshop(View view) {
        Intent show = new Intent(this, ShopActivity.class);
        startActivity(show);
    }

    public void opensettings(View view) {
        Intent show = new Intent(this, SettingsActivity.class);
        startActivity(show);
    }

    public void openmode(View view) {
        Intent show = new Intent(this, ModeActivity.class);
        startActivity(show);
    }
}