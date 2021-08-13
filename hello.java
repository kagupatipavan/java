import java.util.Scanner;
import java.util.*;
class hello{
    public static int pow(int a,int b){
        if(b==1)
        return a;
        else
        return pow(a,b-1)*a;
    }
    public static void main(String [] args){
     Scanner s1=new Scanner(System.in);
     int ffs;
   ArrayList<Integer> a1=new ArrayList<Integer>();
   for(int i=0;i<5;i++){
ffs=s1.nextInt();
a1.add(ffs);
   }
   System.out.println(a1);
     s1.close();
    }
}