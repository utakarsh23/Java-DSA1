package Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private T[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomGenericArrayList() {
        this.data = new T[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()) {
            resize();
        }
        data[size++] = num;

    }

    private void resize() {
        int[] temp = new int[data.length*2]; //creating new array of twice the size
        for (int i = 0; i < data.length; i++) { //coping the data of older into newer and bigger array
            temp[i] = data[i];
        }
        data = temp; //pointing data towards temp making the temp array as the data.
    }

    public int remove() {
        int removed = data[--size];
//        data[size+1] = 0;
        return removed;
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int get(int index){
        return data[index];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList arrayList = new CustomGenericArrayList();
        arrayList.add(45);
        arrayList.add(55);
        arrayList.add(65);
        arrayList.add(55);
        arrayList.add(65);
        arrayList.add(55);
        arrayList.add(65);
        arrayList.add(55);
        arrayList.add(65);
        arrayList.add(65);
        arrayList.add(55);
        arrayList.add(65);
        arrayList.add(55);
        arrayList.add(65);
//        arrayList.remove();
        System.out.println(arrayList);

    }
}
