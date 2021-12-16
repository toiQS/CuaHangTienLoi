package DanhSachQuanLy;

import NhanSu.NhanSu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DanhSachNhanSu {
    private final List<NhanSu> nhansuList;

    public DanhSachNhanSu() {
        this.nhansuList = new ArrayList<>();
    }

    public void addNhanSu(NhanSu nhansu) {
        nhansuList.add(nhansu);
    }

    public boolean delNhanSu(int stt) {
        NhanSu nhansu = this.nhansuList.get(stt);
        if (nhansu == null) {
            return false;
        }
        this.nhansuList.remove(nhansu);
        return true;
    }

    public void showDanhSach() {
        this.nhansuList.forEach(o -> System.out.println(o.toString()));
    }

    public List<NhanSu> SuaDoiThongTin(int stt, NhanSu nhansu) {
        nhansuList.set(stt, nhansu);
        return nhansuList;
    }

    public List<NhanSu> searchNhanSu(String MaSo) {
        return this.nhansuList.stream().filter(o -> o.getMaSo().contains(MaSo)).collect(Collectors.toList());
    }
}