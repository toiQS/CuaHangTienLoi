package NhanSu;

public class BaoVe extends ThongTin{
    public static int b = 1;
    public BaoVe(String HoTen, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, String NgayVaoLam){
        super(HoTen, MaSo, GioiTinh, CCCD, DiaChi, SDT, NgayVaoLam);
    }
    @Override
    public String toString(){
        return b +".Họ Tên: " + HoTen + "/" + "Mã số nhân viên: "+MaSo+"/Giới Tính: "+ GioiTinh+"/CCCD: "+CCCD+"/Địa Chỉ: "+ DiaChi+"/Ngày Vào Làm: "+NgayVaoLam;
    }
}
