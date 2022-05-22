public class factoryPatternDemo {

    public static void main(String[] args) {
        mammalFactory mammalFactory = new mammalFactory();

        // Get a Cat object and call its draw method.
        factoryPattern.mammal mammal1 = mammalFactory.getMammal("Cat");

        // Call draw method of Cat
        mammal1.draw();

        // Get a Rectangle object and call its draw method.
        factoryPattern.mammal mammal2 = mammalFactory.getMammal("Human");

        // Call draw method of Human
        mammal2.draw();

        // Get a Square object and call its draw method.
        factoryPattern.mammal mammal3 = mammalFactory.getMammal("Dog");

        // Call draw method of Dog
        mammal3.draw();
    }
}