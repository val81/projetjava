/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author pedago
 */
public class DiscountCode {

    private char code;
    private double rate;

    public DiscountCode(char code, double rate)
    {
        this.code = code;
        this.rate = rate;
    }


    char getCode()
    {
        return this.code;
    }
    
    double getRate()
    {
        return this.rate;
    }    
}
