package KhoHang;

import Main.ThongTin;
import Quay.QuayGiaDung;
import Quay.QuayKhac;
import Quay.QuayNuoc;
import Quay.QuayTuoiSong;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class KhoHang extends ThongTin {
    public static List<QuayKhac> quaykhacList = new ArrayList<>();
    public static List<QuayGiaDung> giadungList = new ArrayList<>();
    public static List<QuayNuoc> nuocList = new ArrayList<>();
    public static List<QuayTuoiSong> tuoisongList = new ArrayList<>();

    public String NgayNhapHang;
    public String XuatXu;
    public int SoLuong;
    public float GiaCa; //giá muốn bán

    private static final String formatHangHoaTieuDe = "%s %.3s %s %-15s %s %-13s %s %-15s %s %-10s %s %-10s %s %-15s %s\n";
    private static final String formatHangHoaOutput = "%s %3d %s %-15s %s %-13s %s %-15s %s %-10s %s %-10d %s %-15.3f %s\n";


    public KhoHang(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo);
        this.NgayNhapHang = NgayNhapHang;
        this.XuatXu = XuatXu;
        this.SoLuong = SoLuong;
        this.GiaCa = GiaCa;
    }

    public KhoHang() {

    }

    // Quay gia dung
    public static void xuatGiaDung() {
        System.out.println("***Quay Gia Dung***");
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

        int a = 0;
        for (QuayGiaDung giaDung: giadungList) {
            String ten = giaDung.getTen();
            String maSo = giaDung.getMaSo();
            String ngayNhapHang = giaDung.getNgayNhapHang();
            String xuatSu = giaDung.getXuatXu();
            int soLuong = giaDung.getSoLuong();
            float giaCa = giaDung.getGiaCa();

            System.out.printf(formatHangHoaOutput,
                    "|", a, "|", ten, "|", ngayNhapHang, "|", maSo, "|", xuatSu, "|", soLuong, "|", giaCa, "|");
            a++;
        }
        System.out.print("+");
        for (int i=0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    // Quay thuc pham
    public static void xuatNuoc() {
        System.out.println("***Quay Nuoc***");
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

        int a = 0;
        for (QuayNuoc nuoc: nuocList) {
            String ten = nuoc.getTen();
            String maSo = nuoc.getMaSo();
            String ngayNhapHang = nuoc.getNgayNhapHang();
            String xuatSu = nuoc.getXuatXu();
            int soLuong = nuoc.getSoLuong();
            float giaCa = nuoc.getGiaCa();

            System.out.printf(formatHangHoaOutput,
                    "|", a, "|", ten, "|", ngayNhapHang, "|", maSo, "|", xuatSu, "|", soLuong, "|", giaCa, "|");
            a++;
        }
        System.out.print("+");
        for (int i=0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    //Quay tuoi song
    public static void xuatTuoiSong() {
        System.out.println("***Quay Tuoi Song***");
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

        int a = 0;
        for (QuayTuoiSong tuoiSong: tuoisongList) {
            String ten = tuoiSong.getTen();
            String maSo = tuoiSong.getMaSo();
            String ngayNhapHang = tuoiSong.getNgayNhapHang();
            String xuatSu = tuoiSong.getXuatXu();
            int soLuong = tuoiSong.getSoLuong();
            float giaCa = tuoiSong.getGiaCa();

            System.out.printf(formatHangHoaOutput,
                    "|", a, "|", ten, "|", ngayNhapHang, "|", maSo, "|", xuatSu, "|", soLuong, "|", giaCa, "|");
            a++;
        }
        System.out.print("+");
        for (int i=0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    //Quay khac
    public static void xuatKhac() {
        System.out.println("***Quay Khac***");
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

        int a = 0;
        for (QuayKhac khac: quaykhacList) {
            String ten = khac.getTen();
            String maSo = khac.getMaSo();
            String ngayNhapHang = khac.getNgayNhapHang();
            String xuatSu = khac.getXuatXu();
            int soLuong = khac.getSoLuong();
            float giaCa = khac.getGiaCa();

            System.out.printf(formatHangHoaOutput,
                    "|", a, "|", ten, "|", ngayNhapHang, "|", maSo, "|", xuatSu, "|", soLuong, "|", giaCa, "|");
            a++;
        }
        System.out.print("+");
        for (int i=0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    //out put ra file
    public static void outputFile(String URL) throws IOException {
        File file = new File(URL);
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        //in quay tuoi song
        outputStreamWriter.write("***Quay Tuoi Song***\n");
        for (QuayTuoiSong tuoiSong : tuoisongList) {
            outputStreamWriter.write(String.valueOf(tuoiSong));
            outputStreamWriter.write("\n");
        }

        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n***Quay Gia Dung***\n");
        for (QuayGiaDung giaDung : giadungList) {
            outputStreamWriter.write(String.valueOf(giaDung));
            outputStreamWriter.write("\n");
        }

        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n***Quay Nuoc***\n");
        for (QuayNuoc nuoc : nuocList) {
            outputStreamWriter.write(String.valueOf(nuoc));
            outputStreamWriter.write("\n");
        }

        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n***Quay Khac***\n");
        for (QuayKhac khac : quaykhacList) {
            outputStreamWriter.write(String.valueOf(khac));
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
    }

    public String getNgayNhapHang() {
        return NgayNhapHang;
    }

    public void setNgayNhapHang(String NgayNhapHang) {
        this.NgayNhapHang = NgayNhapHang;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String XuatXu) {
        this.XuatXu = XuatXu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGiaCa() {
        return GiaCa;
    }

    public void setGiaCa(float GiaCa) {
        this.GiaCa = GiaCa;
    }

    public abstract void add();

    public abstract void del();

    public abstract void inputFile(String URL) throws IOException;
}