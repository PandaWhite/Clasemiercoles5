package pila;

import java.util.Stack;

/**
 *
 * @author Alumno
 */
public class Ejes {
    
    public void eje1(){
   Stack pila= new Stack();
    
       pila.push("The Elder Scrolls:Daggerfall");
       pila.push("UnrealTournament");
       pila.push("The Elder Scrolls:Morrowind");
       pila.push("League of legends");
       pila.push("Doom");
       pila.push("Terraria");
              
      System.out.println("pila:"+pila);
      System.out.println("Tamaño pila:"+pila.size());
      System.out.println("Cima:"+pila.peek());
      System.out.println("buscar:"+pila.search("The Elder Scrolls:Daggerfall"));
      System.out.println("buscar:"+pila.search("hack"));
      System.out.println("Des-apilado:"+pila.pop());
      System.out.println("Des-apilado:"+pila.pop());
      System.out.println("¿Está la pila vacía?:"+pila.empty());
    
    }
      public void eje2(){
          
          Stack Nota = new Stack();
          
          Nota.push(7);
          Nota.push(6);
          Nota.push(4);
          Nota.push(2);
          Nota.push(5);
          
         for(int a=0; a<Nota.size(); a++)
         {
             System.out.println(Nota.get(a));
         }
      } 
      
      public void eje3(){
      
          Stack dart = new Stack();
          
          dart.push("Demonio");
          dart.push("Cartucho");
          dart.push("Carton");
          dart.push("Hielo");
          dart.push("Hueso");
          
          for(Object i:dart){
              System.out.println(i);
          }
      }          
          public void eje4(){
       
              Stack Libros= new Stack();
              
              Libros.push("Angeles y Demonios");
              Libros.push("Hombre Duplicado");
              Libros.push("Altar al hombre caido");
              Libros.push("Perfecta Seduccion");
              Libros.push("Entre otras Adicciones"); 
              
              System.out.println("Cantidad de pilas: "+Libros.size());
              
              while (!Libros.empty()){
                  System.out.println(Libros.pop());
              }
          }
}

