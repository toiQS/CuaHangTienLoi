package NhanSu;

public abstract class ThongTin {
    public String HoTen;
    public String MaSo;
    public String GioiTinh;
    public int CCCD;
    public String DiaChi;
    public String SDT;
    public String NgayVaoLam;
    
    public ThongTin(String HoTen, String MaSo, String GioiTinh, int CCCD, String DiaChi, String SDT, String NgayVaoLam){
        this.HoTen = HoTen;
        this.MaSo = MaSo;
        this.GioiTinh = GioiTinh;
        this.CCCD = CCCD;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.NgayVaoLam = NgayVaoLam;
        
    }
    
    public String getHoTen(){
        return HoTen;
    }
    public String getMaSo(){
        return MaSo;
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
    

    public void setHoTen(String HoTen){
        this.HoTen = HoTen;
    }
    public void setMaSo(String MaSo){
        this.MaSo = MaSo;
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
