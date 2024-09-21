package com.example.beelajar1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textelement;
    EditText number_one,number_two;
    Button tambah,kurang,kali,bagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        number_one = findViewById(R.id.number_one);
        number_two = findViewById(R.id.number_two);
        tambah = findViewById(R.id.button_tambah);
        kurang = findViewById(R.id.button_kurang);
        kali = findViewById(R.id.button_kali);
        bagi = findViewById(R.id.button_bagi);
        textelement = findViewById(R.id.text);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahan();
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { pengurangan(); }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { perkalian(); }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { pembagian (); }
        });
    }

    private void tambahan(){
        int a = Integer.valueOf(number_one.getText().toString());
        int b = Integer.valueOf(number_two.getText().toString());

        int c = a+b;

        textelement.setText("hasilnya adalah : "+c);
        Intent in = new Intent(MainActivity.this,HasilActivity.class);
        in.putExtra("Hasil","hasilnya adalah : "+c);
        startActivity(in);

    }
    private void pengurangan() {
        int a = Integer.valueOf(number_one.getText().toString());
        int b = Integer.valueOf(number_two.getText().toString());

        int d = a - b;

        textelement.setText("hasilnya adalah : " + d);
        Intent in = new Intent(MainActivity.this,HasilActivity.class);
        in.putExtra("Hasil","hasilnya adalah : "+d);
        startActivity(in);
    }
    private void perkalian() {
        int a = Integer.valueOf(number_one.getText().toString());
        int b = Integer.valueOf(number_two.getText().toString());

        int e = a * b;

        textelement.setText("hasilnya adalah : " + e);
        Intent in = new Intent(MainActivity.this,HasilActivity.class);
        in.putExtra("Hasil","hasilnya adalah : "+e);
        startActivity(in);
    }
    private void pembagian() {
        int a = Integer.valueOf(number_one.getText().toString());
        int b = Integer.valueOf(number_two.getText().toString());

        int f = a / b;

        textelement.setText("hasilnya adalah : " + f);
        Intent in = new Intent(MainActivity.this,HasilActivity.class);
        in.putExtra("Hasil","hasilnya adalah : "+f);
        startActivity(in);
    }


}