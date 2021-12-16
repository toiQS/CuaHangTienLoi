package KhoHang;

public class QuayThucPham extends KhoHang{
    public static int b = 1;
    public QuayThucPham(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa){
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
        b+=1;
    }
    @Override
    public String toString(){
        return b +".Ten San Pham: " +Ten+"/Ma San Pham: "+MaSo+"/Xuat Su: "+  XuatXu+"/SoLuong: "+ SoLuong+"/GiaCa: "+ GiaCa;
    }
}
