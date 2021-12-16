package NhanSu;

import Main.ThongTin;

public class NhanSu extends ThongTin {

    public String GioiTinh;
    public int CCCD;
    public String DiaChi;
    public String SDT;
    public int SoNgayLam;
    public int Luong;

    public NhanSu(String Ten, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, int SoNgayLam, int Luong) {
        super(Ten, MaSo);
        this.GioiTinh = GioiTinh;
        this.CCCD = CCCD;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.SoNgayLam = SoNgayLam;
        this.Luong = Luong;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getCCCD() {
        return CCCD;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
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

    public int getLuong() {
        return Luong;
    }

}