//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
public class p13 {
    public static void main(String[] args) {
        int n = 5;
        //iper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=(i*2)-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=(i*2)-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
