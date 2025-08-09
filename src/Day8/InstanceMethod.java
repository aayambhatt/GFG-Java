package Day8;

// Java program to demonstrate the use of instance method

class Test {
    String n = "";

    // Instance method
    public void test(String n) {
        this.n = n;
    }
}
class InstanceMethod {
    public static void main(String[] args) {

        // create an instance of the class
        Test t = new Test();

        // calling an instance method in the class 'InstanceMethod'
        t.test("Aayam");
        System.out.println(t.n);
    }
}