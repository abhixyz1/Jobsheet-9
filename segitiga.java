public class segitiga {
    public static void main(String[] args) {
        

        for (int x=0; x<=9; x++) {
            for(int y=0; y<=9-x; y++) {
            System.out.print(" ");
            }
            for (int z=0; z<=x-1; z++) {
            System.out.print("*");
            }
            System.out.println("*");
            }
            System.out.println("\n");
            


        /*for (int x = 10; x > 0; x--) {
            for (int y = 0; y < x; y++) {
                System.out.print("* ");

            } System.out.print("\n");
            
        }*/


       /* int x = 1;
        while ( x<= 10) {
            int y = 1;
            while (y<=10-x) {
                System.out.print(" ");
                y++;}
                int z =1;
                while (z<=x-1) {
                    System.out.print("*");
                    z++;
                }
            System.out.println("*");
            x++;
        } System.out.print(""); */

    }

}
