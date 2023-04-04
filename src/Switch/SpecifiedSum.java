
package Switch;
import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("Enter firstnumber");
        int firstnumber = user.nextInt();
        int sum = 0;
        for(int numb = 0;numb >= firstnumber; numb ++ ){
            System.out.println(sum);
        }


    }


}
