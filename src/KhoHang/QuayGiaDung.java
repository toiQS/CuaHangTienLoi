package KhoHang;

public class QuayGiaDung extends KhoHang {
    public static int c = 1; //đếm số lượng mặt hàng có trong quầy
    public QuayGiaDung(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa){
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
        c+=1;
    }
    @Override
    public String toString(){
        return c +".Ten San Pham: " +Ten+"/Ma San Pham: "+MaSo+"/Xuat Su: "+  XuatXu+"/SoLuong: "+ SoLuong+"/GiaCa: "+ GiaCa;
    }
}
