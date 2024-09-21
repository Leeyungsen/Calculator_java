package com.example.beelajar1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView textView;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        textView = findViewById(R.id.text);

        in = getIntent();
        hasil(in.getStringExtra("Hasil"));
    }


    private void hasil(String text){textView.setText(text);

    }
}