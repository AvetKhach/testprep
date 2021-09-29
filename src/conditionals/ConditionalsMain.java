package conditionals;

public class ConditionalsMain {


    public static void main(String[] args) {
        ConditionalExercises exercises = new ConditionalExercises();

        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        String op = "add";
        double result = exercises.calc(a, b, op);
        System.out.println("result is " + result);

        int value = (int) (Math.random() *100);
    }
}
