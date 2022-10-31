/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truth.table;

/**
 *
 * @author BEBO
 */
public class TruthTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        
        boolean p, q;
        System.out.println("P\tQ\tPANDQ\tPORQ\tPXORQ\tNOTP"); 
        p = true; q = true; 
        System.out.print(p + "\t" + q +"\t"); 
        System.out.print((p&q) + "\t" + (p|q) + "\t"); 
        System.out.println((p^q) + "\t" + (!p));
        p = true; q = false; 
        System.out.print(p + "\t" + q +"\t"); 
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p)); 
        p = false; q = true; 
        System.out.print(p + "\t" + q +"\t"); 
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        p = false; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }
    
}
