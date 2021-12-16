package Main;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Le Bao Tai
 * +---------------------------------+
 * |        Cua hang mini            |
 * +---------------------------------+
 * |    1. Admin                     |
 * |    2. Khách hàng                |
 * +---------------------------------+
 *
 * +---------------------------------+
 * |              Admin              |
 * +---------------------------------+
 * |    1. Them                      |
 * |    2. Xoa                       |
 * |    3. Sua                       |
 * |    4. Tim Kiem                  |
 * |    5. Hien danh sach thong tin  |
 * |    6. Thoat                     |
 * +---------------------------------+
 *
 * +---------------------------------+
 * |            Khach hang           |
 * +---------------------------------+
 * |    1. Mua                       |
 * |    2. Tiem Kiem                 |
 * +---------------------------------+
 *
 */

public class Main{
    public static void main(String[] args) {
        // xuat thong tin cua cua hang mini
        int endCuaHangMini = 0;
        do {
            cuaHangMini();
            switch (luaChon()) {
                // xuat thong tin lua chon cua admin
                case 1 -> {
                    int endAdmin = 0;
                    do {
                        admin();
                        switch (luaChon()) {
                            case 1 -> {
                                int endThem = 0;
                                Scanner scanner = new Scanner(System.in);
                                do {
                                    them();
                                    switch (luaChon()) {
                                        case 1 -> {
                                            System.out.println("-----------Them Gia Dung------------");
                                            System.out.print("Ten: ");
                                            String ten = scanner.nextLine();
                                            System.out.print("Ma so: ");
                                            String maSo = scanner.nextLine();
                                            System.out.print("Ngay nhap hang: ");
                                            String ngayNhapHang = scanner.nextLine();
                                            System.out.print("So luong: ");
                                            int soLuong = scanner.nextInt();
                                            System.out.print("Gia ca: ");
                                            int giaCa = scanner.nextInt();
                                            scanner.nextLine();

                                            // them loai hang hoa duoi day

                                        }
                                        case 2 -> {
                                            System.out.println("-----------Them Thuc Pham------------");
                                            System.out.print("Ten: ");
                                            String ten = scanner.nextLine();
                                            System.out.print("Ma so: ");
                                            String maSo = scanner.nextLine();
                                            System.out.print("Ngay nhap hang: ");
                                            String ngayNhapHang = scanner.nextLine();
                                            System.out.print("So luong: ");
                                            int soLuong = scanner.nextInt();
                                            System.out.print("Gia ca: ");
                                            int giaCa = scanner.nextInt();
                                            scanner.nextLine();

                                            // them loai hang hoa duoi day


                                        }

                                        case 3 -> {
                                            System.out.println("-----------Them Tuoi Song------------");
                                            System.out.print("Ten: ");
                                            String ten = scanner.nextLine();
                                            System.out.print("Ma so: ");
                                            String maSo = scanner.nextLine();
                                            System.out.print("Ngay nhap hang: ");
                                            String ngayNhapHang = scanner.nextLine();
                                            System.out.print("So luong: ");
                                            int soLuong = scanner.nextInt();
                                            System.out.print("Gia ca: ");
                                            int giaCa = scanner.nextInt();
                                            scanner.nextLine();

                                            // them loai hang hoa duoi day

                                        }

                                        case 4 -> {
                                            System.out.println("-----------Them Dong Hop------------");
                                            System.out.print("Ten: ");
                                            String ten = scanner.nextLine();
                                            System.out.print("Ma so: ");
                                            String maSo = scanner.nextLine();
                                            System.out.print("Ngay nhap hang: ");
                                            String ngayNhapHang = scanner.nextLine();
                                            System.out.print("So luong: ");
                                            int soLuong = scanner.nextInt();
                                            System.out.print("Gia ca: ");
                                            int giaCa = scanner.nextInt();
                                            scanner.nextLine();

                                            // them loai hang hoa duoi day
                                        }
                                        case 5 -> {
                                            endThem = 1;
                                        }
                                        default -> {
                                            System.out.println("Khong co lua chon nay!");
                                        }
                                    }
                                }while(endThem == 0);
                            }
                            case 2 -> {
                                System.out.println("Chon xoa");
                            }
                            case 3 -> {
                                System.out.println("Chon sua");
                            }
                            case 4 -> {
                                System.out.println("Chon tim kiem");
                            }
                            case 5 -> {
                                System.out.println("Chon hien danh sach thong tin");
                            }
                            case 6 -> {
                                endAdmin = 1;
                            }
                            default -> {
                                System.out.println("Khong co lua chon nay!");
                            }
                        }
                    } while (endAdmin == 0);
                }
                // xuat thong tin lua chon cua khach hang
                case 2 -> {
                    System.out.println("Chon khach hang");
                }
                // thoat
                case 3 -> {
                    System.out.println("Chon thoat");
                    endCuaHangMini = 1;
                }
                default -> {
                    System.out.println("Khong co lua chon nay!");
                }
            }
        } while (endCuaHangMini == 0);
    }

    private static void cuaHangMini() {
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|        Cua hang mini            |");
        System.out.println("+---------------------------------+");
        System.out.println("|    1. Admin                     |");
        System.out.println("|    2. Khách hàng                |");
        System.out.println("|    3. Thoat                     |");
        System.out.println("+---------------------------------+");
    }

    private static void khachHang() {
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

    private static void admin() {
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Admin                |");
        System.out.println("+---------------------------------+");
        System.out.println("|    1. Them                      |");
        System.out.println("|    2. Xoa                       |");
        System.out.println("|    3. Sua                       |");
        System.out.println("|    4. Tim Kiem                  |");
        System.out.println("|    5. Hien danh sach thong tin  |");
        System.out.println("|    6. Thoat                     |");
        System.out.println("+---------------------------------+");
    }

    private static void them() {
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Them                 |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Them Gia Dung              |");
        System.out.println("|   2. Them Thuc PHam             |");
        System.out.println("|   3. Them Tuoi Song             |");
        System.out.println("|   4. Them Dong Hop              |");
        System.out.println("|   5. Tro ve                     |");
        System.out.println("+---------------------------------+");
    }
    private static void xoa() {
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Xoa                  |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Xoa Gia Dung               |");
        System.out.println("|   2. Xoa Thuc PHam              |");
        System.out.println("|   3. Xoa Tuoi Song              |");
        System.out.println("|   4. Xoa Dong Hop               |");
        System.out.println("|   5. Tro ve                     |");
        System.out.println("+---------------------------------+");
    }

    private static void sua() {
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Sua                  |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Sua Gia Dung               |");
        System.out.println("|   2. Sua Thuc PHam              |");
        System.out.println("|   3. Sua Tuoi Song              |");
        System.out.println("|   4. Sua Dong Hop               |");
        System.out.println("|   5. Tro ve                     |");
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

    private static int luaChon() {
        System.out.print("Lua chon: ");
        Scanner scanner = new Scanner(System.in);
        char check = scanner.next().charAt(0);
        return check - '0';
    }
}