package Main;

public abstract class ThongTin {
    public String Ten;
    public String MaSo;
    public ThongTin(String Ten, String MaSo){
        this.Ten = Ten;
        this.MaSo = MaSo;
    }
    public String getTen(){
        return Ten;
    }
    public String getMaSo(){
        return MaSo;
    }
    public void setTen(String Ten){
        this.Ten = Ten;
    }
    public void setMaSo(String MaSo){
        this.MaSo = MaSo;
    }
}
