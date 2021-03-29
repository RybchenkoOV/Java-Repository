package Generics;

import java.io.Serializable;

public class GenBox<T extends Comparable, V extends Animal & Serializable, N> implements Comparable<T> {
    private T varT;
    private V varV;
    private N varN;

    public GenBox(T varT, V varV, N varN) {
        this.varT = varT;
        this.varV = varV;
        this.varN = varN;
    }

    public T getVarT() {
        return varT;
    }

    public void setVarT(T varT) {
        this.varT = varT;
    }

    public V getVarV() {
        return varV;
    }

    public void setVarV(V varV) {
        this.varV = varV;
    }

    public N getVarN() {
        return varN;
    }

    public void setVarN(N varN) {
        this.varN = varN;
    }

    @Override
    public int compareTo(T o) {
        return getVarT().compareTo(o);
    }

}
