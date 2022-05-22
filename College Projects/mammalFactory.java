public class mammalFactory {

    // Use getMammal method to get mammal object
    public factoryPattern.mammal getMammal(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Cat")){
            return new cat();

        } else if(shapeType.equalsIgnoreCase("Human")){
            return new human();

        } else if(shapeType.equalsIgnoreCase("Dog")){
            return new dog();
        }

        return null;
    }
}