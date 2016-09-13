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
    
    private int real;
    private int imag;
    
     public NumeroComplejo(int real, int imag) {
        this.real = real;
        this.imag= imag;
        
    }
    

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    
    public NumeroComplejo sumar (NumeroComplejo C2) {
          NumeroComplejo R;
              int r, i;
        
        r = this.real + C2.real;
        i = this.imag + C2.imag;
           R = new NumeroComplejo(r, i);
              return R;
        
    }
    
      public NumeroComplejo restar(NumeroComplejo c2)  {
        NumeroComplejo R;
        int r, i;

        r = this.real - c2.real;
        i= this.imag - c2.imag;

        R = new NumeroComplejo(r, i);
            return R;

    }
       
        public NumeroComplejo multiplicar (NumeroComplejo c2) {
           NumeroComplejo R;
            int r,i;
           
            r =(this.real * c2.real) - (this.imag * c2.imag);
            i = (this.imag * c2.real) + (this.real * c2.imag);
            
            R = new NumeroComplejo (r,i);
            return R;
    }

        
}

  



    
  

