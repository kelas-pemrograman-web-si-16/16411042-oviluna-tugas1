package com.example.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtnama,txtnpm;
    EditText edtnama,edtnpm;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnama= (TextView) findViewById(R.id.txtnama);
        txtnpm= (TextView) findViewById(R.id.txtnpm);

        edtnama= (EditText) findViewById(R.id.edtnama);
        edtnpm= (EditText) findViewById(R.id.edtnpm);


        btnSubmit = (Button) findViewById(R.id.btnsubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = edtnama.getText().toString();
                String npm =edtnpm.getText().toString();

                txtnama.setText(nama);
                txtnpm.setText(npm);

            }
        });

}
}