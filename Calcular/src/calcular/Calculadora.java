package calcular;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class Calculadora {
    
    
    public float suma(float N1,float N2){
        float result=0;
        
        if(N1>=0 &&N2>=N2){
            result=N1+N2;
       
        }else{
            System.out.println("INGRESA VALORES POSTIVOS");
        }
        return result; 
    }
    
     public float Resta(float N1,float N2){
        float result=0;
        
        if(N1>=0 &&N2>=N2){
            result=N1-N2; 
        }else{
            System.out.println("INGRESA VALORES POSTIVOS");
        }
        return result; 
    }
     
         public float Multi(float N1,float N2){
        float result=0;
        
        if(N1>=0 &&N2>=N2){
            result=N1*N2; 
            
        }else{
            System.out.println("INGRESA VALORES POSTIVOS");
        }
        
        return result; 
    }
         
         
        public float Division(float N1,float N2){
        float result=0;
        
        if(N1>=0 &&N2>=N2){
            result=N1/N2; 
        }else{
            System.out.println("INGRESA VALORES POSTIVOS");
        }
        return result; 
    }
     
     
    
}
