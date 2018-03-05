public class MyMath {

    public static int maximum(int a, int b, int c){

       int maxNumber = a;

       if (maxNumber < b) {
           maxNumber = b;
       }

       if (maxNumber < c) {
           maxNumber = c;
       }
       return maxNumber;


    }

    public static int powerOf(int a, int b){
        int power=1;

        for(int count=0; count<b; count++){

            power=power*a;
        }

        return power;
    }
    public static int sumOf(int a){
        int sum=0;
        for (int count=1; count<=a; count++) {

          sum = count + sum;

        }
        return sum;
        }

    public static int multiply(int a){
        int sum=1;
        for (int count=1; count<=a; count++) {

            sum = count * sum;

        }

        if (a==0){
            sum=0;
        }

        return sum;
    }

    public static String isPrime (int a){
        int n=2;
        boolean isPrime=true;
        while(n < a && isPrime){
            if(a % n == 0){
              isPrime=false;
            }
            n++;
        }

        if(isPrime){
            return(a+" is a prime number");
        }
        else{
            return(a+" is not a prime number");
        }

    }

    public static String password (String a){
        boolean length, upper, lower, num;

        int x=0;
        while (a.charAt(x)!= ' '){
            if (a.charAt(x)<=0&&a.charAt(x)>=9){
               num=true;
            }
            if (a.charAt(x)){
                num=true;
            }

            x++;
        }

        if (x>8){
            length=true;
        }

    }


    }



