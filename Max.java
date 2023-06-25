package MethodPractice;

public class Max {
    public static void main(String[] args){
        int [] arr=new int[]{25,35,45,55,88};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("largest elements is: "+max);
    }
    
}
