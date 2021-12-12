package NhanSu;

public class NhanVien extends NhanSu {
    public static int stt = 1;
    public NhanVien(String Ten, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, String NgayVaoLam){
        super(Ten, MaSo, GioiTinh, CCCD, DiaChi, SDT, NgayVaoLam);
    }
    @Override
    public String toString(){
        return stt+".Họ Tên: " + Ten + "/" + "Mã số nhân viên: "+MaSo+"/Giới Tính: "+ GioiTinh+"/CCCD: "+CCCD+"/Địa Chỉ: "+ DiaChi+"/Ngày Vào Làm: "+NgayVaoLam ;
    }
}
