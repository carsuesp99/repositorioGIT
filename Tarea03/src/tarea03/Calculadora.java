/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 *
 * @author Tarea 03
 */
public class Calculadora {
    private int num1;
    private int num2;
    
    public Calculadora(int a, int b){
        num1 = a;
        num2 = b;
    }
    public int suma(){
        int resul = num1 + num2;
        return resul;
    }
    public int resta(){

      int resul;

      if (resta2())

            resul = num1 - num2;

            else

            resul = num2 - num2;              
      
       return resul;                       
      }

public boolean resta2(){

      if (num1 >= num2)

            return true;

      else return false;

}
    public int multiplica(){
        int resul = num1 * num2;
        return resul;
    }
    public int divide(){
        int resul = num1 / num2;
        return resul;
    }
    public Integer divide2(){

      if (num2 == 0)

            return null;

      int resul = num1 / num2;

      return resul;

}
}
