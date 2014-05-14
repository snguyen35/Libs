package com.example.slidingpanelayoutexample.provider;

/**
 * Created by jpardogo on 19/06/2013.
 */
public class Items {


    public static final Integer[] getItems(){
        int arrayItems=150;
        Integer[] rows = new Integer[arrayItems];

        for(int i=0;i<arrayItems;i++){
            rows[i]=i;
        }
        return rows;
    }
}
