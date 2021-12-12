package HangHoa;

public class QuayThucPham extends KhoHang{
    private String HanSuDung_1;
    public QuayThucPham(String Ten, String MaSo, String NgayNhapHang, int SoLuong, String XuatXu){
        super(Ten, MaSo, NgayNhapHang, SoLuong, XuatXu);
    }
    public String getHanSuDung(){
        return HanSuDung_1;
    }
    public void setHanSuDung(String HanSuDung_1){
        this.HanSuDung_1 = HanSuDung_1;
    }
    @Override
    public String toString(){
        return "Ten San Pham: "+Ten+"/Ma So San Pham: "+ MaSo+"/Ngay Nhap Hang: "+ NgayNhapHang+"/So Luong: "+SoLuong+"/Xuat Xu: "+XuatXu+"/Han Su Dung: "+ HanSuDung_1;
    }
}