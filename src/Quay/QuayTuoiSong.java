package Quay;

import KhoHang.KhoHang;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuayTuoiSong extends KhoHang {
    public static int soLuong = 0;
    public static float giaCa = 0;
    private static final String formatHangHoaTieuDe = "%s %.3s %s %-15s %s %-13s %s %-15s %s %-10s %s %-10s %s %-15s %s\n";
    private static final String formatHangHoaOutput = "%s %3d %s %-15s %s %-13s %s %-15s %s %-10s %s %-10d %s %-15.3f %s\n";

    public QuayTuoiSong(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
    }

    public QuayTuoiSong() {

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
        QuayTuoiSong tuoisong = new QuayTuoiSong(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        tuoisongList.add(tuoisong);
    }

    public void del() {
        KhoHang.xuatTuoiSong();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma So Muon Xoa: ");
        String MaSo = sc.nextLine();
        QuayTuoiSong tuoisong = tuoisongList.stream().filter(o -> o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if (tuoisong == null) {
            System.out.println("Khong Ton Tai.");
        }
        tuoisongList.remove(tuoisong);
        System.out.println("Xac Nhan Xoa.");
    }

    @Override
    public void showThongTin() {
//        this.nuocList.forEach(o -> System.out.println(o.toString()));
        System.out.print("+");
        for (int i=0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.printf(formatHangHoaTieuDe,
            "|", "STT", "|", "Ten San Pham", "|", "Ma San Pham", "|", "Ngay Nhap Hang", "|", "Xuat Su", "|", "So Luong", "|", "Gia Ca", "|");
        System.out.print("+");
        for (int i=0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        int a = 1;
        for (QuayTuoiSong tuoiSong: tuoisongList) {
            String ten = tuoiSong.getTen();
            String maSo = tuoiSong.getMaSo();
            String ngayNhapHang = tuoiSong.getNgayNhapHang();
            String xuatSu = tuoiSong.getXuatXu();
            int soLuong = tuoiSong.getSoLuong();
            float giaCa = tuoiSong.getGiaCa();

            System.out.printf(formatHangHoaOutput,
                "|", a, "|", ten, "|", maSo, "|", ngayNhapHang, "|", xuatSu, "|", soLuong, "|", giaCa, "|");
            a++;
        }
        System.out.print("+");
        for (int i=0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }


    public List<QuayTuoiSong> TimKiemTuoiSong(String MaSo){
        return this.tuoisongList.stream().filter(o ->o.getMaSo().contains(MaSo)).collect(Collectors.toList());
    }
    @Override
    public void TimKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham muon tim: ");
        String a = sc.nextLine();
        TimKiemTuoiSong(a).forEach(tuoiSong -> {
            System.out.println(tuoiSong.toString());
        });
    }

    public List<QuayTuoiSong> SuaThongTinQuayTuoiSong(int stt, QuayTuoiSong tuoisong){
        tuoisongList.set(stt,tuoisong);
        return tuoisongList;
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
        QuayTuoiSong tuoisong = new QuayTuoiSong(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        SuaThongTinQuayTuoiSong(a-1, tuoisong);
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

        QuayTuoiSong tuoiSong = new QuayTuoiSong(ten, maSo, ngayNhapHang, xuatSu, soLuong, giaCa);
        tuoisongList.add(tuoiSong);
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
