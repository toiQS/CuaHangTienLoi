package Main;

import Quay.QuayGiaDung;
import Quay.QuayKhac;
import Quay.QuayNuoc;
import Quay.QuayTuoiSong;

import java.io.*;
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
    private static int endCuaHangMini;
    public static void main(String[] args) throws IOException {
        //input dau vao
        inputDauVao("src/Database/inputQuayGiaDung.txt", "QuayGiaDung");
        inputDauVao("src/Database/inputQuayNuoc.txt", "QuayNuoc");
        inputDauVao("src/Database/inputQuayTuoiSong.txt", "QuayTuoiSong");
        inputDauVao("src/Database/inputQuayKhac.txt", "QuayKhac");

        // xuat thong tin cua cua hang mini
        do {
            cuaHangMini();
            switch (luaChon()) {
                // xuat thong tin lua chon cua admin
                case 1 -> {
                    if (login()) {
                        QuanLy quanLy = new QuanLy();
                        quanLy.admin();
                    }
                    else {
                        System.out.println("Mat khau hoac tai khoan khong dung!");
                    }
                }
                // xuat thong tin lua chon cua khach hang
                case 2 -> {
                    KhachHang khachHang = new KhachHang();
                    khachHang.khachHang();
                }
                // thoat
                case 3 -> {
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

    public static void endCuaHang(int end) {
        endCuaHangMini = end;
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

    private static void inputDauVao(String URL, String quay) throws IOException {
        // Quay gia dung
        if (Objects.equals(quay, "QuayGiaDung")) {
            QuayGiaDung quayGiaDung = new QuayGiaDung();
            quayGiaDung.inputFile(URL);
        }

        // Quay khac
        if (Objects.equals(quay, "QuayKhac")) {
            QuayKhac khac = new QuayKhac();
            khac.inputFile(URL);
        }

        // Quay Tuoi song
        if (Objects.equals(quay, "QuayTuoiSong")) {
            QuayTuoiSong tuoiSong = new QuayTuoiSong();
            tuoiSong.inputFile(URL);
        }

        //Quay Thuc Pham
        if (Objects.equals(quay, "QuayNuoc")) {
            QuayNuoc nuoc = new QuayNuoc();
            nuoc.inputFile(URL);
        }
    }
}