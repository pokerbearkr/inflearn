package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(10);

        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);

        Integer result2 = GenericMethod.<Integer>numberMethod(10);
        System.out.println("result2 = " + result2);
    }
}
