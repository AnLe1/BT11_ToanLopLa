package com.lecongan.bt11_toanlopla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnTest;
    private Button btnNew;
    private EditText edtSothunhat;
    private EditText edtSothuhai;
    private EditText edtDapSo;
    private TextView tv_kq;
    private int x,y,tong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        btnNew.setOnClickListener(this);
        btnTest.setOnClickListener(this);
    }



    private void initWidget() {
        btnNew = (Button) findViewById(R.id.btn_new);
        btnTest = (Button) findViewById(R.id.btn_test);
        edtSothunhat = (EditText) findViewById(R.id.edt_sothu1);
        edtSothuhai = (EditText) findViewById(R.id.edt_sothu2);
        edtDapSo = (EditText) findViewById(R.id.edt_ds);
        tv_kq = (TextView) findViewById(R.id.tv_kq);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_test:
                test();
                break;
            case R.id.btn_new:
                reset_new();
                break;
                default:
                    break;
        }
    }

    private void reset_new() {
        x = (int) (Math.random()*11);
        y = (int) (Math.random()*11);
        edtSothunhat.setText(String.valueOf(x));
        edtSothuhai.setText(String.valueOf(y));
    }

    private void test() {
        String chuoi="";
        int a = Integer.parseInt(edtSothunhat.getText().toString());
        int b = Integer.parseInt(edtSothuhai.getText().toString());
        tong = a+b;
        chuoi+=String.valueOf(tong);

        if(edtDapSo.getText().equals(String.valueOf(tong))){

            tv_kq.setText("Be gioi qua");
        }else{
//            Toast.makeText(this, "sai", Toast.LENGTH_SHORT).show();
            tv_kq.setText("Be sai roi Ket qua la: "+tong);
        }

    }
}
