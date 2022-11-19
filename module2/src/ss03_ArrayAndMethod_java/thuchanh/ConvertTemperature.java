package ss03_ArrayAndMethod_java.thuchanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
       int num;
       double Celsius;
       double Fahrenheit;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter the number: ");
             num=scanner.nextInt();
             switch (num){
                 case 1:
                     System.out.println("Enter fahrenheit: ");
                     Fahrenheit = scanner.nextDouble();
                     System.out.println("Fahrenheit to Celsius: "+FahrenheitToCelsius(Fahrenheit));
                     break;
                 case 2:
                     System.out.println("Enter celsius: ");
                     Celsius = scanner.nextDouble();
                     System.out.println("Fahrenheit to Celsius: "+celsiusToFahrenheit(Celsius));
                     break;
                 case 0:
                     System.exit(0);
             }
        }while (num!=0);
    }
    static double celsiusToFahrenheit( double celsius){
        double fehrenheit=(9.0 / 5) * celsius + 32;
        return fehrenheit;
    }
    static double FahrenheitToCelsius( double fahrenheit){
        double celsius=(9.0 / 5) * fahrenheit + 32;
        return celsius;
    }


}
