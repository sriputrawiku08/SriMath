package com.example.gabungan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BagiActivity extends AppCompatActivity {

    EditText angkapertama;
    EditText angkakedua;
    Button tomboljumlah;
    TextView texthasil;
    Double angkax;
    Double angkay;
    Double angkahasil;
    String angkaxhuruf;
    String angkayhuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagi);
        angkapertama=(EditText)findViewById(R.id.angkapertama);
        angkakedua=(EditText)findViewById(R.id.angkakedua);

        tomboljumlah=(Button)findViewById(R.id.tomboljumlah);
        texthasil=(TextView)findViewById(R.id.texthasil);

        tomboljumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angkaxhuruf=angkapertama.getText().toString();
                angkayhuruf=angkakedua.getText().toString();
                angkax=Double.parseDouble(angkaxhuruf);
                angkay=Double.parseDouble(angkayhuruf);
                if(angkay==0){
                    angkakedua.setError("pembagi tidak boleh nol dong");
                    angkakedua.setText("");
                    angkakedua.requestFocus();
                }else{
                    angkahasil=angkax/angkay;
                    texthasil.setText(Double.toString(angkahasil));
                }

            }
        });


    }

}

