package Oops;
class student{
    public int rollnum;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        if(average()>=60)
            return 'A';
        else
            return'B';
        }
        public String details(){
            return "ROll No:"+rollnum+"\n";
        }
       
    }

public class StudentTest {
    public static void main(String[] args){
student s=new student();
s.rollnum=1;
s.name="johhnny";
s.course="CS";
s.m1=80;
s.m2=85;
s.m3=93;

System.out.println("Total:"+s.total());
System.out.println("avg:"+s.average());
    }
    }
    

 