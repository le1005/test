package com.example.admin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.test.XuLyDangNhap.PresenterImpXLDN;
import com.example.admin.test.XuLyDangNhap.PresenterLoginXLDN;
import com.example.admin.test.XuLyDangNhap.ViewXLDN;

public class MainActivity extends AppCompatActivity implements ViewXLDN, View.OnClickListener {
  Button btn;
  EditText etTenDangNhap, edMatKhau;
    PresenterImpXLDN login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnLogin);
        etTenDangNhap = findViewById(R.id.et_email);
  // khi goi thí tự tham chiếu đễn class và

         login = new PresenterLoginXLDN(this);

        btn.setOnClickListener(this);
        //khi click vào button, sẽ tiến hành kiểm tra đăng nhập
        //chỉ tồn tại Presenter trong hàm
    }

    @Override
    public void DangNhap(String thongbao) {
        Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void thatBai() {
        Toast.makeText(this, "Thất Bại", Toast.LENGTH_SHORT).show();
    }
    //Khi đowcj
  String tenDN, matKhau;
    @Override
    public void onClick(View v) {

        tenDN = etTenDangNhap.getText().toString();
        matKhau = edMatKhau.getText().toString();
        login.KiemTraDangNhap(tenDN,matKhau);
    }
}
