package com.ptp.phamtanphat.maytinhbotui0405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
                TinhToan("+");
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhToan("-");
            }


        });
    }
    //Ham va phuong thuc
//    Access Modifier : public  , private , protected
//    public : ai xem cung duoc (Phai di vao trong main de xem)
//    private : chi nhung nguoi tao ra moi xem duoc con lai thi khong the xem duoc
//    protected : ai cung xai duoc nhung muon xai thi phai dam bao 2 yeu to
//                + Co su ke thua
//                + Goi phuong thuc tu class ke thua
    private void TinhToan(String pheptinh){
        String number1 = edtNumber1.getText().toString();
        String number2 = edtNumber2.getText().toString();

        //In ra du lieu trong project
//                Log.d("BBB", "Gia tri trong edittext 1 : " + number1);
//                Log.d("BBB", "Gia tri trong edittext 2 : " + number2);

        //in ra du lieu ra man hinh
//                        Ctrl + /
//                Toast.makeText(MainActivity.this,number1,Toast.LENGTH_SHORT).show();
//                 Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
        int ketqua = 0;
        if (!number1.isEmpty() && !number2.isEmpty()){
            switch (pheptinh){
                case "-" :  ketqua = Integer.parseInt(number1) - Integer.parseInt(number2);
                    break;
                case "+" :  ketqua = Integer.parseInt(number1) + Integer.parseInt(number2);
                    break;
                case "*" :  ketqua = Integer.parseInt(number1) * Integer.parseInt(number2);
                    break;
                case "/" :
//                    if (Integer.parseInt(number1) > 0)
                    ketqua = Integer.parseInt(number1) / Integer.parseInt(number2);
                    break;
            }

            txtResult.setText(String.valueOf(ketqua));
        }
    }
}
