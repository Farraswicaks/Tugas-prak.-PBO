import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama;
        int palingtinggi;
        int palingrendah;
        float ratarata, total = 0;
        int [] nilai = new int[5];

        Scanner inputUser = new Scanner(System.in);
        System.out.println("INPUT");
        System.out.print("Nama : ");
        nama = inputUser.nextLine();

        for (int i = 0; i < nilai.length; i++){
            System.out.print("Nilai ke-" + (i+1) + " : ");
            nilai[i] = inputUser.nextInt();
            total+=nilai[i];
        }

        palingtinggi  = nilai[0];
        palingrendah  = nilai[0];
        ratarata = total/5;

        System.out.println("\nOUTPUT");
        System.out.println("Nama : " + nama);
        for (int i = 0; i < nilai.length; i++){
            if (palingtinggi  < nilai[i]){
                palingtinggi  = nilai[i];
            } else if (palingrendah > nilai[i]){
                palingrendah  = nilai[i];
            }
        }
        System.out.println("Nilai Tertinggi   : " + palingtinggi );
        System.out.println("Nilai Terendah    : " + palingrendah );
        System.out.println("Rata - rata nilai : " + ratarata);
    }
}
