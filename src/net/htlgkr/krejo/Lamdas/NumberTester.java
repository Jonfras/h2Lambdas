package net.htlgkr.krejo.Lamdas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester {
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    File file;

    public NumberTester(String fileName){
        file = new File(fileName);
    }

    public void testFile(){
        try {
            Scanner s = new Scanner(file.getAbsoluteFile());
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("Problem mit dem File");
        }

    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){

    }

}
