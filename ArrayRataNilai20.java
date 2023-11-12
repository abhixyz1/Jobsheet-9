import java.util.Scanner;

public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlmahasiswa = sc.nextInt();

        int[] nilaiMhs= new int[jmlmahasiswa];
        double total1 = 0, total2 = 0;
        double rata1, rata2;
        int counter = 0, counter2 = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                //System.out.println("Mahasiswa ke-" +(i+1)+ " Lulus");
                counter++;
                total1+=nilaiMhs[i];
            } else {
                counter2++;
                total2+=nilaiMhs[i];
            } 
        }
        rata1 = total1/counter;
        rata2 = total2/counter2;
        System.out.println("Rata-rata nilai lulus = " + rata1);
        System.out.println("Rata-rata nilai tidak lulus = "+ rata2);
        //System.out.println("Rata-rata nilai = "+rata2);
    }   
}
