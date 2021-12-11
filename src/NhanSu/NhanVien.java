package NhanSu;

public class NhanVien extends ThongTin {
    public static int stt = 1;
    public NhanVien(String HoTen, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, String NgayVaoLam){
        super(HoTen, MaSo, GioiTinh, CCCD, DiaChi, SDT, NgayVaoLam);
    }
    @Override
    public String toString(){
        return stt+".Họ Tên: " + HoTen + "/" + "Mã số nhân viên: "+MaSo+"/Giới Tính: "+ GioiTinh+"/CCCD: "+CCCD+"/Địa Chỉ: "+ DiaChi+"/Ngày Vào Làm: "+NgayVaoLam ;
    }
}
