/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CodeComplexityCalculator;

/**
 *
 * @author Imali
 */
public class ClassInfo {
    
    String name;
    int numDirectInheritance;
    int numIndirectInheritance;
    int total;
    
    public ClassInfo(String name,int numDirectInheritance, int numIndirectInheritanc, int total){
        this.name= name;
        this.numDirectInheritance= numDirectInheritance;
        this.numIndirectInheritance = numIndirectInheritance;
        this.total = total;
    }
    
}
