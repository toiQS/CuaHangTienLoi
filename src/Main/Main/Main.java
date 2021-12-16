package Main;

import java.util.Objects;
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
                    if (login()) {
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
                                                int endThemNhanSu = 0;
                                                do {
                                                    nhanSu();
                                                    switch (luaChon()) {
                                                        case 1 -> {
                                                            System.out.println("Them bao ve");
                                                        }
                                                        case 2 -> {
                                                            System.out.println("Them lao cong");
                                                        }
                                                        case 3 -> {
                                                            System.out.println("Them nhan vien");
                                                        }
                                                        case 4 -> {
                                                            endThemNhanSu = 1;
                                                        }
                                                        default -> {
                                                            System.out.println("Khong co lua chon nay!");
                                                        }
                                                    }
                                                } while (endThemNhanSu == 0);
                                            }
                                            case 6 -> {
                                                endThem = 1;
                                            }
                                            default -> {
                                                System.out.println("Khong co lua chon nay!");
                                            }
                                        }
                                    } while (endThem == 0);
                                }
                                case 2 -> {
                                    int endXoa = 0;
                                    do {
                                        xoa();
                                        switch (luaChon()) {
                                            case 1 -> {
                                                System.out.println("Chon xoa gia dung");
                                            }
                                            case 2 -> {
                                                System.out.println("Chon xoa thuc pham");
                                            }
                                            case 3 -> {
                                                System.out.println("Chon xoa tuoi song");
                                            }
                                            case 4 -> {
                                                System.out.println("Chon xoa dong hop");
                                            }
                                            case 5 -> {
                                                System.out.println("Chon xoa nhan vien");
                                            }
                                            case 6 -> {
                                                endXoa = 1;
                                            }
                                            default -> {
                                                System.out.println("Khong co lua cho nay!");
                                            }
                                        }
                                    } while (endXoa == 0);
                                }
                                case 3 -> {
                                    int endSua = 0;
                                    do {
                                        sua();
                                        switch (luaChon()) {
                                            case 1 -> {
                                                System.out.println("Chon sua gia dung");
                                            }
                                            case 2 -> {
                                                System.out.println("CHon sua thuc pham");
                                            }
                                            case 3 -> {
                                                System.out.println("Chon sua tuoi song");
                                            }
                                            case 4 -> {
                                                System.out.println("Chon sua dong hop");
                                            }
                                            case 5 -> {
                                                System.out.println("Chon sua nhan vien");
                                            }
                                            case 6 -> {
                                                endSua = 1;
                                            }
                                            default -> {
                                                System.out.println("Khong co lua chon nay!");
                                            }
                                        }
                                    } while (endSua == 0);
                                }
                                case 4 -> {
                                    timKiem();
                                    String a = nhapTimKiem();
                                }
                                case 5 -> {
                                    int endXuatThongTin = 0;
                                    do {
                                        thongTin();
                                        switch (luaChon()) {
                                            case 1 -> {
                                                System.out.println("Chon xuat ra man hinh");
                                            }
                                            case 2 -> {
                                                System.out.println("Chon xuat ra file");
                                            }
                                            case 3 -> {
                                                endXuatThongTin = 1;
                                            }
                                            default -> {
                                                System.out.println("Khong co lua chon nay!");
                                            }
                                        }
                                    } while (endXuatThongTin == 0);
                                }
                                case 6 -> {
                                    endAdmin = 1;
                                    endCuaHangMini = 1;
                                    System.out.println("Cam on ban da su dung phan men!");
                                }
                                default -> {
                                    System.out.println("Khong co lua chon nay!");
                                }
                            }
                        } while (endAdmin == 0);
                    }
                    else {
                        System.out.println("Mat khau hoac tai khoan khong dung!");
                    }
                }
                // xuat thong tin lua chon cua khach hang
                case 2 -> {
                    int endKhacHang = 0;
                    do {
                        khachHang();
                        switch (luaChon()) {
                            case 1 -> {
                                System.out.println("Chon mua");
                            }
                            case 2 -> {
                                timKiem();
                                String tenMonHang = nhapTimKiem();
                                System.out.println(tenMonHang);
                            }
                            case 3 -> {
                                endKhacHang = 1;
                                endCuaHangMini = 1;
                                System.out.println("Cam on quy khach!");
                            }
                        }
                    }while (endKhacHang == 0);
                }
                // thoat
                case 3 -> {
                    endCuaHangMini = 1;
                    System.out.println("Cam on va hen gap lai!");
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
        System.out.println("|   5. Them Nhan Su               |");
        System.out.println("|   6. Tro ve                     |");
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
        System.out.println("|   5. Xoa Nhan Su                |");
        System.out.println("|   6. Tro ve                     |");
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
        System.out.println("|   5. Sua Nhan Su                |");
        System.out.println("|   6. Tro ve                     |");
        System.out.println("+---------------------------------+");
    }

    private static void nhanSu() {
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Nhan Su              |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Bao Ve                     |");
        System.out.println("|   2. Lao Cong                   |");
        System.out.println("|   3. Nhan Vien                  |");
        System.out.println("|   4. Tro ve                     |");
        System.out.println("+---------------------------------+");
    }

    private static void thongTin() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|         Xuat thong tin          |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Xuat ra man hinh           |");
        System.out.println("|   2. Xuat ra file               |");
        System.out.println("|   3. Tro ve                     |");
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

    private static boolean login() {
        String tk = "admin";
        String mk = "admin";
        Scanner login = new Scanner(System.in);
        System.out.print("Nhap tai khoan: ");
        String checkTK = login.nextLine();
        System.out.print("Nhap mat khau: ");
        String checkMK= login.nextLine();
        return Objects.equals(checkTK, "admin") && Objects.equals(checkMK, "admin");
    }
}