package NhanSu;

import Main.ThongTin;

public class NhanSu extends ThongTin{
   
    public String GioiTinh;
    public int CCCD;
    public String DiaChi;
    public String SDT;
    public String NgayVaoLam;
    
    public NhanSu(String Ten, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, String NgayVaoLam){
        super(Ten,MaSo);
        this.GioiTinh = GioiTinh;
        this.CCCD = CCCD;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.NgayVaoLam = NgayVaoLam;
        
    }
    
  
    public String getGioiTinh(){
        return GioiTinh;
    }
    public int getCCCD(){
        return CCCD;
    }
    public String getDiaChi(){
        return DiaChi;
    }
    public String getSDT(){
        return SDT;
    }
    public String getNgayVaoLam(){
        return NgayVaoLam;
    }
    

    
    public void setGioiTinh(String GioiTinh){
        this.GioiTinh = GioiTinh;
    }
    public void setCCCD(int CCCD){
        this.CCCD = CCCD;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChi = DiaChi;
    }
    public void setSDT(String SDT){
        this.SDT = SDT;
    }
    public void getNgayVaoLam(String NgayVaoLam){
        this.NgayVaoLam = NgayVaoLam;
    }
     
}
