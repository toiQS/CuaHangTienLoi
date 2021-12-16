package NhanSu;

public class BaoVe extends NhanSu {
    public static int b = 1;

    public BaoVe(String Ten, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, int SoNgayLam, int Luong) {
        super(Ten, MaSo, GioiTinh, CCCD, DiaChi, SDT, SoNgayLam, Luong);
    }

    @Override
    public String toString() {
        return b + ".Họ Tên: " + Ten + "/"
                + "Mã số nhân viên: " + MaSo
                + "/Giới Tính: " + GioiTinh
                + "/CCCD: " + CCCD
                + "/Địa Chỉ: " + DiaChi
                + "/Số Ngày Làm: " + SoNgayLam
                + "Luong = " + SoNgayLam*176000; //Set Lương mặc định mỗi ngày là 22000
    }
}