package net.htlgkr.krejo.Lamdas;

public class Main {
    public static void main(String[] args){
        NumberTest oddTester = (z) -> {
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
        nt.testFile();
    }
}
