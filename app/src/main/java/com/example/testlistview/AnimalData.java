package com.example.testlistview;

import com.example.testlistview.model.Animal;

import java.util.ArrayList;

/**
 * Created by ADMIN on 29/10/2560.
 */

public class AnimalData {
    private static AnimalData sTnstent;



    public static AnimalData getsTnstent(){
        if(sTnstent == null){
            sTnstent = new AnimalData();

        }
        return  sTnstent;
    }
}
