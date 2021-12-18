package NhanSu;

import java.util.Scanner;

public class BaoVe extends NhanSu {
    public static int a = 1;

    public BaoVe(String Ten, String MaSo, String GioiTinh, String DiaChi, String SDT, int SoNgayLam) {
        super(Ten, MaSo, GioiTinh, DiaChi, SDT, SoNgayLam);
        a += 1;
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
        BaoVe baove = new BaoVe(Ten, MaSo, GioiTinh, DiaChi, SDT, SoNgayLam);
        baoveList.add(baove);
    }

    @Override
    public String toString() {
        return a + ".Họ Tên: " + Ten + "/"
                + "Mã số nhân viên: " + MaSo
                + "/Giới Tính: " + GioiTinh
//                + "/CCCD: " + CCCD
                + "/Địa Chỉ: " + DiaChi
                + "/Số Ngày Làm: " + SoNgayLam
                + "Luong = " + SoNgayLam * 176000; //Set Lương mặc định là 22000/giờ, Mỗi ngày làm 8 giờ
    }
}