package NhanSu;

import java.io.*;
import java.util.Scanner;

public class LaoCong extends NhanSu {
    public static int b = 1;

    public LaoCong(String Ten, String MaSo, String CCCD, String GioiTinh, String DiaChi, String SDT, float Luong) {
        super(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, Luong);
        b += 1;
    }

    public LaoCong() {

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
        System.out.print("Lương: ");
        float Luong = sc.nextInt();
        LaoCong laocong = new LaoCong(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, Luong);
        laocongList.add(laocong);
    }

    @Override
    public void del() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Mã Nhân Viên Muốn Sa Thải: ");
        String MaSo = sc.nextLine();
        LaoCong laoCong = laocongList.stream().filter(o -> o.getMaSo().equals(MaSo)).findFirst().orElse(null);
        if (laoCong == null) {
            System.out.println("Nhân Viên Không Tồn Tại!!!!!");
        }
        laocongList.remove(laoCong);
        System.out.println("Xác Nhận Sa Thải Nhân Viên.");
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

        LaoCong laoCong = new LaoCong(Ten, MaSo, CCCD, GioiTinh, DiaChi, SDT, Luong);
        laocongList.add(laoCong);
    }

    @Override
    public String toString() {
        return b + ".Họ Tên: " + Ten + " - "
                + "Mã số nhân viên: " + MaSo + " - "
                + "CCCD: " + CCCD + " - "
                + "Giới Tính: " + GioiTinh + " - "
                + "Địa Chỉ: " + DiaChi + " - "
                + "Số điện thoại: " + SDT + " - "
                + "Luong = " + Luong * 8 * 30; //Set mỗi ngày làm 8 giờ và lương tính 1 tháng 30 ngày.
    }
}