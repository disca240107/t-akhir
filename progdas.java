 static Scanner scan = new Scanner(System.in);
    static ArrayList walkel = new ArrayList();
    static ArrayList muridpa = new ArrayList();
    static ArrayList muridpi = new ArrayList();
    static boolean Running = true;

    static void infomenu() {
        System.out.println("===DATA KELAS R4===");
        System.out.println("[1]Nama Wali Kelas");
        System.out.println("[2]Jumlah Siswa Kelas");
        System.out.println("[3]Struktur kelas");
        System.out.println("[4]Keluar");
        System.out.println("Masukkan menu");
        int pilihmenu = scan.nextInt();

        switch (pilihmenu) {
            case 1:
                showWalikelas();
                break;
            case 2:
                showJumlahsiswaKelas();
                break;
            case 3:
                showStrukturKelas();
                break;
            case 4:
                System.exit(0);
                break;
            case 5:
                System.out.println("Pilihan salah");
        }
    }

    static void showWalikelas() {
        String waliKelas = "Pak Chusni";
        walkel.add(waliKelas);
        System.out.println("Wali kelas :" + walkel);
    }

    static void showJumlahsiswaKelas() {
        int total = 40;
        int lakiLaki = 26;
        int perempuan = 14;

        muridpa.add(lakiLaki);
        muridpi.add(perempuan);

        System.out.println("Jumlah siswa : " + total);
        System.out.println("Siswa laki-laki : " + muridpa);
        System.out.println("Siswa perempuan : " + muridpi);
    }

    static void showStrukturKelas() {
        String[] Ketua = {"Felisa"};
        String[] waka = {"Adit"};
        String[] sekret = {"Naura"};
        String[] bendahara = {"Raffy"};

        System.out.println("STRUKTUR KELAS");
        System.out.println("Ketua : " + Ketua[0]);
        System.out.println("Wakil ketua : " + waka[0]);
        System.out.println("Sekretaris : " + sekret[0]);
        System.out.println("Bendahara : " + bendahara[0]);

    }

    public static void main(String[] args) {
        do {
            infomenu();
        } while (Running);

    }
}
