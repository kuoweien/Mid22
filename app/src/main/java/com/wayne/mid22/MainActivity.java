package com.wayne.mid22;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b_func1 = findViewById(R.id.b_func1);
        Button b_func2 = findViewById(R.id.b_func2);
        Button b_func3 = findViewById(R.id.b_func3);
        Button b_func4 = findViewById(R.id.b_func4);
        Button b_func5 = findViewById(R.id.b_func5);
        Button b_func6 = findViewById(R.id.b_func6);
        Button b_func7 = findViewById(R.id.b_func7);
        Button b_func8 = findViewById(R.id.b_func8);
    }
    public void func1(View v){
        Intent intent = new Intent(this, Func1Activity.class);
        startActivity(intent);
    }
    public void func2(View v){
        Intent intent = new Intent(this, Func2Activity.class);
        startActivity(intent);
    }
    public void func3(View v){
        boolean login = false;
        if(!login) {
            Intent intent = new Intent(this, Func3Activity.class);
            startActivity(intent);
            Toast.makeText(this, "特殊功能" ,Toast.LENGTH_LONG).show();
        }
    }
    public void func4(View v){
        Intent intent = new Intent(this, Func4Activity.class);
        startActivity(intent);
    }
    public void func5(View v){
        Intent intent = new Intent(this, Func5Activity.class);
        startActivity(intent);
    }
    public void func6(View v){
        Intent intent = new Intent(this, Func6Activity.class);
        startActivity(intent);
    }
    public void func7(View v){
        Intent intent = new Intent(this, Func7Activity.class);
        startActivity(intent);
        boolean login = false;
        if(!login) {
            Intent intent2 = new Intent(this, Func3Activity.class);
            startActivity(intent2);
            Toast.makeText(this, "特殊功能" ,Toast.LENGTH_LONG).show();
        }
    }
    public void func8(View v){
        Intent intent = new Intent(this, Func8Activity.class);
        startActivity(intent);
        boolean login = false;
        if(!login) {
            Intent intent3 = new Intent(this, Func3Activity.class);
            startActivity(intent3);
            Toast.makeText(this, "特殊功能" ,Toast.LENGTH_LONG).show();
        }
    }

}
