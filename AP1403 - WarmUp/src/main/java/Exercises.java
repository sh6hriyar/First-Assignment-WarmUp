public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {
        if (n < 2)
            return false;
        long a = 2;
        while (true)
        {
            if(n == a)
                return true;
            else if (n%a == 0)
                return false;
            a++;


        }
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        int i = 1;
        int a = 0;
        int b = 1;
        while (a <= n || b <= n)
        {
            if (n == a)
                return i;
            else if (n == b)
                return i+1;
            a = a + b;
            b = b + a;
            i++;
        }
        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        char[][] triangle = new char[n][n];
        for (int line = 0; line < n - 1; line++)
        {
            for (int chara = 0; chara <= line; chara++)
            {
                if (chara == 0 || chara == line)
                    triangle[line][chara] = '*';
                else
                    triangle[line][chara] = ' ';
            }
        }
        for (int c = 0; c < n; c++)
        {
            triangle[n - 1][c] = '*';
        }
        return triangle;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
    }
}
