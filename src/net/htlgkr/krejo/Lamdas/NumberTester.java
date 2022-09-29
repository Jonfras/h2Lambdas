package net.htlgkr.krejo.Lamdas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class NumberTester {

    File file;
    final String DELIMITER = " ";

    NumberTest oddTester = (z) -> {
        System.out.println("nigg");
        if (z % 2 == 0) return true;
        return false;
    };

    NumberTest primeTester = (z) -> {
        System.out.println("Testing prime or no prime...");
        if (z % 2 == 0) return true;
        return false;
    };

    NumberTest palindromeTester = (z) -> {
        System.out.println("Testing palindrome or no palindrome...");
        if (z % 2 == 0) return true;
        return false;
    };

    public NumberTester(String fileName) {
        file = new File(fileName);
    }

    public void testFile() {
        try {
            Scanner s = new Scanner(file.getAbsoluteFile());
            System.out.println();
            int counter = Integer.parseInt(s.nextLine());
            for (int i = 0; i < counter; i++) {
                String[] arr = s.nextLine().split(DELIMITER);
                int x = Integer.parseInt(arr[0]);
                int y = Integer.parseInt(arr[1]);
                switch (x) {
                    case 1:
                        System.out.println("Testing odd or even...");
                        setOddEvenTester(oddTester);
                    case 2:

                    case 3:

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem mit dem File");
        }
    }


    public void setOddEvenTester(NumberTest oddTester) {
        oddTester.testNumber();
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

}
