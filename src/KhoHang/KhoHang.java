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
<<<<<<< Updated upstream
    public static List<QuayKhac>quaykhacList = new ArrayList<>();
    public static List<QuayGiaDung>giadungList = new ArrayList<>();
    public static List<QuayNuoc>nuocList = new ArrayList<>();
    public static List<QuayTuoiSong>tuoisongList = new ArrayList<>();
=======
    public static List<QuayKhac> quaykhacList = new ArrayList<>();
    public static List<QuayGiaDung> giadungList = new ArrayList<>();
    public static List<QuayThucPham> thucphamList = new ArrayList<>();
    public static List<QuayTuoiSong> tuoisongList = new ArrayList<>();
>>>>>>> Stashed changes

    public String NgayNhapHang;
    public String XuatXu;
    public int SoLuong;
    public float GiaCa; //giá muốn bán

    public KhoHang(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo);
        this.NgayNhapHang = NgayNhapHang;
        this.XuatXu = XuatXu;
        this.SoLuong = SoLuong;
        this.GiaCa = GiaCa;
    }
<<<<<<< Updated upstream

    public KhoHang() {

    }

    public String getNgayNhapHang(){
        return NgayNhapHang;
    }
    public void setNgayNhapHang(String NgayNhapHang){
        this.NgayNhapHang = NgayNhapHang;
    }
    public String getXuatXu(){
        return XuatXu;
    }
    public void setXuatXu(String XuatXu){
        this.XuatXu = XuatXu;
    }
    public int getSoLuong(){
        return SoLuong;
    }
    public void setSoLuong(int SoLuong){
        this.SoLuong = SoLuong;
    }
    public float getGiaCa(){
        return GiaCa;
    }
    public void setGiaCa(float GiaCa){
        this.GiaCa = GiaCa;
    }
=======
>>>>>>> Stashed changes


    public abstract void add();
    public abstract void del() ;
    public abstract void inputFile(String URL) throws IOException;

    // Quay gia dung
<<<<<<< Updated upstream
    public static void xuatGiaDung(){
        System.out.println("-----------Quay Gia Dung-------------------");
        for (QuayGiaDung giaDung: giadungList) {
=======
    public static void themGiaDung(QuayGiaDung giaDung) {
        giadungList.add(giaDung);
    }

    public static void xuatGiaDung() {
        for (QuayGiaDung giaDung : giadungList) {
>>>>>>> Stashed changes
            System.out.println(giaDung);
        }
    }

    // Quay thuc pham
<<<<<<< Updated upstream
    public static void xuatNuoc() {
        System.out.println("-----------Quay Nuoc-------------------");
        for (QuayNuoc thucPham: nuocList) {
=======
    public static void themThucPham(QuayThucPham thucPham) {
        thucphamList.add(thucPham);
    }

    public static void xuatThucPham() {
        for (QuayThucPham thucPham : thucphamList) {
>>>>>>> Stashed changes
            System.out.println(thucPham);
        }
    }

    //Quay tuoi song
<<<<<<< Updated upstream
    public static void xuatTuoiSong() {
        System.out.println("-----------Quay Tuoi Song-------------------");
        for (QuayTuoiSong tuoiSong: tuoisongList) {
=======
    public static void themTuoiSong(QuayTuoiSong tuoiSong) {
        tuoisongList.add(tuoiSong);
    }

    public static void xuatTuoiSong() {
        for (QuayTuoiSong tuoiSong : tuoisongList) {
>>>>>>> Stashed changes
            System.out.println(tuoiSong);
        }
    }

    //Quay khac
<<<<<<< Updated upstream
    public static void xuatKhac() {
        System.out.println("-----------Quay Khac-------------------");
        for (QuayKhac khac: quaykhacList) {
=======
    public static void themKhac(QuayKhac khac) {
        quaykhacList.add(khac);
    }

    public static void xuatKhac() {
        for (QuayKhac khac : quaykhacList) {
>>>>>>> Stashed changes
            System.out.println(khac);
        }
    }

    //out put ra file
    public static void outputFile(String URL) throws IOException {
        File file = new File(URL);
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        //in quay tuoi song
        outputStreamWriter.write("------------Quay Tuoi Song---------------\n");
        for (QuayTuoiSong tuoiSong : tuoisongList) {
            outputStreamWriter.write(String.valueOf(tuoiSong));
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n------------Quay Gia Dung---------------\n");
        for (QuayGiaDung giaDung : giadungList) {
            outputStreamWriter.write(String.valueOf(giaDung));
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n------------Quay Tuoi Song---------------\n");
<<<<<<< Updated upstream
        for (QuayNuoc nuoc: nuocList) {
            outputStreamWriter.write(String.valueOf(nuoc));
=======
        for (QuayThucPham thucPham : thucphamList) {
            outputStreamWriter.write(String.valueOf(thucPham));
>>>>>>> Stashed changes
            outputStreamWriter.write("\n");
        }

        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n------------Quay Khac---------------\n");
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
}
