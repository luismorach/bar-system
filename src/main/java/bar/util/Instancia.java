/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar.util;


import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 *
 * @author Administrador
 */
public class Instancia {
    private static   HashMap<String,Object> instancias = new HashMap<>();
    
    public static Object getInstancia(String objName){
        try{
           // verifico si existe un objeto relacionado a objName
           // en la hashMap
           Object obj = instancias.get(objName);        
           // si no existe entonces lo instancio y lo agrego
            if( obj == null ){
                String sClassname = objName;
                obj = Class.forName(sClassname).getDeclaredConstructor().newInstance();
                // agrego el objeto a la hashMap
                instancias.put(objName,obj);
            }
            System.out.println(obj);
            return obj;
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex){
           throw new RuntimeException(ex);
        }        
    } 
}
