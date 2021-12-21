package Quay;

import KhoHang.KhoHang;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class QuayNuoc extends KhoHang {
    public static int soLuong = 0;
    public static float giaCa = 0;

    public QuayNuoc(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
    }

    public QuayNuoc() {

    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten San Pham: ");
        String Ten = sc.nextLine();
        System.out.print("Ma san pham: ");
        String MaSo = sc.nextLine();
        System.out.print("Ngay Nhap Hang: ");
        String NgayNhapHang = sc.nextLine();
        System.out.print("Xuat Xu: ");
        String XuatXu = sc.nextLine();
        do {
            System.out.print("So Luong Nhap Vao: ");
            try {
                soLuong = sc.nextInt();
            } catch(Exception ignored) {
                System.out.println("Khong hop le, vui long nhap lai!");
                sc.nextLine();
            }
        }while(soLuong == 0);

        do {
            System.out.print("Gia Du Dinh: ");
            try {
                giaCa = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Khong hop le, vui long nhap lai!");
                sc.nextLine();
            }
        } while(giaCa == 0);
        QuayNuoc nuoc = new QuayNuoc(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        nuocList.add(nuoc);
    }

    public void del() {
        KhoHang.xuatNuoc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma So Muon Xoa: ");
        String MaSo = sc.nextLine();
        QuayNuoc nuoc = nuocList.stream().filter(o -> o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if (nuoc == null) {
            System.out.println("Khong Ton Tai.");
        }
        nuocList.remove(nuoc);
        System.out.println("Xac Nhan Xoa.");
    }

    @Override
    public List<QuayGiaDung> TimKiemGiaDung(String MaSo) {
        return null;
    }

    public List<QuayNuoc> SuaThongTinNuoc(int stt, QuayNuoc nuoc){
        nuocList.set(stt,nuoc);
        return nuocList;
    }
    @Override
    public void SuaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap stt muon sua thong tin: ");
        int a = sc.nextInt();
        System.out.print("Ten San Pham: ");
        String Ten = sc.nextLine();
        System.out.print("Ma san pham: ");
        String MaSo = sc.nextLine();
        System.out.print("Ngay Nhap Hang: ");
        String NgayNhapHang = sc.nextLine();
        System.out.print("Xuat Xu: ");
        String XuatXu = sc.nextLine();
        do {
            System.out.print("So Luong Nhap Vao: ");
            try {
                soLuong = sc.nextInt();
            } catch (Exception ignored) {
                System.out.println("Khong hop le, vui long nhap lai!");
                sc.nextLine();
            }
        }while(soLuong == 0);

        do {
            System.out.print("Gia Du Dinh: ");
            try {
                giaCa = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Khong hop le, vui long nhap lai!");
                sc.nextLine();
            }
        }while(giaCa == 0);
        QuayNuoc nuoc = new QuayNuoc(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        SuaThongTinNuoc(a-1,nuoc);
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
        return  ".Ten San Pham: " + Ten + " - "
                + "Ma San Pham: " + MaSo + " - "
                + "Xuat Su: " + XuatXu + " - "
                + "SoLuong: " + SoLuong + " - "
                + "GiaCa: " + GiaCa;
    }
}
