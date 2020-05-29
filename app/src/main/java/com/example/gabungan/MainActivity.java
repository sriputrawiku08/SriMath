package com.example.gabungan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tombolmenjumlahkan;
    Button tombolmengurangkan;
    Button tombolmengkalikan;
    Button tombolmembagikan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombolmenjumlahkan=(Button)findViewById(R.id.tomboljumlah);
        tombolmengurangkan=(Button)findViewById(R.id.tombolkurang);
        tombolmengkalikan=(Button)findViewById(R.id.tombolkali);
        tombolmembagikan=(Button)findViewById(R.id.tombolbagi);
        tombolmenjumlahkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahjumlah=new Intent(MainActivity.this,JumlahActivity.class);
                startActivity(pindahjumlah);
            }
        });
        tombolmengurangkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkurang=new Intent(MainActivity.this,KurangActivity.class);
                startActivity(pindahkurang);
            }
        });
        tombolmengkalikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkali=new Intent(MainActivity.this,KaliActivity.class);
                startActivity(pindahkali);
            }
        });
        tombolmembagikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahbagi=new Intent(MainActivity.this,BagiActivity.class);
                startActivity(pindahbagi);
            }
        });
    }
}
