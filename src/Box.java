public class Box<K, T extends Fruit> {
    private K obj;
    private T fruit;

    public Box(K obj, T fruit) {
        this.obj = obj;
        this.fruit = fruit;
    }

    public K getObj() {
        return obj;
    }

    public void setObj(K obj) {
        this.obj = obj;
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }
}