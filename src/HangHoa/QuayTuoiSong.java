package HangHoa;

public class QuayTuoiSong extends KhoHang{
    public static String HanSuDung = "Trong Ngay"; //hạn sử dụng trong ngày
    public QuayTuoiSong(String Ten, String MaSo, String NgayNhapHang, int SoLuong, String XuatXu){
        super(Ten, MaSo, NgayNhapHang, SoLuong, XuatXu);
    }
    @Override
    public String toString(){
        return "Ten San Pham: "+Ten+"/Ma So San Pham: "+ MaSo+"/Ngay Nhap Hang: "+ NgayNhapHang+"/So Luong: "+SoLuong+"/Xuat Xu: "+XuatXu+"/Han Su Dung: "+ HanSuDung;
    }
}
