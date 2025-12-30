package generics;

public class GenericsInterface {
    public static void main(String[] args) {
        Processor<String> p = (s) -> {
            System.out.println(s.toUpperCase());
        };
        p.process("aayam");

        Processor<Integer> x = (i) -> {
           int result = i*2;
            System.out.println(result);
        };
        x.process(20);
    }
}
