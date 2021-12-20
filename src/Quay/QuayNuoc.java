package Quay;

import KhoHang.KhoHang;

import java.io.*;
import java.util.Scanner;

public class QuayNuoc extends KhoHang {
    public static int c = 1;
    public static int soLuong = 0;
    public static float giaCa = 0;

    public QuayNuoc(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
        c += 1;
    }

    public QuayNuoc() {

    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten San Pham: ");
        String Ten = sc.nextLine();
        System.out.println("Ma san pham: ");
        String MaSo = sc.nextLine();
        System.out.println("Ngay Nhap Hang: ");
        String NgayNhapHang = sc.nextLine();
        System.out.println("Xuat Xu: ");
        String XuatXu = sc.nextLine();
        do {
            System.out.println("So Luong Nhap Vao: ");
            try {
                soLuong = sc.nextInt();
            } catch(Exception ignored) {
                System.out.println("Khong hop le, vui long nhap lai!");
                sc.nextLine();
            }
        }while(soLuong == 0);

        do {
            System.out.println("Gia Du Dinh: ");
            try {
                giaCa = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Khong hop le, vui long nhap lai!");
                sc.nextLine();
            }
        } while(giaCa == 0);
        QuayNuoc thucpham = new QuayNuoc(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        nuocList.add(thucpham);
    }

    public void del() {
        KhoHang.xuatNuoc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma So Muon Xoa: ");
        String MaSo = sc.nextLine();
        QuayNuoc thucpham = nuocList.stream().filter(o -> o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if (thucpham == null) {
            System.out.println("Khong Ton Tai.");
        }
        nuocList.remove(thucpham);
        System.out.println("Xac Nhan Xoa.");
    }

    @Override
    public void inputFile(String URL) throws IOException {
        File file = new File(URL);
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String ten = reader.readLine();
        String maSo = reader.readLine();
        String ngayNhapHang = reader.readLine();
        String xuatSu = reader.readLine();
        int soLuong = Integer.parseInt(reader.readLine());
        float giaCa = Float.parseFloat(reader.readLine());

        QuayNuoc nuoc = new QuayNuoc(ten, maSo, ngayNhapHang, xuatSu, soLuong, giaCa);
        nuocList.add(nuoc);
    }

    @Override
    public String toString() {
        return c + ".Ten San Pham: " + Ten + " - "
                + "Ma San Pham: " + MaSo + " - "
                + "Xuat Su: " + XuatXu + " - "
                + "SoLuong: " + SoLuong + " - "
                + "GiaCa: " + GiaCa;
    }
}
