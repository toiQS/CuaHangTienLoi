package HangHoa;


public class QuayDongGoi extends KhoHang {
    private String HanSuDung_1;
    public QuayDongGoi(String Ten, String MaSo, String NgayNhapHang, int SoLuong, String XuatXu, String HanSuDung_1){
        super(Ten, MaSo, NgayNhapHang, SoLuong, XuatXu);
        this.HanSuDung_1 = HanSuDung_1;
    }
    
    public String getHanSuDung(){
        return HanSuDung_1;
    }
    public void setHanSuDung(String HanSuDung_1){
        this.HanSuDung_1 = HanSuDung_1;
    }
    
}
