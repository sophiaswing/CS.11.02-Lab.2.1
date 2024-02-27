// I have neither given nor received unauthorized aid on this piece of work.

public class Main {

    public static void main(String[] args) {
        System.out.println(half(3));
    }

     public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }
    public static String morningGreeting (String name){
        return "早上好, " + name + "!";
    }

    public static String afternoonGreeting (String name){
        return "下午好, " + name + "!";
    }
    public static String triple (String name){
        return name+name+name;
    }
    public static double half(double num){
        double result = num/2;
        return result;
    }
    public static int roundPositiveValueToNearestInteger(double number){
        return (int) Math.round(number);
    }
    public static int roundNegativeValueToNearestInteger(double number){
        double posNum = number*-1;
        int posAns = (int)Math.round(posNum);
        return -1*posAns;
    }
    // 1. add
    
    // 2. add

    // 3. morningGreeting

    // 4. afternoonGreeting

    // 5. triple

    // 6. half

    // 7. roundPositiveValueToNearestInteger

    // 8. roundNegativeValueToNearestInteger

}
