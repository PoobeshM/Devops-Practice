import java.util.*;

public class SimpleCalculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public int mod(int a,int b){
        return a%b;
    }
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        SimpleCalculator c=new SimpleCalculator();
        System.out.println("Enter the first no");
        int b=a.nextInt();
        System.out.println("Select the operations \n1.+\n2.-\n3.*\n4./\n5.%\n");
        int l=a.nextInt();
        if(l>5 || l<1){
            System.out.println("Invalid Choice");
            return;
        }
        System.out.println("Enter the Second Number");
        int d=a.nextInt();
        switch(l){
            case 1:{
                System.out.println(c.add(b,d));
                break;
            }
            case 2:{
                System.out.println(c.sub(b,d));
                break;
            }
            case 3:{
                System.out.println(c.mul(b,d));
                break;
            }
            case 4:{
                System.out.println(c.div(b,d));
                break;
            }
            case 5:{
                System.out.println(c.mod(b,d));
                break;
            }
            default:
                System.out.println("Invalid");
        }
        a.close();
    }
}