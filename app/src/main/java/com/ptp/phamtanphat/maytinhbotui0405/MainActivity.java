package com.ptp.phamtanphat.maytinhbotui0405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNumber1, edtNumber2;
    TextView txtResult;
    Button btnCong, btnTru, btnNhan, btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber1 = findViewById(R.id.edittextNumber1);
        edtNumber2 = findViewById(R.id.edittextNumber2);
        txtResult = findViewById(R.id.textviewResult);
        btnCong = findViewById(R.id.buttonCong);
        btnTru = findViewById(R.id.buttonTru);
        btnNhan = findViewById(R.id.buttonNhan);
        btnChia = findViewById(R.id.buttonChia);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lay du lieu trong edittext
                 String number1 = edtNumber1.getText().toString();
                 String number2 = edtNumber2.getText().toString();

                 //In ra du lieu trong project
            }
        });

    }
}
