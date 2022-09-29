package net.htlgkr.krejo.Lamdas;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class NumberTester {

    File file;
    final String DELIMITER = " ";

    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;



    public NumberTester(String fileName) {
        file = new File(fileName);
    }

    public void testFile() {
        try {
            boolean b = false;
            Scanner s = new Scanner(file.getAbsoluteFile());
            System.out.println();
            int counter = Integer.parseInt(s.nextLine());
            for (int i = 0; i < counter; i++) {
                String[] arr = s.nextLine().split(DELIMITER);
                int x = Integer.parseInt(arr[0]);
                int y = Integer.parseInt(arr[1]);
                switch (x) {
                    case 1:
                        System.out.print("Testing odd or even...");
                        b = oddTester.testNumber(y);
                        System.out.println(b);
                        break;
                    case 2:
                        System.out.print("Testing prime or no prime...");
                        b = primeTester.testNumber(y);
                        System.out.println(b);
                        break;
                    case 3:
                        System.out.print("Testing palindrome or no palindrome...");
                        b = palindromeTester.testNumber(y);
                        System.out.println(b);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem mit dem File");
        }
    }


    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

}
