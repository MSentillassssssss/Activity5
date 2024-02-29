
package com.mycompany.act5;

import java.util.Scanner;

public class Act5 {

    public static void main(String[] args) {
        double amount;
        String sourceCurrency, targetCurrency;
        
        System.out.println("Currency Converter (EUR to PHP - PHP to EUR)");
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("\n");
        
        System.out.println("Enter amount: ");
        amount = scn.nextDouble();
        
        System.out.println("\n");
        
        System.out.println("Enter the source currency code: ");
        sourceCurrency = scn.next().toUpperCase();
        
        System.out.println("\n");
        
        System.out.println("Enter the target currency code: ");
        targetCurrency = scn.next().toUpperCase();
        
        System.out.println("\n");
        
        double phpToEurRate = 2 ;
        double eurToPhpRate = 60 ;
        
        double convertedAmount;
        
        if (sourceCurrency.equals("PHP")&& targetCurrency.equals("EUR")){
            convertedAmount = amount*phpToEurRate;
            System.out.println(amount + " " + sourceCurrency + " " +" is equal to " + " " + convertedAmount + " " + targetCurrency);
        
            System.out.println("\n");
            
        }else if (sourceCurrency.equals("EUR")&& targetCurrency.equals("PHP")){
            convertedAmount = amount*eurToPhpRate;
            System.out.println(amount + " " + sourceCurrency + " " +" is equal to " + " " + convertedAmount + " " + targetCurrency);
        
        }else{
            System.out.println("Invalid Currency Codes!");
        }
        
        scn.close();
        
                
        
        
    }
}
