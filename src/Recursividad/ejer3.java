/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author hernan
 */
public class ejer3 {
    
    public int arreglo[] = new int[5];
    public int valor;
    public int arregloAux[] = new int [5];
    
    public static int exp,contador;
    
    public void cargarArreglo()
    {
        for (int i = 0; i < 5; i++) {
           
            valor  = (int)(Math.random()*10);
            arreglo[i]=valor;
            System.out.println(arreglo[i]);
            
        }
        System.out.println();
    }
    
    
    
    
    
    public void ordenar(int x)
    {
       if (x==4)
       {
           arregloAux[4]= arreglo[4];
       }
       else
       {
           
           
       }
    }
    
    //ejer 3
    public int SumaN (int n)
    {
        if(n==0)
        {
            return 0;
            
        }
        else
        {
            return n+SumaN(n-1);
        }
    }
    
    
    //ejercicio 4
    public int sumaPar(int n)
    {
        if(n==2)
        {
            return 2;
        }
        else
        {
            if(n%2==0)
            {
                return n+sumaPar(n-1);
            }
            else
            {
                return 0 + sumaPar(n-1);
            }
        }
    }
    
    //ejer 5
    public static String NumBinario(int n)
    {
        
        
        if(n==1)
        {
            return String.valueOf(n);
        }
        else
        {
            return NumBinario(n/2)+String.valueOf(n%2);
        }
    }
    
    //ejer 6
    public static int BinarioDecimal(double num)
    {
     
       exp = exp +1; 
        
     if (num<=0)
     {
         return 0;
     }
     else
     {
        return (int) (num%10 * Math.pow(2, exp) + BinarioDecimal((num-(num%10))/10));
         }
     }
     
   // ejer 7
    public static int SumaArreglo (int num[])
    {
        contador++;
        
        if(contador == num.length)
        {
            return 0;
        }
        else
        {
            return num[contador] + SumaArreglo(num);
        }
        
    }
        
    public static void main(String[] args) {
        System.out.println(NumBinario(16));
        System.out.println(BinarioDecimal(10000));
        
        int arreglo[] = {2,3};
        System.out.println(SumaArreglo(arreglo));
        
        
    }
    
    
    
    
}
