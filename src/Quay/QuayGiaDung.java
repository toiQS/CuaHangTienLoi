package Quay;

import KhoHang.KhoHang;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuayGiaDung extends KhoHang {
    public static int soLuong = 0;
    public static float giaCa = 0;

    public QuayGiaDung(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
    }

    public QuayGiaDung() {

    }

    @Override
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
        QuayGiaDung giadung = new QuayGiaDung(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        giadungList.add(giadung);
    }

    @Override
    public void del() {
        KhoHang.xuatGiaDung();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma So Muon Xoa: ");
        String MaSo = sc.nextLine();
        QuayGiaDung giadung = giadungList.stream().filter(o -> o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if (giadung == null) {
            System.out.println("Khong Ton Tai.");
        }
        giadungList.remove(giadung);
        System.out.println("Xac Nhan Xoa.");
    }


    public List<QuayGiaDung> TimKiemGiaDung(String MaSo){
        return this.giadungList.stream().filter(o -> o.getMaSo().equals(MaSo)).collect(Collectors.toList());
    }
    @Override
    public void TimKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma So San Pham Muon Tim: ");
        String MaSo = sc.nextLine();
        TimKiemGiaDung(MaSo);
    }


    public List<QuayGiaDung> SuaThongTinGiaDung(int stt, QuayGiaDung giadung){
        giadungList.set(stt,giadung);
        return giadungList;
    }
    @Override
    public void SuaThongTin(){
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
        QuayGiaDung giadung = new QuayGiaDung(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        SuaThongTinGiaDung(a-1,giadung);
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

        QuayGiaDung giaDung = new QuayGiaDung(ten, maSo, ngayNhapHang, xuatSu, soLuong, giaCa);
        giadungList.add(giaDung);
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
