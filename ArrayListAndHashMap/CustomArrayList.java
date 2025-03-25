package ArrayListAndHashMap;

import ArrayListAndHashMap.Exceptions.IndexOutOfBoundsException;

public class CustomArrayList<E> {

    int i;
    private Object[] list;
    private int capacity;

    public CustomArrayList(int capacity){
        this.capacity = capacity;
        list = new Object[capacity];
        i = 0;
    }

    public CustomArrayList(){
        capacity = 10;
        list = new Object[capacity];
        i = 0;
    }

    public int size() {
        return i;
    }

    public boolean isEmpty() {
        return i == 0;
    }

    public boolean contains(E o) {
        for(int j = 0; j <= i; j++){
            if(list[j].equals(o)){
                return true;
            }
        }
        return false;
    }

    public Object get(int pos) throws IndexOutOfBoundsException{
        if(pos >= i)
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        return (E) list[pos];
    }

    public void add(E obj){
        list[i] = obj;
        i++;

        if(i >= capacity){
            capacity *= 1.5;
            Object[] list1 = list;
            list = new Object[capacity];
            System.arraycopy(list1, 0, list, 0, list1.length);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int j = 0; j < i ; j++){
            sb.append(list[j]).append(", ");
        }
        sb.delete(sb.length()-2, sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
}
