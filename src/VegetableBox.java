public class VegetableBox<K, T extends Cabbage> {
    private K obj;
    private T cabage;

    public VegetableBox(K obj, T cabage) {
        this.obj = obj;
        this.cabage = cabage;
    }

    public K getObj() {
        return obj;
    }

    public void setObj(K obj) {
        this.obj = obj;
    }

    public T getCabage() {
        return cabage;
    }

    public void setCabage(T cabage) {
        this.cabage = cabage;
    }
}