package Main;

import KhoHang.KhoHang;
import NhanSu.NhanSu;
import NhanSu.BaoVe;
import Quay.QuayGiaDung;
import Quay.QuayKhac;
import Quay.QuayNuoc;
import Quay.QuayTuoiSong;

import java.io.IOException;
import java.util.Scanner;

public class QuanLy {

    public void admin() throws IOException {
        int endAdmin = 0;
        do {
            menu();
            switch (luaChon()) {
                case 1 -> {
                    int endThem = 0;
                    do {
                        them();
                        switch (luaChon()) {
                            case 1 -> {
                                System.out.println("---------Them Gia Dung---------");
                                KhoHang giaDung = new QuayGiaDung();
                                giaDung.add();
                            }
                            case 2 -> {
                                System.out.println("---------Them Nuoc---------");
                                KhoHang thucPham = new QuayNuoc();
                                thucPham.add();
                            }
                            case 3 -> {
                                System.out.println("---------Them Tuoi Song---------");
                                KhoHang tuoiSong = new QuayTuoiSong();
                                tuoiSong.add();
                            }
                            case 4 -> {
                                System.out.println("---------Them Khac---------");
                                KhoHang khac = new QuayKhac();
                                khac.add();
                            }
                            case 5 -> {
                                int endNhanSu = 0;
                                do {
                                    nhanSu();
                                    switch (luaChon()) {
                                        case 1 -> {

                                        }
                                    }
                                } while(endNhanSu == 0);
                            }
                            case 6 -> {
                                endThem = 1;
                            }
                            default -> {
                                System.out.println("Khong co lua chon nay!");
                            }
                        }
                    } while(endThem == 0);
                }
                case 2 -> {
                    int endXoa = 0;
                    do {
                        xoa();
                        switch (luaChon()) {
                            case 1 -> {
                                KhoHang.xuatGiaDung();
                                KhoHang khoHang = new QuayGiaDung();
                                khoHang.del();
                            }
                            case 2 -> {
                                KhoHang.xuatNuoc();
                                KhoHang khoHang = new QuayNuoc();
                                khoHang.del();
                            }
                            case 3 -> {
                                KhoHang.xuatTuoiSong();
                                KhoHang khoHang = new QuayTuoiSong();
                                khoHang.del();
                            }
                            case 4 -> {
                                KhoHang.xuatKhac();
                                KhoHang khoHang = new QuayKhac();
                                khoHang.del();
                            }
                            case 5 -> {

                            }
                            case 6 -> {
                                endXoa = 1;
                            }
                            default -> {
                                System.out.println("Khong co lua chon nay!");
                            }
                        }
                    } while (endXoa == 0);
                }
                case 3 -> {
                    System.out.println("Sua");
                }
                case 4 -> {
                    System.out.println("Tim Kiem");
                }
                case 5 -> {
                    int endThongTin = 0;
                    do {
                        thongTin();
                        switch (luaChon()) {
                            case 1 -> {
                                KhoHang.xuatGiaDung();
                                KhoHang.xuatNuoc();
                                KhoHang.xuatTuoiSong();
                                KhoHang.xuatKhac();
                            }
                            case 2 -> {
                                System.out.println("Da xuat ra file thanh cong!");
                                KhoHang.outputFile("src/Database/output.txt");
                            }
                            case 3 -> {
                                endThongTin = 1;
                            }
                            default -> {
                                System.out.println("Khong co lua chon nay!");
                            }
                        }
                    }while(endThongTin == 0);
                }
                case 6 -> {
                    endAdmin = 1;
                    Main.endCuaHang(endAdmin);
                    System.out.println("Cam on da su dung phan men!");
                }
                default -> {
                    System.out.println("Khong co lua chon nay!");
                }
            }
        } while(endAdmin == 0);
    }

    public void menu() {
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

    private void them() {
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("+---------------------------------+");
        System.out.println("|            Them                 |");
        System.out.println("+---------------------------------+");
        System.out.println("|   1. Them Gia Dung              |");
        System.out.println("|   2. Them Nuoc                  |");
        System.out.println("|   3. Them Tuoi Song             |");
        System.out.println("|   4. Them Khac                  |");
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
        System.out.println("|   2. Xoa Nuoc                   |");
        System.out.println("|   3. Xoa Tuoi Song              |");
        System.out.println("|   4. Xoa Khac                   |");
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

    private int luaChon() {
        System.out.print("Lua chon: ");
        Scanner scanner = new Scanner(System.in);
        char check = scanner.next().charAt(0);
        return check - '0';
    }
}