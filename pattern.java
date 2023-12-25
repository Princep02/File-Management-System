//Pattern 1
// class pattern{
//    public static void main(String[] args){
//         for(int i=0;i<4;i++){
//             for(int j=0;j<4;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

//pattern 1 part2
// class pattern{
//     static void pattern1(int N){
//         for(int i=0;i<N;i++){
//             for(int j=0;j<N;j++){
//                 System.out.println("x");
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void main(String[] args) {
//         int N=5;
//         pattern1(N);
//     }
// }

//patter 2
// class pattern{
//     public static void main(String[] args){
//         for(int i=0;i<4;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         } 
//     }
// }

//pattern 3
// class pattern{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//pattern 4
// class pattern{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println(" ");
//         }
//     }
// }

//pattern 5
// class pattern{
//     public static void main(String[] args){
//         for(int i=0;i<=4;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

//pattern 6
// class pattern{
//     static void pattern6(int N){
// for(int i=0;i<N;i++){
//             for(int j=N;j>i;j--){
//                 System.out.print(N-j+1+" ");
//             }
//             System.out.println(" ");
//         }
//     } 
//     public  static void main(String[] args){
//         int N=5;
//         pattern6(N);
//     }
// }

//pattern7
// class pattern{
//     public static void main(String[] args){
//         for(int i=0;i<4;i++){
//             for(int j=0;j<4-i-1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*i+1;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<4-i-1;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }}
//     }

//pattern 8
// class pattern{
//     public static void main(String[] args){
//         for(int i=0;i<4;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*4-(2*i+1);j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

//pattern 9
// class pattern{
//     public static void main(String[] args){
//         for(int i=0;i<5;i++){      //errect pyramid
//             for(int j=0;j<5-i-1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*i+1;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<5-i-1;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//             for(int i=0;i<5;i++){     //inverted pyramid
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*5-(2*i+1);j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         }
//     }

//pattern 10
// class pattern{
//     public static void main(String[] args) {
//         for(int i=0;i<5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=0;i<5;i++){
//             for(int j=5;j>i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//pattern 11
// class pattern{
//     public static void main(String[] args) {
//         int start =1;
//         for(int i=0;i<5;i++){
//             if(i%2==0) start=1;
//             else start=0;
//             for(int j=0;j<=i;j++){
//                System.out.print(start);
//                 start=1-start;
//             }
//             System.out.println();
//         }
//     }
// }

//pattern 12
class pattern{
    public static void main(String[] args) {
        int spaces=2*(5-1);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j);
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;
        }
    }
}