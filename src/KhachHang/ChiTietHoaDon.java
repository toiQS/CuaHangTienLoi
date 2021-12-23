package KhachHang;

import KhachHang.XuLy;

public class ChiTietHoaDon extends XuLy {

    // Xuất list hóa đơn + giá tổng
    public void xuatHoaDon(){
        System.out.println("       ---------------------------------------------------------");
        System.out.println();
        for(XuLy HOADON : XuLy.ListHoaDon)
            if(HOADON instanceof XuLy)
                System.out.println(HOADON);
        System.out.println();
        System.out.println("       ---------------------------------------------------------");
        System.out.println("                       Tổng tiền  : "+ XuLy.tongGia );
    }
}
