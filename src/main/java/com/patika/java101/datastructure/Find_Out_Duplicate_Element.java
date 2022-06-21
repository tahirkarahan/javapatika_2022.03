package com.patika.java101.datastructure;

public class Find_Out_Duplicate_Element {
    public static void main(String[] args) {
    int[] list={1, 3, 7, 8, 4, 6, 2, 3, 5, 8, 1, 3, 7};
    for (int i=0; i<list.length; i++){
        for (int j=i+1;j<list.length;j++){
            if (list[i]==list[j]){
                System.out.println("duplicate value sorting="+list[j]+" ");
                break;
            }
        }
        }

    }

}
