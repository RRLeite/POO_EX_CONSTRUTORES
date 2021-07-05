/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Data.Data;

/**
 *
 * @author roberto.leite
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       //Data data1 = new Data(31,7,1993);
       
       Data data2 = new Data(31, "Julho", 1993);
       
       //data1.mostraData1(data1.getDia(), data1.getMes(), data1.getAno());
       
       data2.mostrData2(data2.getMesTexto(), data2.getDia(), data2.getAno());
       
    }
    
}
