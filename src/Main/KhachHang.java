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
                    endKhachHang = 1;
                    Main.endCuaHang(endKhachHang);
                    System.out.println("Cam on va hen gap lai!");
                }
                default -> {
                    System.out.println("Khong co lua chon nay!");
                }
            }
        } while(endKhachHang == 0);
    }

    public void menu() {
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Khach hang           |");
        System.out.println("+---------------------------------+");
        System.out.println("|    1. Mua                       |");
        System.out.println("|    2. Tiem Kiem                 |");
        System.out.println("|    3. Thoat                     |");
        System.out.println("+---------------------------------+");
    }

    private static void timKiem() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Tim Kiem             |");
        System.out.println("+---------------------------------+");
    }

    private static String nhapTimKiem() {
        System.out.println("Nhap ten mon hang can tim");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int luaChon() {
        System.out.print("Lua chon: ");
        Scanner scanner = new Scanner(System.in);
        char check = scanner.next().charAt(0);
        return check - '0';
    }
}
