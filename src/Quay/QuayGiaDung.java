package Quay;

import KhoHang.KhoHang;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuayGiaDung extends KhoHang {
    public static int a = 1; //đếm số lượng mặt hàng có trong quầy

    public QuayGiaDung(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
        a += 1;
    }

    public QuayGiaDung() {

    }

    @Override
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
        System.out.println("So Luong Nhap Vao: ");
        int SoLuong = sc.nextInt();
        System.out.println("Gia Du Dinh: ");
        float GiaCa = sc.nextFloat();
        QuayGiaDung giadung = new QuayGiaDung(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
        giadungList.add(giadung);
    }

    @Override
    public void del() {
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

    @Override
    public List<QuayGiaDung> TimKiemGiaDung(String MaSo){
        return this.giadungList.stream().filter(o -> o.getMaSo().equals(MaSo)).collect(Collectors.toList());
    }

    @Override
    public List<QuayGiaDung> SuaThongTinGiaDung(int stt, QuayGiaDung giadung){
        giadungList.set(stt,giadung);
        return giadungList;
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
        return a + ".Ten San Pham: " + Ten + " - "
                + "Ma San Pham: " + MaSo + " - "
                + "Xuat Su: " + XuatXu + " - "
                + "SoLuong: " + SoLuong + " - "
                + "GiaCa: " + GiaCa;
    }
}
