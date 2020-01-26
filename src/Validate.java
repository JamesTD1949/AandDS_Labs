public class Validate {
    public static boolean validate(String password)
    {
        int upperCase=0;
        int lowerCase=0;
        int digit=0;

        if(password.length()<8)
            return false;
        else
            for(int i=0;i<password.length();i++)
            {
                if(Character.isUpperCase(password.charAt(i)))
                    upperCase++;
                else if (Character.isLowerCase(password.charAt(i)))
                    lowerCase++;
                else if (Character.isDigit(password.charAt(i)))
                    digit++;
            }
            if(upperCase>0 && lowerCase>0 && digit>0)
                return true;
            else
                return false;

    }
}
