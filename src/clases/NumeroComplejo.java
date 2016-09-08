/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;



/**
 *
 * @author Herrera
 */
public class NumeroComplejo {
    
    private double real;
    private double img;
    
    public NumeroComplejo (){
      real = 0.0;
      img = 0.0;
    
    }
    

     public NumeroComplejo (double real, double im){ 
    
         this.real = real;
         img = im;
        
        }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public NumeroComplejo suma(NumeroComplejo sumando){
        NumeroComplejo resultado;
        resultado = new NumeroComplejo();         
        resultado.setReal(this.real + sumando.getReal() );         
        resultado.setImg(this.img + sumando.getImg());      
        return resultado;
    
}
  public NumeroComplejo resta (NumeroComplejo resta){
        NumeroComplejo resultado;
        resultado = new NumeroComplejo();         
        resultado.setReal(this.real - resta.getReal() );         
        resultado.setImg(this.img - resta.getImg());         
        return resultado;
  }
 

  
}
