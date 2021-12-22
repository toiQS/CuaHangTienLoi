package Quay;

import KhoHang.KhoHang;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuayTuoiSong extends KhoHang {
    public static int soLuong = 0;
    public static float giaCa = 0;

    public QuayTuoiSong(String Ten, String MaSo, String NgayNhapHang, String XuatXu, int SoLuong, float GiaCa) {
        super(Ten, MaSo, NgayNhapHang, XuatXu, SoLuong, GiaCa);
    }

    public QuayTuoiSong() {

    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên sản phẩm: ");
        String Ten = sc.nextLine();
        System.out.print("Mã sản phẩm: ");
        String MaSo = sc.nextLine();
        System.out.print("Ngày nhập hàng: ");
        String NgayNhapHang = sc.nextLine();
        System.out.print("Xuất xứ: ");
        String XuatXu = sc.nextLine();
        do {
            System.out.print("Số lượng nhập vào: ");
            try {
                soLuong = sc.nextInt();
            } catch(Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        }while(soLuong == 0);

        do {
            System.out.print("Giá dự định: ");
            try {
                giaCa = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        } while(giaCa == 0);
        QuayTuoiSong tuoisong = new QuayTuoiSong(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        tuoisongList.add(tuoisong);
    }

    public void del() {
        KhoHang.xuatTuoiSong();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số sản phẩm muốn xoá: ");
        String MaSo = sc.nextLine();
        QuayTuoiSong tuoisong = tuoisongList.stream().filter(o -> o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if (tuoisong == null) {
            System.out.println("Khong Ton Tai.");
        }
        tuoisongList.remove(tuoisong);
        System.out.println("Xac Nhan Xoa.");
    }


    public List<QuayTuoiSong> TimKiemTuoiSong(String MaSo) {
        return this.tuoisongList.stream().filter(o->o.getMaSo().equals(MaSo)).collect(Collectors.toList());
    }
    @Override
    public void TimKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số sản phẩm muốn tìm: ");
        String MaSo = sc.nextLine();
        TimKiemTuoiSong(MaSo);
    }

    public List<QuayTuoiSong> SuaThongTinQuayTuoiSong(int stt, QuayTuoiSong tuoisong){
        tuoisongList.set(stt,tuoisong);
        return tuoisongList;
    }
    @Override
    public void SuaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập STT muốn sửa thông tin: ");
        int a = sc.nextInt();
        System.out.print("Tên sản phẩm: ");
        String Ten = sc.nextLine();
        sc.nextLine();
        System.out.print("Mã sản phẩm: ");
        String MaSo = sc.nextLine();
        System.out.print("Ngày nhập hàng: ");
        String NgayNhapHang = sc.nextLine();
        System.out.print("Xuất xứ: ");
        String XuatXu = sc.nextLine();
        do {
            System.out.print("Số lượng nhập vào: ");
            try {
                soLuong = sc.nextInt();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        }while(soLuong == 0);

        do {
            System.out.print("Giá dự định: ");
            try {
                giaCa = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        }while(giaCa == 0);
        QuayTuoiSong tuoisong = new QuayTuoiSong(Ten, MaSo, NgayNhapHang, XuatXu, soLuong, giaCa);
        SuaThongTinQuayTuoiSong(a-1, tuoisong);
    }

    @Override
    public void inputFile(String URL) throws IOException {
        File file = new File(URL);
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String ten = reader.readLine();
        String maSo = reader.readLine();
        String ngayNhapHang = reader.readLine();
        String xuatSu = reader.readLine();
        int soLuong = Integer.parseInt(reader.readLine());
        float giaCa = Float.parseFloat(reader.readLine());

        QuayTuoiSong tuoiSong = new QuayTuoiSong(ten, maSo, ngayNhapHang, xuatSu, soLuong, giaCa);
        tuoisongList.add(tuoiSong);
    }

    @Override
    public String toString() {
        return  ".Tên sản phẩm: " + Ten + " - "
                + "Mã sản phẩm: " + MaSo + " - "
                + "Xuất xứ: " + XuatXu + " - "
                + "Số lượng: " + SoLuong + " - "
                + "Giá cả: " + GiaCa;
    }
}
