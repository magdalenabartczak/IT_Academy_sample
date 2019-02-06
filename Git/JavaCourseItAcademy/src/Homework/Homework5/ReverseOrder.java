//package Homework.Homework5;
//
////Define some array (int or char or any other type) and print elements of this array in reverse order
//// (from end to beginning), separating with comma. You should not add comma after the last element.
////
////        how to create an array of lenght 5 with integers: int[] myArray = new int[5];
////        how to write value 14 into the first element of the array: myArray[0] = 14;
////        how to get the length of the array: int arrayLength = myArray.length;
////
//public class ReverseOrder {
//    public static void main(String[] args) {
//
//        int[] myArray =  {14, 24, 34, 44, 54};
//
//
//        for (int i = 0; i < myArray.length; i++) { // print original array
//            System.out.println(myArray[i]);
//        }
//
//
//        int n = myArray.length;
//        int[] reversed = new int[n]; //new array
//
//        for (int i = 0; i < n; i++) {     //reverse
//            reversed[n - 1] = myArray[i];
//            n = n--;
//        }
//
//        System.out.println("Reversed array: "); // print reversed array
//        for (int j = 0; j < n; j++) {
//            System.out.print(reversed[j]+ ", ");
//
//        }
//        // if I=0 nie printujemy przecinka
//        // int alternative = new int [] { 1, 2, 3}
//        // zrobić to z wywołaniem metod tak jak było w podpowiedziach w necie na tej czarnej stronie
//        // for( int v: numbers) <- przejdzie po wszystkich elementach tablicy "value of array" to sie nazywa
//        //
//    }
//}