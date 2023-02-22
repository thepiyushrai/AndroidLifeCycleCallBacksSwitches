package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "inside call back of onCreate MainActivity");
        //swapTwo();
    }@Override
    protected void onStart() {

        Toast.makeText(this, "inside call back of onStart MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "inside call back of onStart MainActivity");

        super.onStart();
    }
    @Override
    protected void onResume() {

        Toast.makeText(this, "inside call back of onResume MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "inside call back of onResume MainActivity");
        super.onResume();

    }

    @Override
    protected void onPause() {

        Toast.makeText(this, "inside call back of onPause MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "inside call back of onPause MainActivity");

        super.onPause();
    }

    public void gotoActivity2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
    @Override
    protected void onStop() {

        Toast.makeText(this, "inside call back of onStop MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "inside call back of onStop MainActivity");

        super.onStop();
    }


    @Override
    protected void onRestart() {

        Toast.makeText(this, "inside call back of onRestart MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "inside call back of onRestart MainActivity");

        super.onRestart();
    }
    @Override
    protected void onDestroy() {

        Toast.makeText(this, "inside call back of onDestroy MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "inside call back of onDestroy MainActivity");

        super.onDestroy();
    }
        private void swapTwo() {
        int a = 5;
        int b = 6;
        int t;
        t = a;
        a = b;
        b = t;


         System.out.print(a +"==="+","+b);

      a = a+b;
      b = a-b;
      a = a-b;
        System.out.print(a +"====="+","+b);
int n = 5;
        int  c, fact = 1;

        if ( n < 0 )
            System.out.println("Number should be non-negative.");
        else
        {
            for ( c = 1 ; c <= n ; c++ )
                fact = fact*c;
            System.out.println("Factorial of "+n+" is = "+fact);
        }

        int m = 120;

        int reverse = 0;

        while( m != 0 ) {
            reverse = reverse * 10;
            reverse = reverse + m%10;
            m = m/10;
        }
        System.out.println("Reverse of entered number is "+reverse);

    }
}