package KhachHang;
import java.util.Date;

public class ChiTietHoaDon extends XuLy {

    // Xuất list hóa đơn + giá tổng
    public void xuatHoaDon(){

        System.out.println("       ---------------------------------------------------------");
        Date date = new Date();

        System.out.println();
        for(XuLy HOADON : XuLy.ListHoaDon)
            if(HOADON != null)
                System.out.println(HOADON);
        System.out.println();
        System.out.println("       ---------------------------------------------------------");
        System.out.println("                       Tổng tiền  : "+ XuLy.tongGia );
        System.out.println("                                         "+date.toString());
    }
}
