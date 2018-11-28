/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shuffel;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class SHUFFEL {

    public static void f_shuffel(int arr[]) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int index = (int) (Math.random() * len);
            int tem = arr[i];
            arr[i] = arr[index];
            arr[index] = tem;

        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        ArrayList<int[]> arl = new ArrayList<int[]>();
//        int a1[] = {1, 2, 3};
//
//        SHUFFEL S = new SHUFFEL();
//        S.f_shuffel(a1);
//    }

}
