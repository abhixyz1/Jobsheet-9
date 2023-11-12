import java.util.Scanner;

public class tugas150menit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total=0;
        double rata2;

        System.out.print("Masukkan jumlah elemen array : ");
        int array = sc.nextInt();

        int arrays[] = new int[array];
        int max = arrays[0],min = arrays[0];


        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Masukkan elemen array ke -" + i + " : ");
            arrays[i] = sc.nextInt();
            
        if (arrays[i] > max) {
                max = arrays[i];
            } else if (arrays[i] < min) {
                min = arrays[i];
            }
            total+=arrays[i];
        }
        rata2 = total/arrays.length;
        System.out.println("Nilai rata-rata dari array tersebut adalah : " + rata2);
        System.out.println("Nilai tertinggi dari array tersebut adalah : " + max);
        System.out.println("Nilai terendah dari array tersebut adalah : " + min);
    }
    
}
