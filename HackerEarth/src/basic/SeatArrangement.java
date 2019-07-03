package basic;

import java.util.Scanner;
class SeatArrangement {
    public static void main(String args[] ) throws Exception {
        int T=19,N;
        int J=45;
        
        Scanner s=new Scanner(System.in);
        
        N=s.nextInt();
        
        if(N==18)
        {
            System.out.println("WS"+N);
            
        }
       else
       {
           System.out.println(T+" WS");
           System.out.println(J+" AS");
           
       }

    }
}