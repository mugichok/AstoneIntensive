package src.ArrayListAndHashMap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class CustomHashMap<K ,V> {

    public LinkedList<CustomNode<K,V>>[] Customtable;
    private int size;
    static final int DEFAULT_SIZE = 16;


    static class CustomNode<K, V>{
        int hash;
        final K key;
        V value;

        public CustomNode(K key, V value){
            this.key = key;
            this.value = value;
        }

        public boolean comparisonKeys(K key){
            return Objects.equals(this.key, key);
        }

    }

    public CustomHashMap(){
        Customtable = new LinkedList[DEFAULT_SIZE];
        size = 0;
    }

    private int getHash(Object key){
        int h;
        return (key == null) ? 0 : (Objects.hashCode(key)) ^ (key.hashCode() >>> 16);
    }

    private int getIndex(Object key){
        return getHash(key) % (Customtable.length-1);
    }

    public void put(K key, V val){
        if(Customtable[getIndex(key)] == null) {
            Customtable[getIndex(key)] = new LinkedList<>();
            Customtable[getIndex(key)].add(new CustomNode<>(key, val));
            size++;
        } else{
            for(CustomNode<K, V> node : Customtable[getIndex(key)]){
                if(Objects.equals(node.key,key)){
                    node.value = val;
                    return;
                }
            }
            Customtable[getIndex(key)].add(new CustomNode<>(key, val));
        }
    }

    public V get(K key) {
        if (Customtable[getIndex(key)] == null)
            return null;
        for(CustomNode<K, V> node : Customtable[getIndex(key)]){
            if(Objects.equals(node.key, key)){
                return node.value;
            }
        }
        return null;
    }

    public int size(){
        return size;
    }

    public boolean containsKey(Object o){
        if(Customtable[getIndex(o)] == null)
            return false;
        for(CustomNode<K, V> node : Customtable[getIndex(o)]){
            if(Objects.equals(o, node.key)){
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Object o){
        for(LinkedList<CustomNode<K,V>> list : Customtable){
            if(list != null) {
                for (CustomNode<K, V> node : list) {
                    if (Objects.equals(o, node.value)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomHashMap<?,?> map)) return false;
        return size == map.size && Objects.deepEquals(Customtable, map.Customtable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(Customtable), size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(LinkedList<CustomNode<K,V>> list : Customtable){
            if(list != null){
                for(CustomNode<K, V> node : list){
                    sb.append(node.key).append("=").append(node.value).append(", ");
                }
            }
        }
        sb.delete(sb.length()-2, sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
}
