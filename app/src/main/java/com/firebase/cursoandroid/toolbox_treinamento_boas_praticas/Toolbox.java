package com.firebase.cursoandroid.toolbox_treinamento_boas_praticas;

/**
 * Created by glauc on 13/11/2017.
 */

public class Toolbox {

    public static boolean sConv(int status) {
        if (status == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean sConv(String status) {
        if (status == "s") {
            return true;
        } else {
            return false;
        }
    }

    public static int sConvInt(boolean status) {
        if (status) {
            return 1;
        } else {
            return 0;
        }
    }
}
