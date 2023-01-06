/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorial;
import javax.swing.JOptionPane;
/**
 *
 * @author ascom
 */
public class Factorial {

    public static void main(String[] args) {
 String intString = JOptionPane.showInputDialog("Please enter a non-negative integer:");
int n = Integer.parseInt(intString);
 JOptionPane.showMessageDialog(null, "factorial of "+n+"is"+factorial(n));
 }
public static long factorial(int n) {
if (n == 0) 
return 1;
else
return n * factorial(n - 1); 
}
}