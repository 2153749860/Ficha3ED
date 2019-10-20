/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import Ex1.Ex1;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiago
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                LinkedStack teste = new LinkedStack();

        int numeroTeste = 2;

        switch (numeroTeste) {
            case 0: //teste adicionar
                teste.push(1);
                teste.push(1);
                System.out.println("Teste adicionar:\n" + teste.toString());
                break;
            case 1:
                try {
                    //teste remover array vazio
                    teste.pop();
                    break;
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ex1.class.getName()).log(Level.SEVERE, null, ex);

                }
            case 2: //remover um elemento existente no array
                teste.push(1);

                try {
                    teste.pop();
                    System.out.println(teste.toString());
                    break;
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ex1.class.getName()).log(Level.SEVERE, null, ex);
                }
            case 3:
                try {
                    //peek quando array esta vazio
                    teste.peek();
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ex1.class.getName()).log(Level.SEVERE, null, ex);
                }
            case 4: //peek quando existem elementos no array
                teste.push(33);
                teste.push(2);
                teste.push(3);
                teste.push(4);
                teste.push(5);
                System.out.println(teste.toString());
                try {
                    System.out.println(teste.peek());
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ex1.class.getName()).log(Level.SEVERE, null, ex);
                }
            case 5: 
                teste.push(1);
                try {
                    System.out.println(teste.peek());
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ex1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            case 6:
                //teste adicionar stack cheia
                teste.push(1);
                teste.push(2);
                System.out.println(teste.toString());
                
                teste.push(3);
                System.out.println(teste.toString());
        }
    
    }
}
