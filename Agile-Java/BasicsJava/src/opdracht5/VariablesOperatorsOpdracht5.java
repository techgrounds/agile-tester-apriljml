package opdracht5;

public class VariablesOperatorsOpdracht5 {
    public static void main(String[] args) {
        Ben ben = new Ben();
        System.out.println(ben.numberOfCats % 4);
    }
}

class Ben {
    int numberOfCats = 10 + 5;

}