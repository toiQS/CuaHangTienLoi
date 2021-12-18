package NhanSu;

import java.util.Scanner;

public class NhanVien extends NhanSu {
    public static int stt = 1;

    public NhanVien(String Ten, String MaSo, String GioiTinh, String DiaChi, String SDT, int SoNgayLam) {
        super(Ten, MaSo, GioiTinh, DiaChi, SDT, SoNgayLam);
        stt += 1;
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten nhân viên: ");
        String Ten = sc.nextLine();
        System.out.println("Mã nhân viên: ");
        String MaSo = sc.nextLine();
        System.out.println("Giới tính: ");
        String GioiTinh = sc.nextLine();
        System.out.println("Địa chỉ: ");
        String DiaChi = sc.nextLine();
        System.out.println("Số điện thoại: ");
        String SDT = sc.nextLine();
        System.out.println("Số ngày làm: ");
        int SoNgayLam = sc.nextInt();
        NhanVien nhanvien = new NhanVien(Ten, MaSo, GioiTinh, DiaChi, SDT, SoNgayLam);
        nhanvienList.add(nhanvien);
    }

    @Override
    public String toString() {
        return stt + ".Họ Tên: " + Ten + "/"
                + "Mã số nhân viên: " + MaSo
                + "/Giới Tính: " + GioiTinh
//                + "/CCCD: " + CCCD
                + "/Địa Chỉ: " + DiaChi
                + "/Số Ngày Làm: " + SoNgayLam
                + "Luong = " + SoNgayLam * 176000; //Set Lương mặc định là 22000/giờ, Mỗi ngày làm 8 giờ
    }
}
