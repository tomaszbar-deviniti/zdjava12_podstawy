package rozwiazaniazadan;

import java.util.Arrays;

public class StringsContainer {
    public static void main(String[] args){
        StringsContainer container = new StringsContainer(new String[]{"Ala", "ma", "kota", "a", "kot", "ma", "Alę"});
        System.out.println(container);
        container.set("psa",2);
        System.out.println(container);
        container.bubbleSort();
        System.out.println(container);
        container.add("balę");
        System.out.println(container);
        container.remove(container.getLenght()-1);
        System.out.println(container);
        container.swap(2,5);
        System.out.println(container);
    }

    private String[] data;

    public StringsContainer(String[] initialData) {
        this.data = initialData;
    }

    public void set(String newData, int index){
        if(index < 0 || index >= data.length){
            System.out.println("Nieprawidłowy indeks tablicy");
            return;
        }
        data[index] = newData;
    }

    public void add(String newData){
        String[] newArray = new String[data.length+1];
        for(int i=0;i<newArray.length;i++){
            if(i == newArray.length-1){
                newArray[i] = newData;
            }else {
                newArray[i] = data[i];
            }
        }
        this.data = newArray;
    }


    public void remove(int index){
        if(index < 0 || index >= data.length){
            System.out.println("Nieprawidłowy indeks tablicy");
            return;
        }
        String[] newArray = new String[data.length-1];
        for(int i=0;i<newArray.length;i++){
            if(i < index){
                newArray[i] = data[i];
            }else {
                newArray[i] = data[i-1];
            }
        }
        this.data = newArray;

    }

    public void swap(int left, int right){
        String[] newArray = new String[data.length];
        for(int i=0;i<data.length;i++){
            if(i == left || i == right){
                newArray[right] = data[left];
                newArray[left] = data[right];
            }else{
                newArray[i] = data[i];
            }
        }
        this.data = newArray;
    }

    public void bubbleSort(){
        String[] sortedArray = new String[data.length];
        String temp;
        while(!Arrays.equals(sortedArray,data)){
            sortedArray = Arrays.copyOf(data,data.length);
            for(int j=data.length-1;j>0;j--) {
                for (int i = 0; i < j; i++) {
                    if (data[i].length() > data[i + 1].length()) {
                        temp = data[i];
                        data[i] = data[i + 1];
                        data[i + 1] = temp;
                    }
                }
            }
        }
        this.data = sortedArray;
    }

    public int getLenght(){
        return data.length;
    }

    public String toString() {
        String result = "[ ";
        for (int i = 0; i < data.length; i++) {
            if(i != data.length-1) {
                result += data[i] + ", ";
            }else{
                result += data[i] + "]";
            }
        }
        return result + "\n";
    }
}
