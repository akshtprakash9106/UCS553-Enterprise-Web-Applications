import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character");
        char alphabet=sc.next().charAt(0);
        if((alphabet>='A' && alphabet<='Z')||(alphabet>='a' && alphabet<='z')){
            System.out.println(alphabet+" is an alphabet");

        }else{
            System.err.println(alphabet+" isnt alphabet");
        }
        sc.close();
    }
    
}
