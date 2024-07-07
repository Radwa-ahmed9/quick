/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorttt;

import java.util.ArrayList;
import static sorttt.QuickSortExample.fillArray;
import static sorttt.QuickSortExample.print;
import static sorttt.QuickSortExample.quickSort;


/**
 *
 * @author Lenovo
 */
public class Sorttt {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //اا
        ArrayList<Integer> arr = new ArrayList<>();
        fillArray(arr);
        quickSort(arr, 0, arr.size() - 1);
        print(arr);
    }
}
