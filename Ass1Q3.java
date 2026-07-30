import java.util.Scanner;
public class Q3 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int num= sc.nextInt();
    int result=1;
    for (int i = 1; i <= num; i++) {
        result= result*i;
        
    }
    System.out.println("Factoral of " + num + " is " + result);


    }
    
}
