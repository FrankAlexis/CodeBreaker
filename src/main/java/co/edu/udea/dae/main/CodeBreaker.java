/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.dae.main;

import java.util.Iterator;

/**
 *
 * @author frank.castrillon
 */
public class CodeBreaker {

    private String code;
     
    public CodeBreaker(String code){
        this.code = code;
    }
    
    public String verifyNumber(String number){
        String result = "";
        String result_ = "";
        if(!number.matches("[0-9]+") || number.length()!= 4){
            return "";
        }
        int max = this.code.length();
        for (int i = 0; i < max; i++) {
            char chartNumber = number.charAt(i);
            for (int j = i+1; j < max; j++) {
                if (chartNumber==number.charAt(j)) {
                    return "";
                }
            }
            if(this.code.indexOf(chartNumber) != -1){
                if(chartNumber == this.code.charAt(i)){
                    result += "X";
                }else{
                    result_ += "-";
                }  
            }
        }
        return result+result_;
    }
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
