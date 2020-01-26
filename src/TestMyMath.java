public class TestMyMath {
    public static void main(String[] args) {
        //smallest test
        System.out.println(MyMath.smallest(3,5,7)); //expect 3
        System.out.println(MyMath.smallest(10,0,7)); //expect 0
        System.out.println(MyMath.smallest(4,5,-7)); //expect -7
        //pow test
        System.out.println(MyMath.pow(3,0)); //expect 1
        System.out.println(MyMath.pow(10,1)); //expect 10
        System.out.println(MyMath.pow(2,10)); //expect 1024
        //isPrime test
        System.out.println(MyMath.isPrime(1)); //expect false
        System.out.println(MyMath.isPrime(3)); //expect true
        System.out.println(MyMath.isPrime(25)); //expect false
        System.out.println(MyMath.isPrime(19)); //expect true

    }
}
