
import java.util.Scanner;

// anggap ini file main (executor)

public class test2C {
    public static void main (String[] args) {
        // Scanner input = new Scanner(System.in);
        // area sq = new area();
        // area ci = new area();
        // area tr = new area();
        // System.out.printf("masukkan panjang persegi = ");
        // int len = input.nextInt();
        // System.out.printf("masukkan lebar persegi = ");
        // int wid = input.nextInt();
        // System.out.printf("masukkan jari-jari lingkaran: ");
        // double jar = input.nextDouble();
        // System.out.printf("masukkan panjang alas = ");
        // int bas = input.nextInt();
        // System.out.printf("masukkan tinggi = ");
        // int hgt = input.nextInt();
        // input.close();
        // sq.len = len;
        // sq.wid = wid;
        // ci.jar = jar;
        // tr.bas = bas;
        // tr.hgt = hgt;
        // sq.sqAreaInfo();
        // ci.ciAreaInfo();
        // tr.trAreaInfo();
        //##############################
        // circle ci = new circle();
        // System.out.printf("masukkan jari-jari lingkaran: ");
        // double jar = input.nextDouble();
        // ci.jar = jar;
        // ci.circleInfo();
        //##############################
        // square sq = new square();
        // System.out.printf("masukkan panjang persegi = ");
        // int len = input.nextInt();
        // System.out.printf("masukkan lebar persegi = ");
        // int wid = input.nextInt();
        // sq.len = len;
        // sq.wid = wid;
        // sq.squareInfo();
        //##############################
        // triangle tr = new triangle();
        // System.out.printf("masukkan panjang alas = ");
        // int bas = input.nextInt();
        // System.out.printf("masukkan tinggi = ");
        // int hgt = input.nextInt();
        // input.close();
        // tr.bas = bas;
        // tr.hgt = hgt;
        // tr.triangleInfo();

        //----------------------------------------------------------------------------------------------------
        // test2P Porsche = new test2P();
        // Porsche.setnama("Porsche");
        // Porsche.seta(9);
        // Porsche.setconv(9);
        // Porsche.setb(5);
        // Porsche.setyear(2007);
        // Porsche.setpri(2000);
        // Porsche.settax(0);
        // Porsche.displayInfo("keren");

        //----------------------------------------------------------------------------------------------------
        // Film film1 = new Film("T-34", "Action", LocalTime.of(14,0), 40000);
        // Film film2 = new Film("The Maze Runner", "Sci-Fi", LocalTime.of(10,0), 45000);
        // Film film3 = new Film("Finding Nemo", "Animation", LocalTime.of(16,0), 30000);
        // Film film4 = new Film("The Imitation Game", "History", LocalTime.of(13,0), 47000);
        //##############################
        // Studio studio1 = new Studio(1, 50, film1);
        // Studio studio2 = new Studio(2, 40, film2);
        // Studio studio3 = new Studio(3, 50, film3);
        //##############################
        // Tiket tiket1 = new Tiket(1, film1, studio1, 1, new Audiens("Reza"));
        // Tiket tiket2 = new Tiket(2, film2, studio2, 2, new Audiens("Sigit"));
        // Tiket tiket3 = new Tiket(3, film3, studio3, 3, new Audiens("Farhan"));
        // Tiket tiket4 = new Tiket(4, film2, studio1, 4, new Audiens("Kevin"));
        //##############################
        // // menampilkan informasi film di hari pertama
        // System.out.println("----- Informasi Hari Pertama -----");
        // tiket1.tiketInfo();
        // tiket2.tiketInfo();
        // tiket3.tiketInfo();
        //##############################
        // // merubah film di tiap studio di hari berikutnya
        // studio1.setFilm(film2);
        // studio2.setFilm(film4);
        // studio3.setFilm(film1);
        //##############################
        // // menampilkan informasi film di hari kedua
        // System.out.println("----- Informasi Hari Kedua -----");
        // tiket4.tiketInfo();

        //----------------------------------------------------------------------------------------------------
        // double thr = 2000000;
        // Pegawai p1 = new Pegawai("dimas","dirut", 5000000, 1500000, 500000, 2500000);
        // p1.tambahBonus(thr);
        // p1.displayInfo();
        // Pegawai p2 = new Pegawai("wahyu","kabag", 4750000, 1750000, 1000000, 2750000);
        // p2.tambahBonus(thr);
        // p2.displayInfo();

        //----------------------------------------------------------------------------------------------------
        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan nama Anda: ");
        // String nama = input.nextLine();
        // System.out.print("Masukkan nomor HP Anda: ");
        // String nohp = input.nextLine();
        // System.out.println("");
        // int cProd = 0;
        // int totalBelanja = 0;
        // int prod, satuan;
        // for ( ; ; ) {
        //     Keranjang b1 = new Keranjang(cProd, totalBelanja);
        //     Customer c1 = new Customer(nama, nohp, b1);    
        //     System.out.println("xxx___Toko Online ABC___xxx");
        //     System.out.println("0. Menu");
        //     System.out.println("1. Belanja");
        //     int way = input.nextInt();
        //     if (way == 0) {
        //         c1.displayInfo();
        //     } else if (way == 1) {
        //         System.out.println("___Daftar barang___");
        //         System.out.println("1. Kurma 1 kg (Rp60k)");
        //         System.out.println("2. Air Minum 1 dus (Rp40k)");
        //         System.out.println("3. Risol Bihun 1 pcs (Rp1k)");
        //         System.out.println("");
        //         for ( ; ; ) {
        //             System.out.println("Masukkan orderan Anda (kode produk, jumlah produk): (ketik 0 untuk kembali ke menu utama)");
        //             prod = input.nextInt();
        //             if (prod > 3 || prod < 0) {
        //                 System.out.println("Maaf, hanya ada 3 barang di toko kami.");
        //             } else if (prod == 0) {
        //                 break;
        //             } else {
        //                 satuan = input.nextInt();
        //                 if (prod == 1) {
        //                     Produk kurma = new Produk("Kurma", satuan, 60000, satuan*60000);
        //                     kurma.displayInfo();
        //                     totalBelanja += (satuan*60000);
        //                 } else if (prod == 2) {
        //                     Produk air = new Produk("Air Minum", satuan, 40000, satuan*40000);
        //                     air.displayInfo();
        //                     totalBelanja += (satuan*40000);
        //                 } else {
        //                     Produk risol = new Produk("Risol Bihun", satuan, 1000, satuan*1000);
        //                     risol.displayInfo();
        //                     totalBelanja += (satuan*1000);
        //                 }
        //                 System.out.println("Barang berhasil dimasukkan ke keranjang.");
        //                 cProd++;
        //                 for ( ; ; ) {
        //                     System.out.println("Lanjut belanja? (ya/tidak)");
        //                     String yn = input.next();
        //                     if (yn.equalsIgnoreCase("ya")) {
        //                         break;
        //                     } else if (yn.equalsIgnoreCase("tidak")) {
        //                         System.out.println("Apakah Anda ingin kembali ke menu atau menyelesaikan pembelian? (menu/selesai)");
        //                         String opt = input.next();
        //                         if (opt.equalsIgnoreCase("menu")) {
        //                             break;
        //                         } else if (opt.equalsIgnoreCase("selesai")) {
        //                             System.out.println("Total barang dibeli: " + cProd);
        //                             System.out.println("Total belanja Anda: Rp" + totalBelanja);
        //                             input.close();
        //                             System.exit(0);
        //                         }
        //                     } else {
        //                         System.out.println("Masukkan 'ya' atau 'tidak'.");
        //                     }
        //                 }
        //             }
        //         }
        //     } else {
        //         System.out.println("Ketik 0 untuk Menu dan 1 untuk Belanja");
        //     }
        // }

        //----------------------------------------------------------------------------------------------------
        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan nama pengirim           : ");
        // String pengirim = input.next();
        // System.out.print("Masukkan alamat tujuan           : ");
        // String alamat = input.next();
        // System.out.print("Masukkan berat paket             : ");
        // double berat = input.nextDouble();
        // System.out.print("Masukkan biaya pengiriman        : ");
        // double biaya = input.nextDouble();
        // System.out.print("Masukkan diskon yang valid       : ");
        // double dsc = input.nextDouble();
        // System.out.print("Masukkan biaya tambah (opsional) : ");
        // double plus = input.nextDouble();
        // System.out.print("Masukkan jarak pengiriman        : ");
        // int jarak = input.nextInt();
        // System.out.println("");
        // input.close();
        // PengirimanBarang paket1 = new PengirimanBarang(pengirim, alamat, berat, biaya);
        // paket1.displayInfoLogistik();
        // if (plus != 0) {
        //     paket1.hitungOngkir(dsc, plus);
        // } else {
        //     paket1.hitungOngkir(dsc);
        // }
        // paket1.hitungOngkir(jarak);

        //----------------------------------------------------------------------------------------------------
        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan nama Anda            : ");
        // String nama = input.nextLine();
        // System.out.print("Masukkan nomor pelanggan Anda : ");
        // String nomor = input.next();
        // if (nomor.length() < 10 || nomor.length() > 10) {
        //     System.out.print("Harap masukkan nomor rekening dengan benar.");
        //     System.exit(0);
        // }
        // System.out.print("Masukkan password Anda        : ");
        // int pass = input.nextInt();
        // double saldo = 10000;
        // WindahTopUp p1 = new WindahTopUp(nama, nomor, saldo);
        // p1.setPassword(pass);
        // System.out.println("Selamat datang.");
        // for ( ; ; ) {
        //     p1.Menu();
        //     int opt = input.nextInt();
        //     if (opt == 1) {
        //         System.out.print("Masukkan jumlah pembelian: Rp");
        //         double beli = input.nextDouble();
        //         System.out.print("Masukkan password Anda: ");
        //         int pwd = input.nextInt();
        //         p1.Transaksi(beli, pwd);
        //     } else if (opt == 2) {
        //         System.out.print("Masukkan jumlah top up: Rp");
        //         double topup = input.nextDouble();
        //         System.out.print("Masukkan password Anda: ");
        //         int psw = input.nextInt();
        //         p1.TopUp(topup, psw);
        //     } else if (opt == 3) {
        //         p1.displayInfo();
        //     } else if (opt == 4) {
        //         p1.Keluar();
        //     } else {
        //         System.out.println("Masukkan angka sesuai pilihan.");
        //     }
        // }

        //----------------------------------------------------------------------------------------------------
        // //ikuti program dan liat output
        // Rational r6 = new Rational(1, 2);
        // Rational r7 = new Rational(1, -2);
        // System.out.println(r6.add(r7));
        // //outputny knp 0/4 co? padahal atasny 0, tapi bawahny 4

        //----------------------------------------------------------------------------------------------------
        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan dua angka untuk ditambah: ");
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int tambah = ngitung.sum(a, b);
        // System.out.println("Hasil tambah: " + tambah);
        // System.out.println("");
        // System.out.print("Masukkan dua angka untuk dikurang: ");
        // int c = input.nextInt();
        // int d = input.nextInt();
        // int kurang = ngitung.sub(c, d);
        // System.out.println("Hasil kurang: " + kurang);
        // System.out.println("");
        // ngitung itung = new ngitung();
        // System.out.print("Masukkan dua angka untuk dikali: ");
        // int e = input.nextInt();
        // int f = input.nextInt();
        // int kali = itung.mul(e, f);
        // System.out.println("Hasil kali: " + kali);
        // System.out.println("");
        // System.out.print("Masukkan dua angka untuk dibagi: ");
        // int g = input.nextInt();
        // int h = input.nextInt();
        // double bagi = itung.div(g, h);
        // System.out.printf("Hasil bagi: %.2f\n", bagi);
        // itung.sederhana(g, h);
        // input.close();

        //----------------------------------------------------------------------------------------------------
        // Labkomdas jual = new Labkomdas();
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Masukkan banyak jaket A: ");
        // int jJA = scanner.nextInt();
        // System.out.print("Masukkan banyak jaket B: ");
        // int jJB = scanner.nextInt();
        // System.out.print("Masukkan banyak jaket C: ");
        // int jJC = scanner.nextInt();
        // scanner.close();
        // int tJA = jual.hitungTotalA(jJA);
        // int tJB = jual.hitungTotalB(jJB);
        // int tJC = jual.hitungTotalC(jJC);
        // int sum = tJA + tJB + tJC;
        // System.out.print("Total harga jaket A: " + tJA + "\n");
        // System.out.print("Total harga jaket B: " + tJB + "\n");
        // System.out.print("Total harga jaket C: " + tJC + "\n");
        // System.out.print("Total harga keseluruhan: " + sum + "\n");
        
        //----------------------------------------------------------------------------------------------------
        // Kasir kasir = new Kasir();
        // kasir.jalankan();

        //----------------------------------------------------------------------------------------------------
        // // Scanner scanner = new Scanner(System.in);
        // Kue[] daftarKue = new Kue[20];
        //
        // // Mengisi array dengan berbagai objek KuePesanan dan KueJadi
        // daftarKue[0] = new KuePesanan("Lapis Legit", 100000, 0.5);
        // daftarKue[1] = new KueJadi("Nastar", 5000, 10);
        // daftarKue[2] = new KuePesanan("Brownies", 120000, 0.3);
        // daftarKue[3] = new KueJadi("Putri Salju", 6000, 15);
        // daftarKue[4] = new KuePesanan("Cubit", 80000, 0.4);
        // daftarKue[5] = new KueJadi("Pukis", 7000, 20);
        // daftarKue[6] = new KuePesanan("Pancong", 90000, 0.6);
        // daftarKue[7] = new KueJadi("Bolu", 15000, 5);
        // daftarKue[8] = new KuePesanan("Putu", 85000, 0.45);
        // daftarKue[9] = new KueJadi("Lemper", 10000, 8);
        // daftarKue[10] = new KuePesanan("Serabi", 75000, 0.35);
        // daftarKue[11] = new KueJadi("Pancong", 12000, 7);
        // daftarKue[12] = new KuePesanan("Pancong", 95000, 0.55);
        // daftarKue[13] = new KueJadi("Cubit", 11000, 9);
        // daftarKue[14] = new KuePesanan("Apem", 70000, 0.25);
        // daftarKue[15] = new KueJadi("Lapis", 13000, 6);
        // daftarKue[16] = new KuePesanan("Talam", 65000, 0.2);
        // daftarKue[17] = new KueJadi("Pancong", 14000, 4);
        // daftarKue[18] = new KuePesanan("Putri Salju", 105000, 0.5);
        // daftarKue[19] = new KueJadi("Nastar", 9000, 12);
        //
        // // a. Tampilkan semua kue beserta jenisnya
        // System.out.println("Daftar Semua Kue:");
        // for (Kue kue : daftarKue) {
        //     System.out.println(kue.toString());
        // }
        //
        // // b. Hitung total harga semua kue
        // double totalHarga = 0;
        // for (Kue kue : daftarKue) {
        //     totalHarga += kue.hitungHarga();
        // }
        // System.out.println("\nTotal Harga Semua Kue: Rp" + totalHarga);
        //
        // // c. Hitung total harga dan total berat dari KuePesanan
        // double totalHargaPesanan = 0;
        // double totalBeratPesanan = 0;
        // for (Kue kue : daftarKue) {
        //     if (kue instanceof KuePesanan) {
        //         KuePesanan kp = (KuePesanan) kue;
        //         totalHargaPesanan += kp.hitungHarga();
        //         totalBeratPesanan += kp.getBerat();
        //     }
        // }
        // System.out.println("\nTotal Harga Kue Pesanan: Rp" + totalHargaPesanan);
        // System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan + " kg.");
        //
        // // d. Hitung total harga dan total jumlah dari KueJadi
        // double totalHargaJadi = 0;
        // double totalJumlahJadi = 0;
        // for (Kue kue : daftarKue) {
        //     if (kue instanceof KueJadi) {
        //         KueJadi kj = (KueJadi) kue;
        //         totalHargaJadi += kj.hitungHarga();
        //         totalJumlahJadi += kj.getJumlah();
        //     }
        // }
        // System.out.println("\nTotal Harga Kue Jadi: Rp" + totalHargaJadi);
        // System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi + " kue.");
        //
        // // e. Tampilkan kue dengan harga akhir terbesar
        // Kue kueTermahal = daftarKue[0];
        // for (Kue kue : daftarKue) {
        //     if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
        //         kueTermahal = kue;
        //     }
        // }
        // System.out.println("\nKue dengan Harga Terbesar:");
        // System.out.println(kueTermahal.toString());
        //
        // //
        // // System.out.print("Masukkan data 20 kue:");
        // // for (int i = 0; i < daftarKue.length; i++) {
        // //     System.out.println("\nKue ke-" + (i + 1));
        // //
        // //     // Pilih tipe kue
        // //     String tipe = "";
        // //     while (true) {
        // //         System.out.print("Pilih tipe kue (1 = KuePesanan, 2 = KueJadi): ");
        // //         tipe = scanner.nextLine();
        // //         if (tipe.equals("1") || tipe.equals("2")) {
        // //             break;
        // //         }
        // //         System.out.println("Input tidak valid. Masukkan 1 atau 2.");
        // //     }
        // //
        // //     System.out.print("Masukkan nama kue: ");
        // //     String nama = scanner.nextLine();
        // //
        // //     double harga = 0;
        // //     while (true) {
        // //         try {
        // //             System.out.print("Masukkan harga satuan: ");
        // //             harga = Double.parseDouble(scanner.nextLine());
        // //             if (harga > 0) break;
        // //             else System.out.println("Harga harus positif.");
        // //         } catch (NumberFormatException e) {
        // //             System.out.println("Input tidak valid, masukkan angka.");
        // //         }
        // //     }
        // //
        // //     if (tipe.equals("1")) { // KuePesanan
        // //         double berat = 0;
        // //         while (true) {
        // //             try {
        // //                 System.out.print("Masukkan berat (kg): ");
        // //                 berat = Double.parseDouble(scanner.nextLine());
        // //                 if (berat > 0) break;
        // //                 else System.out.println("Berat harus positif.");
        // //             } catch (NumberFormatException e) {
        // //                 System.out.println("Input tidak valid, masukkan angka.");
        // //             }
        // //         }
        // //         daftarKue[i] = new KuePesanan(nama, harga, berat);
        // //
        // //     } else { // KueJadi
        // //         double jumlah = 0;
        // //         while (true) {
        // //             try {
        // //                 System.out.print("Masukkan jumlah: ");
        // //                 jumlah = Double.parseDouble(scanner.nextLine());
        // //                 if (jumlah > 0) break;
        // //                 else System.out.println("Jumlah harus positif.");
        // //             } catch (NumberFormatException e) {
        // //                 System.out.println("Input tidak valid, masukkan angka.");
        // //             }
        // //         }
        // //         daftarKue[i] = new KueJadi(nama, harga, jumlah);
        // //     }
        // // }
        // //
        // // // Setelah input selesai, tampilkan semua kue
        // // System.out.println("\nDaftar Semua Kue:");
        // // for (Kue kue : daftarKue) {
        // //     System.out.println(kue.toString());
        // // }
        // //
        // // // Hitung total harga semua kue
        // // double totalHarga = 0;
        // // for (Kue kue : daftarKue) {
        // //     totalHarga += kue.hitungHarga();
        // // }
        // // System.out.println("\nTotal Harga Semua Kue: " + totalHarga);
        // //
        // // // Hitung total harga dan berat KuePesanan
        // // double totalHargaPesanan = 0;
        // // double totalBeratPesanan = 0;
        // // for (Kue kue : daftarKue) {
        // //     if (kue instanceof KuePesanan) {
        // //         KuePesanan kp = (KuePesanan) kue;
        // //         totalHargaPesanan += kp.hitungHarga();
        // //         totalBeratPesanan += kp.getBerat();
        // //     }
        // // }
        // // System.out.println("\nTotal Harga KuePesanan: " + totalHargaPesanan);
        // // System.out.println("Total Berat KuePesanan: " + totalBeratPesanan + " kg");
        // //
        // // // Hitung total harga dan jumlah KueJadi
        // // double totalHargaJadi = 0;
        // // double totalJumlahJadi = 0;
        // // for (Kue kue : daftarKue) {
        // //     if (kue instanceof KueJadi) {
        // //         KueJadi kj = (KueJadi) kue;
        // //         totalHargaJadi += kj.hitungHarga();
        // //         totalJumlahJadi += kj.getJumlah();
        // //     }
        // // }
        // // System.out.println("\nTotal Harga KueJadi: " + totalHargaJadi);
        // // System.out.println("Total Jumlah KueJadi: " + totalJumlahJadi);
        // //
        // // // Tampilkan kue dengan harga terbesar
        // // Kue kueTermahal = daftarKue[0];
        // // for (Kue kue : daftarKue) {
        // //     if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
        // //         kueTermahal = kue;
        // //     }
        // // }
        // // System.out.println("\nKue dengan Harga Terbesar:");
        // // System.out.println(kueTermahal.toString());
        // //
        // // scanner.close();

        //----------------------------------------------------------------------------------------------------
        // Invoice[] invoices = {
        //     new Invoice("Pensil", 10, 2000),
        //     new Invoice("Buku Tulis", 5, 5000),
        //     new Invoice("Penghapus", 3, 1500)
        // };
        //
        // Employee emp1 = new Employee("Joko", 5000000, invoices);
        // emp1.printEmpDetail();

        //----------------------------------------------------------------------------------------------------
        // Box <Integer> box = new Box<> (10);
        // box.setAsd(10);
        // box.getAsd();

        //----------------------------------------------------------------------------------------------------
        // File write = new File("as.txt");
        // try {
        //     FileWriter as = new FileWriter(text, true);
        //     as.write("isian");
        //     as.close();
        // } catch (IOException e) {
        //     System.out.println("error pak" + e.getMessage());
        // }

        //----------------------------------------------------------------------------------------------------
        //     List<Pemain> timA = Arrays.asList(
        //         new Pemain(168, 50),
        //         new Pemain(170, 60),
        //         new Pemain(165, 56),
        //         new Pemain(168, 55),
        //         new Pemain(172, 60),
        //         new Pemain(170, 70),
        //         new Pemain(169, 66),
        //         new Pemain(165, 56),
        //         new Pemain(171, 72),
        //         new Pemain(166, 56)
        //     );
        //
        //     List<Pemain> timB = Arrays.asList(
        //         new Pemain(170, 66),
        //         new Pemain(167, 60),
        //         new Pemain(165, 59),
        //         new Pemain(166, 58),
        //         new Pemain(168, 58),
        //         new Pemain(175, 71),
        //         new Pemain(172, 68),
        //         new Pemain(171, 68),
        //         new Pemain(168, 65),
        //         new Pemain(169, 60)
        //     );
        //
        //     // a. Urutkan berdasarkan Tinggi Badan (Ascending)
        //     System.out.println("Urutan berdasarkan Tinggi Badan Ascending (gabungan):");
        //     List<Pemain> mix = new ArrayList<>();
        //     mix.addAll(timA);
        //     mix.addAll(timB);
        //     mix.sort(Comparator.comparingInt(p -> p.tinggi));
        //     mix.forEach(System.out::println);
        //
        //     // a. Urutkan berdasarkan Tinggi Badan (Descending)
        //     System.out.println("\nUrutan berdasarkan Tinggi Badan Descending (gabungan):");
        //     mix.sort((p1, p2) -> p2.tinggi - p1.tinggi);
        //     mix.forEach(System.out::println);
        //
        //     // b. Urutkan berdasarkan Berat Badan (Ascending)
        //     System.out.println("\nUrutan berdasarkan Berat Badan Ascending (gabungan):");
        //     mix.sort(Comparator.comparingInt(p -> p.berat));
        //     mix.forEach(System.out::println);
        //
        //     // b. Urutkan berdasarkan Berat Badan (Descending)
        //     System.out.println("\nUrutan berdasarkan Berat Badan Descending (gabungan):");
        //     mix.sort((p1, p2) -> p2.berat - p1.berat);
        //     mix.forEach(System.out::println);
        //
        //     // c. Cari nilai max dan min Tinggi dan Berat untuk masing-masing tim
        //     System.out.println("\nNilai max dan min Tim A:");
        //     printMaxMin(timA);
        //
        //     System.out.println("\nNilai max dan min Tim B:");
        //     printMaxMin(timB);
        //
        //     // d. Copy seluruh anggota Tim B ke Tim C yang baru dibentuk
        //     List<Pemain> timC = new ArrayList<>(timB);
        //     System.out.println("\nAnggota Tim C (copy dari Tim B):");
        //     timC.forEach(System.out::println);
        // }
        //
        // private static void printMaxMin(List<Pemain> tim) {
        //     int maxTinggi = tim.stream().mapToInt(p -> p.tinggi).max().orElse(-1);
        //     int minTinggi = tim.stream().mapToInt(p -> p.tinggi).min().orElse(-1);
        //     int maxBerat = tim.stream().mapToInt(p -> p.berat).max().orElse(-1);
        //     int minBerat = tim.stream().mapToInt(p -> p.berat).min().orElse(-1);
        //
        //     System.out.println("Max Tinggi: " + maxTinggi);
        //     System.out.println("Min Tinggi: " + minTinggi);
        //     System.out.println("Max Berat: " + maxBerat);
        //     System.out.println("Min Berat: " + minBerat);
        //  //
        //  //
        //  //
        //     ArrayList<Pemain> timA = new ArrayList<>(Arrays.asList(
        //         new Pemain(168, 50),
        //         new Pemain(170, 60),
        //         new Pemain(165, 56),
        //         new Pemain(168, 55),
        //         new Pemain(172, 60),
        //         new Pemain(170, 70),
        //         new Pemain(169, 66),
        //         new Pemain(165, 56),
        //         new Pemain(171, 72),
        //         new Pemain(166, 56)
        //     ));
        //
        //     ArrayList<Pemain> timB = new ArrayList<>(Arrays.asList(
        //         new Pemain(170, 66),
        //         new Pemain(167, 60),
        //         new Pemain(165, 59),
        //         new Pemain(166, 58),
        //         new Pemain(168, 58),
        //         new Pemain(175, 71),
        //         new Pemain(172, 68),
        //         new Pemain(171, 68),
        //         new Pemain(168, 65),
        //         new Pemain(169, 60)
        //     ));
        //
        //     // Urutkan berdasarkan tinggi badan untuk binary search
        //     timB.sort(Comparator.comparingInt(p -> p.tinggi));
        //     timA.sort(Comparator.comparingInt(p -> p.berat));
        //
        //     // b) Cari jumlah pemain di tim B dengan tinggi 168 dan 160
        //     System.out.println("Jumlah pemain Tim B dengan tinggi 168: " + countByTinggi(timB, 168) + " orang.");
        //     System.out.println("Jumlah pemain Tim B dengan tinggi 160: " + countByTinggi(timB, 160) + " orang.");
        //
        //     // c) Cari jumlah pemain di tim A dengan berat 56 dan 53
        //     System.out.println("Jumlah pemain Tim A dengan berat 56: " + countByBerat(timA, 56) + " orang.");
        //     System.out.println("Jumlah pemain Tim A dengan berat 53: " + countByBerat(timA, 53) + " orang.");
        //
        //     // d) Cek apakah ada pemain Tim A dengan tinggi atau berat sama dengan pemain Tim B
        //     boolean adaSama = adaTinggiAtauBeratSama(timA, timB);
        //     System.out.println("Apakah ada pemain Tim A yang memiliki tinggi atau berat sama dengan pemain Tim B? " + (adaSama ? "Ya" : "Tidak"));
        // }
        //
        // // Binary search untuk mencari indeks pertama dari nilai tertentu pada atribut tinggi
        // private static int binarySearchTinggi(ArrayList<Pemain> list, int target) {
        //     int left = 0, right = list.size() - 1;
        //     int result = -1;
        //     while (left <= right) {
        //         int mid = (left + right) / 2;
        //         if (list.get(mid).tinggi == target) {
        //             result = mid;
        //             right = mid - 1; // cari yang paling kiri
        //         } else if (list.get(mid).tinggi < target) {
        //             left = mid + 1;
        //         } else {
        //             right = mid - 1;
        //         }
        //     }
        //     return result;
        // }
        //
        // // Hitung jumlah pemain dengan tinggi tertentu menggunakan binary search
        // private static int countByTinggi(ArrayList<Pemain> list, int target) {
        //     int firstIndex = binarySearchTinggi(list, target);
        //     if (firstIndex == -1) return 0;
        //
        //     int count = 0;
        //     for (int i = firstIndex; i < list.size() && list.get(i).tinggi == target; i++) {
        //         count++;
        //     }
        //     return count;
        // }
        //
        // // Binary search untuk berat (mirip dengan tinggi)
        // private static int binarySearchBerat(ArrayList<Pemain> list, int target) {
        //     int left = 0, right = list.size() - 1;
        //     int result = -1;
        //     while (left <= right) {
        //         int mid = (left + right) / 2;
        //         if (list.get(mid).berat == target) {
        //             result = mid;
        //             right = mid - 1;
        //         } else if (list.get(mid).berat < target) {
        //             left = mid + 1;
        //         } else {
        //             right = mid - 1;
        //         }
        //     }
        //     return result;
        // }
        //
        // private static int countByBerat(ArrayList<Pemain> list, int target) {
        //     int firstIndex = binarySearchBerat(list, target);
        //     if (firstIndex == -1) return 0;
        //
        //     int count = 0;
        //     for (int i = firstIndex; i < list.size() && list.get(i).berat == target; i++) {
        //         count++;
        //     }
        //     return count;
        // }
        //
        // // Cek apakah ada pemain di tim A yang memiliki tinggi atau berat sama dengan pemain di tim B
        // private static boolean adaTinggiAtauBeratSama(ArrayList<Pemain> timA, ArrayList<Pemain> timB) {
        //     Set<Integer> tinggiB = new HashSet<>();
        //     Set<Integer> beratB = new HashSet<>();
        //
        //     for (Pemain p : timB) {
        //         tinggiB.add(p.tinggi);
        //         beratB.add(p.berat);
        //     }
        //
        //     for (Pemain p : timA) {
        //         if (tinggiB.contains(p.tinggi) || beratB.contains(p.berat)) {
        //             return true;
        //         }
        //     }
        //     return false;

        //----------------------------------------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.println("=== Program Sistem Persamaan Linear 4 Variabel ===");
        // System.out.println("=== Format persamaan: ax + by + cz + dw = e ===");
        // double[][] mat = new double[4][5];
        //
        // for (int i = 0; i < 4; i++) {
        //     System.out.printf("Masukkan koefisien dan hasil untuk persamaan ke-%d (a b c d e): ", i + 1);
        //     for (int j = 0; j < 5; j++) {
        //         mat[i][j] = sc.nextDouble();
        //     }
        // }
        //
        // for (int i = 0; i < 4; i++) {
        //     for (int j = i + 1; j < 4; j++) {
        //         double ratio = mat[j][i] / mat[i][i];
        //         for (int k = 0; k < 5; k++) {
        //             mat[j][k] -= ratio * mat[i][k];
        //         }
        //     }
        // }
        //
        // double w = mat[3][4] / mat[3][3];
        // double z = (mat[2][4] - mat[2][3] * w) / mat[2][2];
        // double y = (mat[1][4] - mat[1][2] * z - mat[1][3] * w) / mat[1][1];
        // double x = (mat[0][4] - mat[0][1] * y - mat[0][2] * z - mat[0][3] * w) / mat[0][0];
        //
        // System.out.println("Solusi:");
        // System.out.printf("x = %.2f\n", x);
        // System.out.printf("y = %.2f\n", y);
        // System.out.printf("z = %.2f\n", z);
        // System.out.printf("w = %.2f\n", w);
        //
        // sc.close();

        //----------------------------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Donat Rumahan");
        System.out.println("Muhammad Syauqi Syihabuddin");
        System.out.println("245150701111033");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius     : ");
        double r1 = input.nextDouble();
        System.out.print("Isikan radius     : ");
        double r2 = input.nextDouble();
        System.out.println("=============================================");
        Torus donatlubang = new Torus(r1, r2);
        donatlubang.printInfo();
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius     : ");
        double r3 = input.nextDouble();
        System.out.println("=============================================");
        Sphere donatnirlubang = new Sphere(r3);
        donatnirlubang.printInfo();
        System.out.println("=============================================");
        input.close();

        //----------------------------------------------------------------------------------------------------

    }
}