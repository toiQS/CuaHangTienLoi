package Quay;

import KhoHang.KhoHang;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuayKhac extends KhoHang {
    public static int soLuong = 0;
    public static float giaCa = 0;

    public QuayKhac(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
    }

    public QuayKhac() {

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
        QuayKhac quaykhac = new QuayKhac(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        quaykhacList.add(quaykhac);
    }

    public void del() {
        KhoHang.xuatKhac();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma So Muon Xoa: ");
        String MaSo = sc.nextLine();
        QuayKhac quaykhac = quaykhacList.stream().filter(o -> o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if (quaykhac == null) {
            System.out.println("Khong Ton Tai.");
        }
        quaykhacList.remove(quaykhac);
        System.out.println("Xac Nhan Xoa.");
    }

    public List<QuayKhac> TimKiemThongTinQuayKhac(String MaSo){
        return this.quaykhacList.stream().filter(o -> o.getMaSo().equals(MaSo)).collect(Collectors.toList());
    }
    @Override
    public void TimKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma So San Pham Muon Tim: ");
        String MaSo = sc.nextLine();
        TimKiemThongTinQuayKhac(MaSo);
    }

    public List<QuayKhac> suaThongTinQuayKhac(int stt, QuayKhac quaykhac){
        quaykhacList.set(stt,quaykhac);
        return quaykhacList;
    }
    @Override
    public void SuaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap stt muon sua thong tin: ");
        int a = sc.nextInt();
        System.out.print("Ten San Pham: ");
        sc.nextLine();
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
        QuayKhac quaykhac = new QuayKhac(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        suaThongTinQuayKhac(a-1,quaykhac);
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

        QuayKhac khac = new QuayKhac(ten, maSo, ngayNhapHang, xuatSu, soLuong, giaCa);
        quaykhacList.add(khac);
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
