package NhanSu;

public class LaoCong extends ThongTin {
    public static int a = 1;
    public LaoCong(String HoTen, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, String NgayVaoLam){
        super(HoTen, MaSo, GioiTinh, CCCD, DiaChi, SDT, NgayVaoLam);
    }
    @Override
    public String toString(){
        return a +".Họ Tên: " + HoTen + "/" + "Mã số nhân viên: "+MaSo+"/Giới Tính: "+ GioiTinh+"/CCCD: "+CCCD+"/Địa Chỉ: "+ DiaChi+"/Ngày Vào Làm: "+NgayVaoLam;
    }
}
