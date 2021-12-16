package NhanSu;

public class LaoCong extends NhanSu {
    public static int a = 1;

    public LaoCong(String Ten, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, int SoNgayLam, int Luong) {
        super(Ten, MaSo, GioiTinh, CCCD, DiaChi, SDT, SoNgayLam, Luong);
    }

    @Override
    public String toString() {
        return a + ".Họ Tên: " + Ten + "/"
                + "Mã số nhân viên: " + MaSo
                + "/Giới Tính: " + GioiTinh
                + "/CCCD: " + CCCD
                + "/Địa Chỉ: " + DiaChi
                + "/Ngày Vào Làm: " + SoNgayLam
                + "Luong = " + SoNgayLam * 176000; //Set Lương mặc định mỗi ngày là 22000
    }
}