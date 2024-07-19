/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodni_nie;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class EjercicioDNI_NIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Object tipoDocumento = JOptionPane.showInputDialog(
                null,
                "selecciona un tipo de documento",
                "tipo de documento",
                JOptionPane.QUESTION_MESSAGE, 
                null,
                new Object [] {"Seleccionar", "DNI", "NIE"},
                "Seleccionar");
        
        if (tipoDocumento == "DNI") {     
        
        String dni =
        JOptionPane.showInputDialog(
            null,
            "escribe 8 numeros",
            "creacion del dni",
            JOptionPane.QUESTION_MESSAGE);
        
        String letra = "";
        
        int numero = Integer.parseInt(dni);
        
        if (numero > 99999999 || numero < 10000000 ) {
            JOptionPane.showMessageDialog(
                    null,
                    "no tiene 9 numeros",
                    "error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int resultado =  numero % 23;
            
            
            switch (resultado) {
                case 0:
                    letra = "T";
                    break;
                case 1:
                    letra = "R";
                    break;
                case 2:
                    letra = "W";
                    break;
                case 3:
                    letra = "A";
                    break;
                case 4:
                    letra = "G";
                    break;
                case 5:
                    letra = "M";
                    break;
                case 6:
                    letra = "Y";
                    break;
                case 7:
                    letra = "F";
                    break;
                case 8:
                    letra = "P";
                    break;
                case 9:
                    letra = "D";
                    break;
                case 10:
                    letra = "X";
                    break;
                case 11:
                    letra = "B";
                    break;
                case 12:
                    letra = "N";
                    break;
                case 13:
                    letra = "J";
                    break;
                case 14:
                    letra = "Z";
                    break;
                case 15:
                    letra = "S";
                    break;
                case 16:
                    letra = "Q";
                    break;
                case 17:
                    letra = "V";
                    break;
                case 18:
                    letra = "H";
                    break;
                case 19:
                    letra = "L";
                    break;
                case 20:
                    letra = "C";
                    break;
                case 21:
                    letra = "K";
                    break;
                case 22:
                    letra = "E";
                    break;
                default:
                    JOptionPane.showMessageDialog( null, "error");
            }
             
        }
        
        JOptionPane.showMessageDialog(
                    null,
                    "tu dni es: " + numero + letra,
                    "dni",
                    JOptionPane.INFORMATION_MESSAGE);  
        
        } else if (tipoDocumento == "NIE" ) {
            
            Object letra1 = JOptionPane.showInputDialog(
                null,
                "selecciona la letra",
                "letra incial",
                JOptionPane.QUESTION_MESSAGE, 
                null,
                new Object [] {"Seleccionar", "X", "Y", "Z"},
                "Seleccionar");
            
             String letraInicial = "";
            
           if (letra1 == "X"){
               letraInicial = "0";
           }else if (letra1 == "Y"){
               letraInicial = "1";
           }else if (letra1 == "Z"){
               letraInicial = "2";
           }
           
           
            String nie =
        JOptionPane.showInputDialog(
            null,
            "escribe 7 numeros",
            "creacion del nie",
            JOptionPane.QUESTION_MESSAGE);
        
        String letra2 = "";
       
        
        int numero = Integer.parseInt(nie);
        int digitos = Integer.parseInt(letraInicial + numero);
        
        if (numero > 9999999 || numero < 1000000 ) {
            JOptionPane.showMessageDialog(
                    null,
                    "no tiene 7 numeros",
                    "error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int resultado =  digitos % 23;
            
            switch (resultado) {
                case 0:
                    letra2 = "T";
                    break;
                case 1:
                    letra2 = "R";
                    break;
                case 2:
                    letra2 = "W";
                    break;
                case 3:
                    letra2 = "A";
                    break;
                case 4:
                    letra2 = "G";
                    break;
                case 5:
                    letra2 = "M";
                    break;
                case 6:
                    letra2 = "Y";
                    break;
                case 7:
                    letra2 = "F";
                    break;
                case 8:
                    letra2 = "P";
                    break;
                case 9:
                    letra2 = "D";
                    break;
                case 10:
                    letra2 = "X";
                    break;
                case 11:
                    letra2 = "B";
                    break;
                case 12:
                    letra2 = "N";
                    break;
                case 13:
                    letra2 = "J";
                    break;
                case 14:
                    letra2 = "Z";
                    break;
                case 15:
                    letra2 = "S";
                    break;
                case 16:
                    letra2 = "Q";
                    break;
                case 17:
                    letra2 = "V";
                    break;
                case 18:
                    letra2 = "H";
                    break;
                case 19:
                    letra2 = "L";
                    break;
                case 20:
                    letra2 = "C";
                    break;
                case 21:
                    letra2 = "K";
                    break;
                case 22:
                    letra2 = "E";
                    break;
                default:
                    JOptionPane.showMessageDialog( null, "error");
            }
             
        }
        
        JOptionPane.showMessageDialog(
                    null,
                    "tu nie es: " + letra1 + numero + letra2,
                    "nie",
                    JOptionPane.INFORMATION_MESSAGE);  
            
        }
                
        
    }//final main
    
}//final clase
