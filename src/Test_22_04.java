public class Test_22_04 {
    public static void main(String args[]) {

        boolean isprime = true;
        int i, j;
        for (i = 2; i < 100; i++) {
            isprime = true;
            // проверить, делится ли число без остатка
            for (j = 2; j <= i / j; j++)
                // если число делится без остатка, значит, оно не простое
                if ((i % j) == 0) isprime = false;
            if (isprime)
                System.out.println(i + " - простое число.");
        }
    }
}
