/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitday2;

/**
 *
 * @author Mazen Mohamed
 */
public class Calc implements Calculator{
    /*start Mazen */
    @Override
    public double sum(double n1, double n2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double sub(double n1, double n2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*end mazen*/
    
    /*start Ahmed*/
    @Override
    public double multi(double n1, double n2) {
        
        return n1 * n2;
    }

    @Override
    public double div(double n1, double n2) {
        if(n2 != 0)
        {
            return n1 / n2;
        }
        return 0;
    }
    /*end Ahmed*/
}
