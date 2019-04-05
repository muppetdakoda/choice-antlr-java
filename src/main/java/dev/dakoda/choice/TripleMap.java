package dev.dakoda.choice;

import java.util.HashMap;

@SuppressWarnings({"unchecked", "unused"})
public class TripleMap<K, V, T> {

    private HashMap<K, Object[]> doubleMap = new HashMap<>();

    public void put(K k, V v, T t) {
        doubleMap.put(k, new Object[]{v, t});
    }

    public Object[] get(K k) {
        return doubleMap.get(k);
    }

    public V getValue1(K k) {
        return (V) doubleMap.get(k)[0];
    }

    public T getValue2(K k) {
        return (T) doubleMap.get(k)[1];
    }
}
