package NhanSu;

import java.util.Scanner;

public class NhanVien extends NhanSu {
    public static int stt = 1;

    public NhanVien(String Ten, String MaSo, String CCCD, String GioiTinh, String DiaChi, String SDT, float Luong) {
        super(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, Luong);
        stt += 1;
    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên nhân viên: ");
        String Ten = sc.nextLine();
        System.out.println("Mã nhân viên: ");
        String MaSo = sc.nextLine();
        System.out.println("Căn cước công dân: ");
        String CCCD = sc.nextLine();
        System.out.println("Giới tính: ");
        String GioiTinh = sc.nextLine();
        System.out.println("Địa chỉ: ");
        String DiaChi = sc.nextLine();
        System.out.println("Số điện thoại: ");
        String SDT = sc.nextLine();
        System.out.println("Lương: ");
        float Luong = sc.nextInt();
        NhanVien nhanvien = new NhanVien(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, Luong);
        nhanvienList.add(nhanvien);
    }

    @Override
    public String toString() {
        return stt + ".Họ Tên: " + Ten + " - "
                + "Mã số nhân viên: " + MaSo + " - "
                + "CCCD: " + CCCD + " - "
                + "Giới Tính: " + GioiTinh + " - "
                + "Địa Chỉ: " + DiaChi + " - "
                + "Số điện thoại: " + SDT + " - "
                + "Luong = " + Luong * 8 * 30; //Set mỗi ngày làm 8 giờ và lương tính 1 tháng 30 ngày.
    }
}