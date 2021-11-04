package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("TAX Payer #" + i + " data:");
            System.out.print("Individual or Company (i/c)? ");
            char ch = sc.next().charAt(0);

            if (ch == 'i') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double annualIncome = sc.nextDouble();

                System.out.print("Health expenditures: ");
                double healthExpends = sc.nextDouble();

                list.add(new Individual(healthExpends, name, annualIncome));
            } else if (ch == 'c') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double annualIncome = sc.nextDouble();

                System.out.print("Number of employees: ");
                int employeeNumbers = sc.nextInt();

                list.add(new Company(employeeNumbers, name, annualIncome));
            }
        }
       
        double sum = 0.0;
        
        System.out.println("\nSHAPE AREAS:");
        
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();

    }

}
