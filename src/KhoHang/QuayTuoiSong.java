package KhoHang;

public class QuayTuoiSong extends KhoHang {
    public static int a = 1; //đếm số lượng mặt hàng có trong quầy
    public QuayTuoiSong(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa){
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
        a+=1;
    }
    @Override
    public String toString(){
        return a +".Ten San Pham: " +Ten+"/Ma San Pham: "+MaSo+"/Xuat Su: "+  XuatXu+"/SoLuong: "+ SoLuong+"/GiaCa: "+ GiaCa;
    }
}
