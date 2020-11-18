package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayToast(View v){
        Context context = getApplicationContext();
         CharSequence text = "Welcome To OnCreate Method";
         int duration = Toast.LENGTH_SHORT;

         Toast toast = Toast.makeText(context, text, duration);
         toast.setGravity(Gravity.CENTER, 0, 0);
         toast.show();
    }

//Toast.makeText(MainActivity.this,"welcome to the application ;)",Toast.LENGTH_SHORT).show();














}