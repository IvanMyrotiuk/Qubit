package com.java.myrotiuk.qubit.message;

/**
 * Created by Ivan on 20.01.2019. All rights reserved.
 */
public class ShowMessageService {
    public static String show(Integer number){
        if (number % 5 == 0 && number % 3 == 0) {
            return "FreedomRocks";
        } else if (number % 5 == 0) {
            return "Rocks";
        } else if (number % 3 == 0) {
            return "Freedom";
        } else {
            return number.toString();
        }
    }
}
