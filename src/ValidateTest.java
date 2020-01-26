public class ValidateTest {
    public static void main(String[] args) {
        System.out.println(Validate.validate("password")); //expect false
        System.out.println(Validate.validate("passwor")); //expect false
        System.out.println(Validate.validate("P1sswor")); //expect false
        System.out.println(Validate.validate("P1ssword")); //expect true
    }
}
