package KhachHang;


public class ChiTietHoaDon extends XuLy {

    // Xuất list hóa đơn + giá tổng
    public void xuatHoaDon(){
        System.out.println("       ---------------------------------------------------------");
        System.out.println();
        for(XuLy HOADON : XuLy.ListHoaDon)
            if(HOADON != null)
                System.out.println(HOADON);
        System.out.println();
        System.out.println("       ---------------------------------------------------------");
        System.out.println("                       Tổng tiền  : "+ XuLy.tongGia );
    }
}
