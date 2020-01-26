public class MyMath {

    public static int smallest(int a,int b, int c) {
        if (a < b)
            if (a < c)
                return a;
            else
                return c;
        else
            return b;
    }

    public static int pow(int num, int power)
    {
        int result = 1;
        for(int i=1;i<=power;i++)
        {
            result*=num;
        }
        return result;
    }

    public static boolean isPrime(int a)
    {
        boolean found = false;
        int i = 2;
        if(a>=2) {
            while (!found && i <= a / 2) {
                if (a % i == 0)
                    found = true;
                else
                    i++;
            }
        }
        else
            return false;

        if(found)
            return false;
        else
            return true;
    }
    }
