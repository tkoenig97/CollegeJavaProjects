package JavaPractice;

public class Main {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = fruits.length; i > 0; i--)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
    }
    
}
