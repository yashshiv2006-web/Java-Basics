import java.util.*;

public class Income_Tax_calculator{
    public static void main(String arg[]){
        System.out.println("Income tax Calculator");
        System.out.print("Enter Your Salary:");
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();
        if (salary <= 50000){
            System.out.println(" 0% Tax : Received Salary :"+salary);
        }
        else if(salary > 50000 && salary <= 100000){
            float tax = salary*0.2f;
            float new_salary = salary - tax;
            System.out.println("Salary after 20% Tax deducted: "+new_salary);
        }
        else if (salary > 100000){
            System.out.println("30% Tax Included :\n");
            float tax = salary*0.3f;
            float new_salary = salary-tax;
            System.out.println("Salary after 30 % Tax Deduction: "+new_salary);

        }

    }
}