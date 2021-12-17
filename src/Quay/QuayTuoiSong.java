package Quay;

import java.util.Scanner;
import KhoHang.KhoHang;

public class QuayTuoiSong extends KhoHang {
    public static int a = 1; //đếm số lượng mặt hàng có trong quầy
    public QuayTuoiSong(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa){
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
        a+=1;
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
        QuayTuoiSong tuoisong = new QuayTuoiSong(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
        tuoisongList.add(tuoisong);
    }
    public void del(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma So Muon Xoa: ");
        String MaSo = sc.nextLine();
        QuayTuoiSong tuoisong = this.tuoisongList.stream().filter(o ->o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if(tuoisong == null){
            System.out.println("Khong Ton Tai.");
        }
        this.tuoisongList.remove(tuoisong);
        System.out.println("Xac Nhan Xoa.");
    }
    @Override
    public String toString(){
        return a +".Ten San Pham: " +Ten+"/Ma San Pham: "+MaSo+"/Xuat Su: "+  XuatXu+"/SoLuong: "+ SoLuong+"/GiaCa: "+ GiaCa;
    }
}
