package com.example.laba5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnclick(View view){
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура, работает победа",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void btnclick1(View view){
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Первая зевушка",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void btnclick2(View view){
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Вторая зевушка",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void btnclick3(View view){
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Третья зевушка",
                Toast.LENGTH_LONG);
        myToast.show();
    }
}