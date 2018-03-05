import java.util.Scanner;

public class TestMyMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println(MyMath.maximum(8,7,6)); //expect 8
        System.out.println(MyMath.maximum(8,7,9));//expect 9
        System.out.println(MyMath.maximum(-29,7,6));//expect 7




        System.out.println(MyMath.powerOf(3,2));//expect 9
        System.out.println(MyMath.powerOf(9,4));//expect 6561



        System.out.println(MyMath.sumOf(8));//expect 36
        System.out.println(MyMath.sumOf(6));//expect 21

        System.out.println(MyMath.multiply(3));//expect 6
        System.out.println(MyMath.multiply(8));//expect 40320
        System.out.println(MyMath.multiply(1));//expect 1
        System.out.println(MyMath.multiply(0));//expect 0


        System.out.println(MyMath.prime(7));//expect prime
        System.out.println(MyMath.prime(13));//expect prime
        System.out.println(MyMath.prime(22));//expect not prime
        System.out.println(MyMath.prime(100));//expect not prime

    }
}
