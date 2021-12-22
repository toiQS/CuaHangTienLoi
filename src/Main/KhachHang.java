package Main;

import java.util.Scanner;

public class KhachHang {

    public void khachHang() {
        int endKhachHang = 0;
        do {
            menu();
            switch (luaChon()) {
                case 1 -> {
                    System.out.println("Mua");
                }
                case 2 -> {
                    timKiem();
                    String inputKhacHang = nhapTimKiem();
                    System.out.println(inputKhacHang);
                }
                case 3 -> {
                    System.out.println("Giỏ hàng");
                }

                case 4 -> {
                    endKhachHang = 1;
                    Main.endCuaHang(endKhachHang);
                    System.out.println("Cảm ơn và hẹn gặp lại!");
                }
                default -> {
                    System.out.println("Không có lựa chọn này!");
                }
            }
        } while(endKhachHang == 0);
    }

    public void menu() {
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Khách hàng           |");
        System.out.println("+---------------------------------+");
        System.out.println("|    1. Mua                       |");
        System.out.println("|    2. Tìm kiếm                 |");
        System.out.println("|    3. Giỏ hàng                 |");
        System.out.println("|    4. Thoát                     |");
        System.out.println("+---------------------------------+");
    }

    private static void timKiem() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Tìm kiếm             |");
        System.out.println("+---------------------------------+");
    }

    private static String nhapTimKiem() {
        System.out.print("Nhập tên món hàng cần tìm: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int luaChon() {
        System.out.print("Nhập lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        char check = scanner.next().charAt(0);
        return check - '0';
    }
}
