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
int A[]=new int[6];
A[0]=5;A[1]=9;A[2]=6;A[3]=10;A[4]=12;A[5]=6;
int n=6;
for(int i=0;i<n;i++)
System.out.print(A[i]+",");
System.out.println("");
int index=2;

int i=0;
while(i<6){
    if(i>=2)
      A[i]=A[i+1];

      i++;
}
for( i=0;i<n-1;i++)
System.out.print(A[i]+",");
 }
}
    

