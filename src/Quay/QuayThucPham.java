package Quay;
import java.util.Scanner;
import KhoHang.KhoHang;

public class QuayThucPham extends KhoHang{
    public static int b = 1;
    public QuayThucPham(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa){
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
        b+=1;
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten San Pham: ");
        String Ten = sc.nextLine();
        System.out.println("Ma san pham: ");
        String MaSo = sc.nextLine();
        System.out.println("Ngay Nhap Hang: ");
        String NgayNhapHang = sc.nextLine();
        System.out.println("Xuat Xu: ");
        String XuatXu = sc.nextLine();
        System.out.println("So Luong Nhap Vao: ");
        int SoLuong = sc.nextInt();
        System.out.println("Gia Du Dinh: ");
        float GiaCa = sc.nextFloat();
        QuayThucPham thucpham = new QuayThucPham(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
        thucphamList.add(thucpham);
    }
    public void del(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma So Muon Xoa: ");
        String MaSo = sc.nextLine();
        QuayThucPham thucpham= this.thucphamList.stream().filter(o ->o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if(thucpham == null){
            System.out.println("Khong Ton Tai.");
        }
        this.thucphamList.remove(thucpham);
        System.out.println("Xac Nhan Xoa.");
    }
    @Override
    public String toString(){
        return b +".Ten San Pham: " +Ten+"/Ma San Pham: "+MaSo+"/Xuat Su: "+  XuatXu+"/SoLuong: "+ SoLuong+"/GiaCa: "+ GiaCa;
    }
}
