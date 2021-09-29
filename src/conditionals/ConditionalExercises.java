package conditionals;

public class ConditionalExercises {

    public void printNumDescription(int value) {

        if (value >= 0 && value < 10)
        {System.out.println("It is a digit");
        } else if (value >= 10 && value <100){
            if (value %2 ==0) {
                System.out.println("It is a two-digit even number");
            } else {
                System.out.println("It is a two-digit odd number");
            }
        }else {
            System.out.println("Out of bount");
        }
    }

    public boolean isOdd(int number){
        return number %2 ==0;
    }

    public double calc(double a, double b, String op) {
        System.out.println("a + op + b" + a + op + b);
        switch (op) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mult":
                return a * b;
            case "div":
                return b == 0 ? -1 : a / b;
            default:
                return -1;

        }
    }

}




