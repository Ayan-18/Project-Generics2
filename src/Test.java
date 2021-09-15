public class Test {
    public static void main(String[] args) {
        ZadachiGeneriki3.Box<String, ZadachiGeneriki3.Fruit> bananaBox = new ZadachiGeneriki3.Box<>("Banana", new Banana());
        bananaBox.getFruit().printClass();

        ZadachiGeneriki3.Box<String, ZadachiGeneriki3.Fruit> appleBox = new ZadachiGeneriki3.Box<>("Apple", new ZadachiGeneriki3.Apple());
        appleBox.getFruit().printClass();

        ZadachiGeneriki3.Box<String, ZadachiGeneriki3.Fruit> fruitBox = new ZadachiGeneriki3.Box<>("Fruit", new ZadachiGeneriki3.Fruit());
        fruitBox.getFruit().printClass();

        ZadachiGeneriki3.VegetableBox<String, Cabbage> cabbageBox = new ZadachiGeneriki3.VegetableBox<>("Cabbage", new Cabbage());
        cabbageBox.getCabage().printClass();
    }
}