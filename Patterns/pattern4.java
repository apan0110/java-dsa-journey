// import java.util.*;
//  public class pattern4 {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j= 4;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


//     }
    
// }
class Solution {
    public void pattern5(int n) {

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}