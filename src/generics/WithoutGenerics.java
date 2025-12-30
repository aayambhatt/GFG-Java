package generics;

public class WithoutGenerics {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.set("Aaryan");

        String name = (String) b1.get();
        System.out.println(name);


        Box b2 = new Box();
        b2.set(10);


    }

}

// problems with this code is that, there is no type safety, casting is needed, runtime errors
class Box{
    Object value;

    void set(Object value){
        this.value = value;
    }

    Object get(){
        return value;
    }
}
