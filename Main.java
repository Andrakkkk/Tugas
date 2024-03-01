import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibrarySystem librarySystem = new LibrarySystem();

        while (true) {
            System.out.println("Selamat datang di Library System");
            System.out.println("Pilih jenis user:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan username: ");
                    String adminUsername = scanner.nextLine();
                    System.out.print("Masukkan password: ");
                    String adminPassword = scanner.nextLine();
                    if (librarySystem.adminLogin(adminUsername, adminPassword)) {
                        System.out.println("Login berhasil sebagai admin.");

                    } else {
                        System.out.println("Username atau password salah.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    if (librarySystem.studentLogin(nim)) {
                        System.out.println("Login berhasil sebagai mahasiswa.");

                    } else {
                        System.out.println("NIM tidak valid.");
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih. Sampai jumpa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

class LibrarySystem {
    private final String adminUsername = "andra";
    private final String adminPassword = "andra123";

    public boolean adminLogin(String username, String password) {
        return username.equals(adminUsername) && password.equals(adminPassword);
    }

    public boolean studentLogin(String nim) {
        return nim.length() == 15;
    }
}
