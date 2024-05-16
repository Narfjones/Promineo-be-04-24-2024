package week3;

import week3.Animal;

public class week3 {
    
    public static void main(String[] args){

        Animal dog = new Animal("Francesco");
        dog.setSound("woof woof, who lets the dogs out, no seriously, please let me out.");

        int[] arr1 = {16,17,18,19,20};
        String[] arr3 = {"two", "funny", "words"};

        int arrLength = 5;
        int[] arr2 = new int[arrLength];

        actualArrayCopy(arr3);

        for(int num: actualArrayCopy(arr1)){
            System.out.println(num);
        }
    }

    // Line that defines the method is the method signature and has to be unique
    public static String[] actualArrayCopy(String[] arr){
        String[] arrCopy = new String[arr.length];

        int counter = 0;
        for(String num: arr){
            arrCopy[counter] = num;
            counter++;
        }
        return arrCopy;
    }

    public static int[] actualArrayCopy(int[] arr){
        int[] arrCopy = new int[arr.length];

        int counter = 0;
        for(int num: arr){
            arrCopy[counter] = num;
            counter++;
        }
        return arrCopy;
    }


    // Creates two arrays and turns the second into a pointer at the first.
    // Changing arr1 will implicitly change the value reported by arr2
    // arr2 is just arr1 wearing a mask.
    public static void stopCopyingMe(){
        int[] arr1 = {16,17,18,19,20};

        int arrLength = 5;
        int[] arr2 = new int[arrLength];

        arr2 = arr1; // Doesn't fill arr2. It turns arr2 into a pointer.

        System.out.println(arr1);
        for(int num: arr1){
            System.out.println(num);
        }

        arr1[2] = 465;

        System.out.println(arr2);
        for(int num: arr1){
            System.out.println(num);
        }
    }


}
