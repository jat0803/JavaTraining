/**
 * Created by tonje01 on 2/3/2016.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Checks {
    public static void main(String args[]){
        Scanner var = new Scanner(System.in);
        int chkNum;
        double balance, chkAmt;
        chkAmt = 0;

        System.out.println("What is the checking account opening balance?: ");
        balance = var.nextDouble();
        System.out.println("What is the first check number?: ");
        chkNum = var.nextInt();
        System.out.println("Enter the check amount for check "+chkNum+":");
        chkAmt = var.nextDouble();
        balance -= chkAmt;

        while(chkAmt >= 0){
            chkNum++;
            System.out.println("Enter the check amount for check "+chkNum+":");
            chkAmt = var.nextDouble();

            if(chkAmt >= 0){
                balance -= chkAmt;
            }

            if(balance < 0){
                System.out.println("Account balance is negative.");
            }
        }
        var.close();
        NumberFormat formatter = new DecimalFormat("##.##");
        System.out.println("Ending account balance is " +formatter.format(balance));
    }
}
