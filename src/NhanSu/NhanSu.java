package NhanSu;

import Main.ThongTin;

import java.util.ArrayList;
import java.util.List;

public class NhanSu extends ThongTin {
    public static List<BaoVe> baoVeList = new ArrayList<>();
    public static List<LaoCong> laoCongList = new ArrayList<>();
    public static List<NhanVien> nhanVienList = new ArrayList<>();

    public String GioiTinh;
    public String MaSo;
    public String DiaChi;
    public String SDT;
    public int SoNgayLam;

    public NhanSu(String Ten, String MaSo, String GioiTinh, String DiaChi, String SDT, int SoNgayLam) {
        super(Ten, MaSo);
        this.GioiTinh = GioiTinh;
        this.MaSo = MaSo;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.SoNgayLam = SoNgayLam;
    }

    public static void themBaoVe(BaoVe baoVe) {
        baoVeList.add(baoVe);
    }

    public static void xuatBaoVe() {
        for (BaoVe baoVe : baoVeList) {
            System.out.println(baoVe);
        }
    }

    public static void themLaoCong(LaoCong laoCong) {
        laoCongList.add(laoCong);
    }

    public static void xuatLaoCong() {
        for (LaoCong laoCong : laoCongList) {
            System.out.println(laoCong);
        }
    }

    public String getTen() {
        return Ten;
    }

    public void getTen(String Ten) {
        this.Ten = Ten;
    }

    public String getMaSo() {
        return MaSo;
    }

    public void setMaSo(String MaSo) {
        this.MaSo = MaSo;
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

    public int getSoNgayLam() {
        return SoNgayLam;
    }

    public void getSoNgayLam(int SoNgayLam) {
        this.SoNgayLam = SoNgayLam;
    }

//    public int getLuong() {
//        return Luong;
//    }
//
//    public void getLuong(int Luong) {
//        this.Luong = Luong;
//    }
}