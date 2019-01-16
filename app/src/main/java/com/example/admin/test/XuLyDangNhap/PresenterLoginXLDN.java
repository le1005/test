package com.example.admin.test.XuLyDangNhap;

import com.example.admin.test.MainActivity;

/**
 * Created by Admin on 15/1/2019.
 */

public class PresenterLoginXLDN implements PresenterImpXLDN {
    //ke thua PresenterImp
    ViewXLDN viewXLDN;

    public PresenterLoginXLDN(MainActivity mainActivity) {
    }
// Sau khi nhấn nút thì nó sẽ chạy đến thành công hay thất bại để phân
    @Override
    public void KiemTraDangNhap(String tendangnhap, String matkhau) {
        //goi cho model để lấy dữ liệu
        if (tendangnhap.equals("BAC") && matkhau.equals("123")) {
            // trả ra view : Đăng nhập thành công
       viewXLDN.DangNhap("đang nhâp thanh công");
        } else {
            // tra va view đăng nhập thất bại
            viewXLDN.thatBai();
        }

        //xử lý code
    }
}
