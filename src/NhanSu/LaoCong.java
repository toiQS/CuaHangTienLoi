package NhanSu;

public class LaoCong extends NhanSu {
    public static int b = 1;

    public LaoCong(String Ten, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, int SoNgayLam, int Luong) {
        super(Ten, MaSo, GioiTinh, CCCD, DiaChi, SDT, SoNgayLam, Luong);
        b += 1;
    }

    @Override
    public String toString() {
        return b + ".Họ Tên: " + Ten + "/"
                + "Mã số nhân viên: " + MaSo
                + "/Giới Tính: " + GioiTinh
                + "/CCCD: " + CCCD
                + "/Địa Chỉ: " + DiaChi
                + "/Số Ngày Làm: " + SoNgayLam
                + "Luong = " + SoNgayLam * 176000; //Set Lương mặc định là 22000/giờ, Mỗi ngày làm 8 giờ
    }
}
