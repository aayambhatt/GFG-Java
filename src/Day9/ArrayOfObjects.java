package Day9;

class ProgLangs{
    public String langName;
    public String userName;

    ProgLangs(String langName, String userName){
        this.langName = langName;
        this.userName = userName;
    }

    @Override
    public String toString(){
        return "Language: " + langName + ", User: " + userName;
    }
}


public class ArrayOfObjects {
    public static void main(String[] args) {
        ProgLangs[] arr = new ProgLangs[3];

        ProgLangs p1 = new ProgLangs("Java", "Aayam Bhatt");
        ProgLangs p2 = new ProgLangs("Python", "Aaryan");
        ProgLangs p3 = new ProgLangs("Cobol", "Sunil Sharma");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        for(ProgLangs p : arr){
            System.out.println(p);
        }


    }

}
