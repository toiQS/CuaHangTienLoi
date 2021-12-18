package NhanSu;

import Main.ThongTin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class NhanSu extends ThongTin {
    public static List<BaoVe> baoveList = new ArrayList<>();
    public static List<LaoCong> laocongList = new ArrayList<>();
    public static List<NhanVien> nhanvienList = new ArrayList<>();

    public String CCCD;
    public String GioiTinh;
    public String MaSo;
    public String DiaChi;
    public String SDT;
    public float Luong;



    public NhanSu(String Ten, String MaSo, String CCCD, String GioiTinh, String DiaChi, String SDT, float Luong) {
        super(Ten, MaSo);
        this.CCCD = CCCD;
        this.GioiTinh = GioiTinh;
        this.MaSo = MaSo;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Luong = Luong;
    }

    public NhanSu() {

    }

    //Bảo Vệ
    public static void xuatBaoVe() {
        for (BaoVe baoVe : baoveList) {
            System.out.println(baoVe);
        }
    }

    //Lao Công
    public static void xuatLaoCong() {
        for (LaoCong laoCong : laocongList) {
            System.out.println(laoCong);
        }
    }

    //Nhân Viên Bán Hàng
    public static void xuatNhanVien() {
        for (NhanVien nhanVien : nhanvienList) {
            System.out.println(nhanVien);
        }
    }

    public static void outputFile(String URL) throws IOException {
        File file = new File(URL);
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        outputStreamWriter.write("***Bảo Vệ***\n");
        for (BaoVe baoVe : baoveList) {
            outputStreamWriter.write(String.valueOf(baoVe));
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n***Lao Công***\n");
        for (LaoCong laoCong : laocongList) {
            outputStreamWriter.write(String.valueOf(laoCong));
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
        outputStreamWriter.write("\n\n***Nhân Viên***\n");
        for (NhanVien nhanVien : nhanvienList) {
            outputStreamWriter.write(String.valueOf(nhanVien));
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
    }

    public String getCCCD() {
        return CCCD;
    }

    public void getCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public float getLuong() {
        return Luong;
    }

    public void getLuong(float Luong) {
        this.Luong = Luong;
    }

    public abstract void add();

    public abstract void del();

    public abstract void inputFile(String URL) throws IOException;
}