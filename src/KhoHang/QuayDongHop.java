package KhoHang;
public class QuayDongHop extends KhoHang{
    public static int d = 1; //đếm số lượng mặt hàng có trong quầy
    public QuayDongHop(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa){
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
    }
    @Override
    public String toString(){
        return d +".Ten San Pham: " +Ten+"/Ma San Pham: "+MaSo+"/Xuat Su: "+  XuatXu+"/SoLuong: "+ SoLuong+"/GiaCa: "+ GiaCa;
    }
}
