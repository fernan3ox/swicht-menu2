/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swicht.menu2;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernandito
 */
public class SwichtMenu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de opciones \n1 opcion1 \n2 opcion2 \n3 opcion3"));
    
        switch (opcion){
            case 1: JOptionPane.showMessageDialog(null, "Elegiste la opcion 1");
                break;
            case 2:JOptionPane.showMessageDialog(null, "Elegiste la opcion 2");
                break;
            case 3:JOptionPane.showMessageDialog(null, "Elegiste la opcion 3");
                break;
            default : JOptionPane.showMessageDialog(null, "Esa opcion no es valida");
            break;
            
             
        }
    
    
    
    }   

    
}
