package gemDsaPractice;


import java.util.ArrayList;

public class UndoSystem {
    public static void main(String[] args) {
        ArrayList<String> stack = new ArrayList<>();

        // push: adding words
        stack.add("Hello");
        stack.add("world");
        stack.add("Java");

        // pop: removing the top
        if(!stack.isEmpty()){
            String removed = stack.remove(stack.size()-1);
            System.out.println("Removed: " + removed);
        }

        // peek: looking at the new top
        String top = stack.get(stack.size()-1);
        System.out.println("Current top: " + top);

    }


}
