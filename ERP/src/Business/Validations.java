/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author karan
 */
public class Validations {

    public static boolean isTextFieldEmpty(String x) {

        if (x.trim().equals("")) {
            return true;
        }
        return false;
    }

}
