public class homeWork2 {
    public static void main(String[] args) {
        MyInteger int1 = new MyInteger(24);
        MyInteger int2 = new MyInteger(13);
        MyInteger int3 = new MyInteger(2);
        MyInteger int4 = new MyInteger(23);

        System.out.printf("%d is prime? %s%n", int1.getValue(), int1.isPrime());
        System.out.printf("%d is prime? %s%n", int2.getValue(), int2.isPrime());
        System.out.printf("%d is prime? %s%n", int3.getValue(), int3.isPrime());
        System.out.printf("%d is even? %s%n", int1.getValue(), int1.isEven());
        System.out.printf("%d is even? %s%n", int2.getValue(), int2.isEven());
        System.out.printf("%d is even? %s%n", int3.getValue(), int3.isEven());
        System.out.printf("57 is odd? %s%n", MyInteger.isOdd(57));
        System.out.printf("%d equals %d? %s%n", int1.getValue(), int4.getValue(), int1.equals(int4));
        System.out.printf("Array = %d%n", MyInteger.parseInt(new char[] {'5', '5', '5'}));
        System.out.printf("String = %d%n", MyInteger.parseInt("100000"));
    }
}


class MyInteger {
    private int Value;

    public MyInteger(int value) {
        Value = value;
    }

    public int getValue() {
        return Value;
    }

    public boolean isEven() {
        return (Value % 2) == 0;
    }

    public boolean isOdd() {
        return (Value % 2) == 1;
    }

    public boolean isPrime() {
        if (Value == 1 || Value == 2) {
            return true;
        }
        else {
            for (int i = 2; i < Value; i++) {
                if (i % Value == 0) return false;
            }
        }
        return true;
    }

    public static boolean isEven(int myIntegar) {
        return (myIntegar % 2) == 0;
    }

    public static boolean isOdd(int myIntegar) {
        return (myIntegar % 2) == 1;
    }

    public static boolean isPrime(int myIntegar) {
        if (myIntegar == 1 || myIntegar == 2) {
            return true;
        }
        else {
            for (int i = 2; i < myIntegar; i++) {
                if (i % myIntegar == 0) return false;
            }
        }
        return true;
    }    

    public static boolean isEven(MyInteger Int) {
        return Int.isEven();
    }

    public static boolean isOdd(MyInteger Int) {
        return Int.isOdd();
    }

    public static boolean isPrime(MyInteger Int) {
        return Int.isPrime();
    }

    public boolean equals(int testInt) {
        if (testInt == Value) 
            return true;
        return false;
    }

    public boolean equals(MyInteger myInt) {
        if (myInt.Value == this.Value) 
            return true;
        return false;
    }

    public static int parseInt(char[] values) {
        int sum = 0;
        for (char i : values) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}