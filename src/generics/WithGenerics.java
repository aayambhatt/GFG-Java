package generics;

public class WithGenerics {
    public static void main(String[] args) {
        GenericBox<String> gB = new GenericBox<>();
        gB.set("Aayam");

        String name = gB.get();
        System.out.println(name);

        GenericBox<Integer> gI = new GenericBox<>();
        gI.set(23);
        int myAge = gI.get();
        System.out.println(myAge);

    }

}

class GenericBox<T>{
    T value;

    void set(T value){
        this.value = value;
    }

    T get(){
        return value;
    }
}
