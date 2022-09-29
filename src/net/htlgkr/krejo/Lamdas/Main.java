package net.htlgkr.krejo.Lamdas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**NumberTest oddTester = (z) -> {
         if (z % 2 == 0) return true;
         return false;
         };

         NumberTest primeTester = (z) -> {
         if (z <= 1)
         return false;
         for (int i = 2; i < z; i++)
         if (z % i == 0)
         return false;
         return true;
         };

         NumberTest palindromeTester = (z) -> {
         String reverse = new StringBuffer(z + "").reverse().toString();
         return (z + "").equals(reverse);
         };
         NumberTester nt = new NumberTester("numbers.csv");
         nt.setOddEvenTester(oddTester);
         nt.setPrimeTester(primeTester);
         nt.setPalindromeTester(palindromeTester);
         nt.testFile();**/

        CalculationOperation add = (Number a, Number b) -> new Number(a.getA() + b.getA(), a.getB() + b.getB());
        CalculationOperation subtract = (Number a, Number b) -> new Number(b.getA() - a.getA(), b.getB() - a.getB());
        CalculationOperation multiply = (Number a, Number b) -> new Number(a.getA() * b.getB(), a.getB() * b.getA());
        CalculationOperation divide = (Number a, Number b) -> new Number(a.getA() / b.getB(), a.getB() / b.getA());//check Skalarprodukt nicht ganz
        CalculationOperation add1 = (n, m) -> new Number(n.getA() * m.getB() + m.getA() * n.getB(), n.getB() * m.getB());
        CalculationOperation sub = (n, m) -> new Number(n.getA() * m.getB() - m.getA() * n.getB(), n.getB() * m.getB());
        CalculationOperation mul = (n, m) -> new Number(n.getA() * m.getA(), n.getB() * m.getB());
        VectorCalculator vc = new VectorCalculator(add, subtract, multiply, divide);
        RationalCalculator rc = new RationalCalculator(add1, sub, mul, multiply);
        Scanner s = new Scanner(System.in);
        int input = 0;
        int input1;
        Number n = new Number(0, 0);
        Number m = new Number(0, 0);
        Number number = null;
        while (input != 3) {
            System.out.println("Choose calculator");
            System.out.println("1 - Vector Calculator");
            System.out.println("2 - Rational Calculator");
            System.out.println("3 - Exit Programm");
            input = Integer.parseInt(s.nextLine());
            do {
                System.out.println("Enter number x a");
                n.setA(Double.parseDouble(s.nextLine()));
                System.out.println("Enter number x b");
                n.setB(Double.parseDouble(s.nextLine()));
                System.out.println("Enter number y a");
                m.setA(Double.parseDouble(s.nextLine()));
                System.out.println("Enter number y b");
                m.setB(Double.parseDouble(s.nextLine()));
                System.out.println("Choose operation:");
                System.out.println("1 - add");
                System.out.println("2 - subtract");
                System.out.println("3 - multiply");
                System.out.println("4 - divide");
                System.out.println("5 - enter numbers again");
                input1 = Integer.parseInt(s.nextLine());
            } while (input1 == 5);
            if (input == 1){
                switch (input1){
                    case 1:
                        System.out.println(vc.add(n, m).toString());break;
                    case 2:System.out.println(vc.subtract(n, m).toString());break;
                    case 3:System.out.println(vc.multiply(n, m).toString());break;
                    case 4:System.out.println(vc.divide(n, m).toString());break;
                }
            }else if (input== 2){
                switch (input1){
                    case 1:System.out.println(rc.add(n, m).toString());break;
                    case 2:System.out.println(rc.subtract(n, m).toString());break;
                    case 3:System.out.println(rc.multiply(n, m).toString());break;
                    case 4:System.out.println(rc.divide(n, m).toString());break;
                }
            }
            else break;
        }
    }
}
