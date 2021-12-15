package NhanSu;

public class Luong {
    private int SoGioLam, LuongMoiGio;

    public Luong(int SoGioLam, int LuongMoiGio) {
        this.SoGioLam = SoGioLam;
        this.LuongMoiGio = LuongMoiGio;
    }

    public int getSoGioLam() {
        return SoGioLam;
    }

    public void setSoGioLam(int SoGioLam) {
        this.SoGioLam = SoGioLam;
    }

    public int getLuongMoiGIo() {
        return LuongMoiGio;
    }

    public void setLuongMoiGio(int LuongMoiGio) {
        this.LuongMoiGio = LuongMoiGio;
    }

    @Override
    public String toString() {
        return "Lương = " + SoGioLam + " x " + LuongMoiGio + " = " + SoGioLam * LuongMoiGio;
    }
}