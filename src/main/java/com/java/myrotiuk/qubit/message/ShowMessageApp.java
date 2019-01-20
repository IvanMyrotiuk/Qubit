package com.java.myrotiuk.qubit.message;

import static com.java.myrotiuk.qubit.message.ShowMessageService.show;

/**
 * Created by Ivan on 20.01.2019. All rights reserved.
 */
public class ShowMessageApp {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            System.out.println(show(i));
        }
    }
}
