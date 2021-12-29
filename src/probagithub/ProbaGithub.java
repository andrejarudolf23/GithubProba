/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probagithub;

/**
 *
 * @author andre
 */
public class ProbaGithub {

    /**
     * @param args the command line arguments
     */
    
    public static int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
    
    public static void main(String[] args) {
        var first = 23;
        var second = 23;
        
        var total = add(first, second);
        
        System.out.println("Ovo je samo proba za github");
        System.out.println("Prvi broj: " + first);
        System.out.println("Drugi broj: " + second);
        System.out.println("Zbir je: " + total);
    }
    
}
