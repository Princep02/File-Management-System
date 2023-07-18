package MethodPractice;

import java.net.SocketPermission;

public class reversenumorarray {
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    static void reverse(int A[]){
        int B[]=new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++)
        B[j]=A[i];
        //return B;

       for(int num:B)
       System.out.print(num+" ");
    }   
    public static void main(String[] args){
        int Z[]={1,9,5};

    reverse(Z);
     
    }
}
