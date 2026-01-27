package excer.generics;

public class Container<E> {
    private E object;

    public void setObject(E object){
        this.object = object;
    }

    public E getObject(){
        return object;
    }
}

class ContainerDemo{
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();

        stringContainer.setObject("This is a String");

        String res = stringContainer.getObject();
        System.out.println(res);
    }
}
