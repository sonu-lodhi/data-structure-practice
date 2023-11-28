//-------W.Q.J.P. to print first five Even Number
package basicprogram;

public class EvenNumPro {
    public static void main(String[] args) {

        /*for (int i = 0; i <= 8; i++) {
            if (i%2 == 0){
                System.out.println(i);
              }
            }
            */

        /*int n=8;
        for (int i = 0; i <=n; i+=2) {
            System.out.println(i);
        }*/

        //-------Print Even Number in reverse order-------------------------
        /*int n=8;
        for (int i = n; i >=0; i-=2) {
            System.out.println(i);
        }*/


        //-------Print five Odd Number-------------------------
        /*int n=9;
        for (int i = 0; i <=n; i++) {
            if (i%2 !=0){
                System.out.println(i);
            }
        }*/
       /* int n=9;
        for (int i = 1; i <=n ; i+=2) {
            System.out.println(i);
        }*/

//        int n= 20;
//        for (int i = 1; i <=n ; i++) {
//            if(i%3==0){
//                System.out.println(i);
//            }
//        }
        //-- write a java program to find sum of first n natural numbers

        int sum =0;
        for (int i = 0; i <=5 ; i++) {
            //sum = sum+i;
            sum+=i;
        }
        System.out.println(sum);
    }
}
