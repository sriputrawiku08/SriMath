package com.example.gabungan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KurangActivity extends AppCompatActivity {

    EditText angkapertama;
    EditText angkakedua;
    Button tomboljumlah;
    TextView texthasil;
    int angkax;
    int angkay;
    int angkahasil;
    String angkaxhuruf;
    String angkayhuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurang);
        angkapertama = (EditText) findViewById(R.id.angkapertama);
        angkakedua = (EditText) findViewById(R.id.angkakedua);
        tomboljumlah = (Button) findViewById(R.id.tomboljumlah);
        texthasil = (TextView) findViewById(R.id.texthasil);

        tomboljumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angkaxhuruf = angkapertama.getText().toString();
                angkayhuruf = angkakedua.getText().toString();
                angkax = Integer.parseInt(angkaxhuruf);
                angkay = Integer.parseInt(angkayhuruf);
                angkahasil = angkax - angkay;
                texthasil.setText(Integer.toString(angkahasil));
            }
        });
    }
}

