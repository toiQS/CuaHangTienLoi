package Quay;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import KhoHang.KhoHang;

public class HangHoaList {
    private List<KhoHang>khohangList;
    public HangHoaList(){
        this.khohangList = new ArrayList<>();
    }
    public void addHangHoa(KhoHang khohang){
        khohangList.add(khohang);
    }
    public List<KhoHang> searchHangHoa(String MaSo){
        return this.khohangList.stream().filter(o -> o.getMaSo().equals(MaSo)).collect(Collectors.toList());
    }
    public List<KhoHang> SuaThongTinHangHoa(int stt, KhoHang khoHang){
        khohangList.set(stt, khoHang);
        return khohangList;
    }
    public void showHangHoa(){
        this.khohangList.forEach(o -> System.out.println(o.toString()));
    }
}
