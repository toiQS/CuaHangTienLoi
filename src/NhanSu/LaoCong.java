package NhanSu;

import java.util.Scanner;

public class LaoCong extends NhanSu {
    public static int b = 1;

    public LaoCong(String Ten, String MaSo, String GioiTinh, String DiaChi, String SDT, int SoNgayLam) {
        super(Ten, MaSo, GioiTinh, DiaChi, SDT, SoNgayLam);
        b += 1;
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
        LaoCong laocong = new LaoCong(Ten, MaSo, GioiTinh, DiaChi, SDT, SoNgayLam);
        laocongList.add(laocong);
    }

    @Override
    public String toString() {
        return b + ".Họ Tên: " + Ten + "/"
                + "Mã số nhân viên: " + MaSo
                + "/Giới Tính: " + GioiTinh
//                + "/CCCD: " + CCCD
                + "/Địa Chỉ: " + DiaChi
                + "/Số Ngày Làm: " + SoNgayLam
                + "Luong = " + SoNgayLam * 176000; //Set Lương mặc định là 22000/giờ, Mỗi ngày làm 8 giờ
    }
}
