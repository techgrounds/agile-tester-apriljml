public class VariablesOperatorsOpdracht3 {
    public static void main(String[] args) {
        Ben ben = new Ben();
        System.out.println(ben.numberOfCats + ben.test);
    }
}

class Ben {
    int numberOfCats = 10;
    String test = "123";
}