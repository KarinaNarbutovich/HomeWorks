package by.overone.lesson18;

public class Pair<K, V> {
    private K name;
    private V age;

    public Pair(K name, V age) {
        this.name = name;
        this.age = age;
    }

    public Pair() {
    }

    public K getFirst() {
        return name;
    }

    public V getSecond() {
        return age;
    }

    public void setFirst(K first) {
        this.name = first;
    }

    public void setSecond(V second) {
        this.age = second;
    }
}
