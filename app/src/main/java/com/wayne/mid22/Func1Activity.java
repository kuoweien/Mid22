package com.wayne.mid22;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
    public void roll(View v){
        Random random = new Random();
        int r = random.nextInt(6)+1;
        Button b_roll = findViewById(R.id.roll);
        new AlertDialog.Builder(this)
                .setTitle("Random")
                .setMessage("random"+r)
                .setPositiveButton("OK", null)
                .show();
    }
}
