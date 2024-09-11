package parcial.puntoColasYPilas;

import javax.swing.JOptionPane;

import bryan_estructuras.stack.list.Stack;

public class Palindromo {
    
    public static void esPalindromo(){
        Stack<Character> caracteres = new Stack<>();
        boolean condition = true;
        while (condition) {
            String palabra = JOptionPane.showInputDialog("Ingrese la palabra: ");
            if (palabra == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return;
            }else if (palabra.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: No se ingresó ninguna palabra.");
                continue; 
            }
            if(palabra.contains(" ")){
                JOptionPane.showMessageDialog(null, "Debe ingresar solo una palabra.");
                continue;
            }else{
                char[] arrrayChar = palabra.toCharArray();
                for (int ii = 0; ii < arrrayChar.length; ii++) {
                    caracteres.push(arrrayChar[ii]);
                }
                boolean palindromo = true;
                for (int ii = 0; ii < palabra.length(); ii++) {
                    if(palabra.charAt(ii) == caracteres.pop()){
                        palindromo = true;
                    }else{
                        palindromo = false;
                        break;
                    }
                }
                if(palindromo){
                    JOptionPane.showMessageDialog(null, "La palabara es un palindromo.");
                }else{
                    JOptionPane.showMessageDialog(null, "No es un palindromo.");
                }
            }
        }
        
    }
}
