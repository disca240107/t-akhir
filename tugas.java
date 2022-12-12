 Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nisn : ");
        String input = scan.nextLine();

        String nama[][] = {{"Felisa", "Darma", "Suci", "Aya"},
        {"Naura", "Disca", "Ghozy", "Inad"}};
        String nisn[][] = {{"1223", "1224", "1225", "1226"}, {"1227", "1228", "1229", "1230"}};
        String kelas[][] = {{"XR1", "XR2", "XR3", "XR4"}, {"XR5", "XR6", "XR7", "XR8"}};

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 4; i++) {

                if (input.equalsIgnoreCase(nama[j][i])) {
                    System.out.println("nama=" + nama[j][i]);
                    System.out.println("nisn=" + nisn[j][i]);
                    System.out.println("kelas=" + kelas[j][i]);
                    break;
                } else if (input.equalsIgnoreCase(nisn[j][i])) {
                    System.out.println("nama=" + nama[j][i]);
                    System.out.println("nisn=" + nisn[j][i]);
                    System.out.println("kelas=" + kelas[j][i]);
                    break;

                } else if (input.equalsIgnoreCase(kelas[j][i])) {
                    System.out.println("nama=" + nama[j][i]);
                    System.out.println("nisn=" + nisn[j][i]);
                    System.out.println("kelas=" + kelas[j][i]);
                    break;

                }
            }

 
        
//    String A [][]= {{3,4,5},{5,7,9}}
        }
    }
}
