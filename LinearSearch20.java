import java.util.Scanner;
public class LinearSearch20 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*int[] arrayInt = 9{34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);*/

        int i;

        System.out.print("Masukkan jumlah elemen array : ");
        int array = sc.nextInt();

        int [] array1 = new int[array];
        for (i = 0; i < array; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            array1[i] = sc.nextInt();  
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        int keys = sc.nextInt();
        for (i = 0; i < array; i++) {
            if (array1[i] == keys) {
                System.out.println("Key ada diposisi indeks ke-" + i);
                break;  
            } 
        }
        if (i == array) {
            System.out.println("Key tidak ditemukan");    
        }
    }
}
