package NhanSu;

public class BaoVe extends NhanSu{
    public static int b = 1;
    public BaoVe(String Ten, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, String NgayVaoLam){
        super(Ten, MaSo, GioiTinh, CCCD, DiaChi, SDT, NgayVaoLam);
    }
    @Override
    public String toString(){
        return b +".Họ Tên: " + Ten + "/" + "Mã số nhân viên: "+ MaSo +"/Giới Tính: "+ GioiTinh+"/CCCD: "+CCCD+"/Địa Chỉ: "+ DiaChi+"/Ngày Vào Làm: "+NgayVaoLam;
    }
}
