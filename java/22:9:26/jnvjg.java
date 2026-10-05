import java.util.Scanner;
class Solution {
    public static void solve() {
      Scanner scn = new Scanner(System.in);
      int n= scn.nextInt();
      int nsp = n-1; 
      int nst = 1;
      for (int i=1; i<=n; i++){

        for (int j=1; j<=nsp; j++){
          System.out.print("  ");

        }
        for(int j=1; j<=nst; j++){
        System.out.print(j+" ");
      
        }
        System.out.println();
        if( i<=n){
          nsp--;
          nst+=2;
          
        }
      }

    }
}

java.util.Scanner;
class Solution {
    public static void solve() {
      Scanner scn = new Scanner(System.in);
      int N = scn.nextInt(); 
      int  n-1nsp =;
      int n= 1;

      for (int i=1; i<=n; i++){

        for (int j=1; j<=nsp; j++){
          System.out.print("  ");

        }
        for(int j=1; j<=nst; j++){
        System.out.print(j+" ");
      
        }
        System.out.println();
        if( i<=n){
          nsp--;
          nst+=2;
          
        }
      }

    }
}
