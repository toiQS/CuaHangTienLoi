package NhanSu;

public class LaoCong extends NhanSu {
    public static int a = 1;
    public LaoCong(String Ten, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, String NgayVaoLam){
        super(Ten, MaSo, GioiTinh, CCCD, DiaChi, SDT, NgayVaoLam);
    }
    @Override
    public String toString(){
        return a +".Họ Tên: " + Ten + "/" + "Mã số nhân viên: "+MaSo+"/Giới Tính: "+ GioiTinh+"/CCCD: "+CCCD+"/Địa Chỉ: "+ DiaChi+"/Ngày Vào Làm: "+NgayVaoLam;
    }
}
