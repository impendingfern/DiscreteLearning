/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlearning;

import java.util.ArrayList;

/**
 *
 * @author noe
 */
public class Dlearning {

    public static void main(String[] args) {
        Subject s1 = new Subject("Basics");
        
         s1.setDef("Es todo lo basico antes de aprender relaciones");
         s1.setDef("Antes de aprender Relaciones, debes aprender teoria de conjuntos");
         
         s1.teach();
        
    }
       
 }
    

