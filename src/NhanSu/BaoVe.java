package NhanSu;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BaoVe extends NhanSu {
    public static int a = 1;
    public static float luong = 0;

    public BaoVe(String Ten, String MaSo, String CCCD, String GioiTinh, String DiaChi, String SDT, float Luong) {
        super(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, Luong);
        a += 1;
    }

    public BaoVe() {

    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên nhân viên: ");
        String Ten = sc.nextLine();
        System.out.print("Mã nhân viên: ");
        String MaSo = sc.nextLine();
        System.out.print("Căn cước công dân: ");
        String CCCD = sc.nextLine();
        System.out.print("Giới tính: ");
        String GioiTinh = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String DiaChi = sc.nextLine();
        System.out.print("Số điện thoại: ");
        String SDT = sc.nextLine();
        do {
            System.out.print("Lương: ");
            try {
                luong = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        } while(luong == 0);
        BaoVe baove = new BaoVe(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, luong);
        baoveList.add(baove);
    }

    @Override
    public void del() {
        NhanSu.xuatBaoVe();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Mã Nhân Viên Muốn Sa Thải: ");
        String MaSo = sc.nextLine();
        BaoVe baoVe = baoveList.stream().filter(o -> o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if (baoVe == null) {
            System.out.println("Nhân Viên Không Tồn Tại!!!!!");
        }
        baoveList.remove(baoVe);
        System.out.println("Xác Nhận Sa Thải Nhân Viên.");
    }

    public List<BaoVe> TimKiemBaoVe(String MaSo){
        return baoveList.stream().filter(o -> o.getMaSo().equals(MaSo)).collect(Collectors.toList());
    }
    @Override
    public void TimKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã số nhân viên cần tìm: ");
        String MaSo = sc.nextLine();
        TimKiemBaoVe(MaSo);
    }

    public List<BaoVe> SuaThongTinBaoVe(int stt, BaoVe baoVe){
        baoveList.set(stt,baoVe);
        return baoveList;
    }
    @Override
    public void SuaThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vị trí muốn sửa: ");
        int a = sc.nextInt();
        System.out.print("Tên nhân viên: ");
        String Ten = sc.nextLine();
        System.out.print("Mã nhân viên: ");
        String MaSo = sc.nextLine();
        System.out.print("Căn cước công dân: ");
        String CCCD = sc.nextLine();
        System.out.print("Giới tính: ");
        String GioiTinh = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String DiaChi = sc.nextLine();
        System.out.print("Số điện thoại: ");
        String SDT = sc.nextLine();
        do {
            System.out.print("Lương: ");
            try {
                luong = sc.nextFloat();
            } catch (Exception ignored) {
                System.out.println("Không hợp lệ, vui lòng nhập lại!");
                sc.nextLine();
            }
        } while(luong == 0);
        BaoVe baoVe = new BaoVe(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, luong);
        SuaThongTinBaoVe(a-1,baoVe);
    }

    @Override
    public void inputFile(String URL) throws IOException {
        File file = new File(URL);
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String Ten = reader.readLine();
        String MaSo = reader.readLine();
        String CCCD = reader.readLine();
        String GioiTinh = reader.readLine();
        String DiaChi = reader.readLine();
        String SDT = reader.readLine();
        float Luong = Float.parseFloat(reader.readLine());

        BaoVe baoVe = new BaoVe(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, Luong);
        baoveList.add(baoVe);
    }

    @Override
    public String toString() {
        return a + ".Họ Tên: " + Ten + " - "
                + "Mã số nhân viên: " + MaSo + " - "
                + "CCCD: " + CCCD + " - "
                + "Giới Tính: " + GioiTinh + " - "
                + "Địa Chỉ: " + DiaChi + " - "
                + "Số điện thoại: " + SDT + " - "
                + "Lương = " + Luong * 8 * 30; //Set mỗi ngày làm 8 giờ và lương tính 1 tháng 30 ngày.
    }
}