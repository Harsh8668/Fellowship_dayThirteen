package com.javaproject.daythirteen.generic;

public class Generic<E extends Comparable<E>> {
    E x, y, z;

//Created constructor of Generic Class
    public Generic(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

//    It will return the maximum value
    public E maximum(){
        return Generic.maximum(x, y, z);
    }

//    Created the function for giving the maximum values
    public static <E extends Comparable<E>> E maximum(E x, E y, E z) {
        E max = x;
        if (y.compareTo(max)>0){
            max = y;
        }
        if (z.compareTo(max)>0){
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

//    Printing the maximum value
    public static <E> void printMax(E x, E y, E z, E max) {
        System.out.println("Maximum of "+x+" " +y+" " +z+" is " +max);
    }

    public static void main(String[] args) {
        Integer aInt = 4, bInt = 5, cInt = 6;
        Float aFloat = 1.1f, bFloat = 2.2f, cFloat = 3.3f;
        String aStr = "Red", bStr = "Blue", cStr = "Green";

        new Generic(aInt, bInt, cInt).maximum();
        new Generic(aFloat, bFloat, cFloat).maximum();
        new Generic(aStr, bStr, cStr).maximum();
    }
}