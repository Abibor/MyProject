package entitles;

import java.util.Arrays;

public class Array {
    int[] myArray = new int[5];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public Array() {

    }

    public Array(String first, String second, String third, String fourth, String fifth){
        myArray[0] = Integer.parseInt(first);
        myArray[1] = Integer.parseInt(second);
        myArray[2] = Integer.parseInt(third);
        myArray[3] = Integer.parseInt(fourth);
        myArray[4] = Integer.parseInt(fifth);

        //метод реализующий сортировку методом пузырька
        sortArray();
        
        a = String.valueOf(myArray[0]);
        b = String.valueOf(myArray[1]);
        c = String.valueOf(myArray[2]);
        d = String.valueOf(myArray[3]);
        e = String.valueOf(myArray[4]);

        //I'd like to see this row in GitHub repository
        //And now i want to see this row anywhere!
    }

    //метод реализующий сортировку методом пузырька
    private void sortArray(){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < myArray.length-1; i++) {
                if(myArray[i] > myArray[i+1]){
                    isSorted = false;
                    buf = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = buf;
                }
            }
        }
    }

    public int[] getArray(){
        return myArray;
    }

    public String toString(){
        return "Array{" + "myArray='" + Arrays.toString(myArray) + '\'' + '}';
    }

    //клонирование объекта array, сравнение и проверка с создаваемым классом
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass()!= o.getClass()) return false;

        Array array = (Array) o;

        if(!Arrays.equals(myArray, array.myArray)) return false;
        return Arrays.equals(myArray, array.myArray);
    }

    @Override
    public int hashCode(){
        int result = myArray != null ? Arrays.hashCode(myArray) : 0;
        result = 31 * result + ((myArray != null) ? Arrays.hashCode(myArray) : 0);
        return result;
    }
}
