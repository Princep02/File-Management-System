import java.util.Scanner;

public class array {
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
         //int A[]={3,9,7,8,12,6,15,5,4,10};
        // int key;
// for(int i=0; i<A.length;i++)
// System.out.println(A[i]);

// for(int i=A.length-1;i>=0;i--){
//     System.out.println(A[i]);
// }
// System.out.println(A.length);

// only take value in forward direction
// for(int x:A){
//     System.out.println(x);
// }

// A[3]=9;
// System.out.println(A[3]);

// for(int i=0;i<A.length;i++){
//     System.out.println(A[i]++);
// }
// for(int x:A){
//     System.out.println(x);
// }

//Sum of element in array
// int Sum=0;
// for(int i=0;i<A.length;i++){
//     Sum=Sum+A[i];
// }
// System.out.println(Sum);

// int sum=0;
// for(int X:A){
//     sum=sum+X;
// }
// System.out.println(sum);


// searching element in array
// Scanner sc=new Scanner(System.in);
// int key;
// System.out.println("ENetr karo");
// key=sc.nextInt();
// for(int i=0;i<A.length;i++){
// if(key==A[i])
// {System.out.println("Element Found at:"+i);
// System.exit(0);}
// }
// System.out.println("Not Found");
// }



// maximum elelmet in array
//  int max=A[0];
//  for(int i=0;i<A.length;i++){
//     if(A[i]>max){
//         max=A[i];
//     }
//  }
//  System.out.println(max);


//2nd largest elemet in array
// int max1=A[0];
// int max2=A[0];
// for(int i=0;i<A.length;i++){
//     if(A[i]>max1)
//     {
//         max2=max1;
//         max1=A[i];
//     }
//     else if(A[i]>max2)
//     {
//         max2=A[i];
//     }
// }
// System.out.println("2nd largest is "+max2);

//Rotating Elements in Array counter clock
// for(int X:A)
//     System.out.print(X+",");
//     System.out.println("");

// int temp=A[A.length-1];

// for(int i=A.length-2;i>=0;i--)
// {
//     A[i+1]=A[i];
// }
// A[0]=temp;
//  for(int X:A)
//     System.out.print(X+",");
//     System.out.println("");

//Rotating Elements in Array clockwise
// for(int X:A)
// System.out.print(X+",");
// System.out.println("");

// int temp=A[0];

// for(int i=1;i<A.length;i++)
// {
// A[i-1]=A[i];
// }
// A[A.length-1]=temp;
// for(int X:A)
// System.out.print(X+",");
// System.out.println("");  

//insering an element.
//int A[]=new int[10];
//A[0]=5;A[1]=9;A[2]=6;A[3]=10;A[4]=12;A[5]=6;
// int n=6;
// for(int i=0;i<n;i++)
// System.out.print(A[i]+",");
// System.out.println("");
// int x=20;
// int index=2;
// for(int i=n;i>index;i--)
// A[i]=A[i-1];
// A[index]=x;
// for(int i=0;i<n;i++)
// System.out.print(A[i]+",");
// System.out.println("");

//Delete an element
// int A[]=new int[10];
// A[0]=5;A[1]=9;A[2]=6;A[3]=10;A[4]=12;A[5]=6;
// int n=6;
// for(int i=0;i<n;i++)
// System.out.print(A[i]+",");
// System.out.println("");
// int index=2;

// int i=0;
// while(i<6){
//     if(i>=2)
//       A[i]=A[i+1];

//       i++;
// }
// for( i=0;i<n-1;i++)
// System.out.print(A[i]+",");

//two dimensional array
// int A[][]=new int[5][5];
// int B[][]={{1,2,3},{2,4,6},{1,3,5}};
// int C[][];
// C=new int[5][5];
// for(int i=0;i<B.length;i++){
//     for(int j=0;j<B[0].length;j++){
// System.out.print(B[i][j]+" ");
// }
// System.out.println("");
// }
// int A[][];
// A=new int[3][];
// A[0]=new int[5];
// A[1]=new int[3];
// A[2]=new int[8];
// for(int i=0;i<A[i].length;i++){
//     for(int j=0;j<A[i].length;j++){
//         System.out.println(A[i][j]+" ");
//     }
//     System.out.println("");
// }

//Adding two dimensional arrays
// int A[][]={{3,5,9},{7,6,2},{4,3,5}};
// int B[][]={{1,5,2},{6,8,4},{3,9,7}};

// int C[][]=new int[3][3];
// for(int i=0;i<A[0].length;i++){
//     for(int j=0;j<A[0].length;j++){
//         C[i][j]=A[i][j]+B[i][j];
//     }
// }
// for(int x[]:C){
//     for(int y:x){
//         System.out.println(y+" ");
//     }
//     System.out.println("");
// }

//Multiplying 2 matrices
// int A[][]={{3,5,9},{7,6,2},{4,3,5}};
// int B[][]={{1,0,0},{0,1,0},{0,0,1}};

// int C[][]=new int[3][3];
// for(int i=0;i<3;i++){
//     for(int j=0;j<3;j++){
//         C[i][j]=0;
//         for(int k=0;k<3;k++){
//             C[i][j]=C[i][j]+A[i][k]*B[k][j];
//         }
//     }
// }
// for(int x[]:C){
//     for(int y:x){
//         System.out.print(y+" ");
//     }
//     System.out.println("");
// }

//Sorting an array
// String arr[]={"prince","gautam","aman","aditya"};
// java.util.Arrays.sort(arr);
// for(String x:arr){
//     System.out.println(x);
// }
}
}
    

