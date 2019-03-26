package com.example.foto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText edtNama;
    Button btnSubmit;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText) findViewById(R.id.edtNama);
        btnSubmit =(Button) findViewById(R.id.btnSubmit);
        imageView = (ImageView) findViewById(R.id.imgView);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama =edtNama.getText().toString();
                if (nama.equals("ovi")) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ovi));
                }else
                }
            }
        });
    }
