package Generics;

import java.util.Arrays;

public class WildCardss<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public WildCardss() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()) {
            resize();
        }
        data[size++] = num;

    }

    private void resize() {
        Object[] temp = new Object[data.length*2]; //creating new array of twice the size
        for (int i = 0; i < data.length; i++) { //coping the data of older into newer and bigger array
            temp[i] = (data[i]);
        }
        data = temp; //pointing data towards temp making the temp array as the data.
    }

    public T remove() {
        T removed = (T)data[--size];
//        data[size+1] = 0;
        return removed;
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T get(int index){
        return (T)data[index];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildCardss<Integer> cus = new WildCardss<>();
        cus.add(78);
        cus.add(78);
        cus.add(78);
        cus.add(78);
        cus.add(78);
        cus.add(78);
        cus.add(78);
        cus.add(78);
        cus.add(78);
        cus.add(78);
        cus.add(78);
        System.out.println(cus);
    }
}
