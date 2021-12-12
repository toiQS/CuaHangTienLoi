package HangHoa;

import Main.ThongTin;

public class KhoHang extends ThongTin{
    public String NgayNhapHang;
    public int SoLuong;
    public String XuatXu;
    
    public KhoHang(String Ten, String Maso, String NgayNhapHang, int SoLuong, String XuatXu){
        super(Ten,Maso);
        this.NgayNhapHang = NgayNhapHang;
        this.SoLuong = SoLuong;
        this.XuatXu = XuatXu;
    }
    public String getNgayNhap(){
        return NgayNhapHang;
    }
    public int getSoLuong(){
        return SoLuong;
    }
    public String getXuatXu(){
        return XuatXu;
    }
    public void setNgayNhap(String NgayNhapHang){
        this.NgayNhapHang = NgayNhapHang;
    }
    public void setSoLuong(int SoLuong){
        this.SoLuong = SoLuong;
    }
    public void setXuatXu(String XuatXu){
        this.XuatXu = XuatXu;
    }
}
