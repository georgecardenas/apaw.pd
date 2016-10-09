package apaw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    private Map<Character, Caracter> caracteres;
    
    private static FactoriaCaracter caracterFactory;
    
    private FactoriaCaracter(){
        caracteres = new HashMap<>();
    }
    
    public static FactoriaCaracter getFactoria(){
        if (FactoriaCaracter.caracterFactory == null){
            FactoriaCaracter.caracterFactory = new FactoriaCaracter();
        }
        return FactoriaCaracter.caracterFactory;
    }
    
    public Caracter getCaracter(Character key){
        if (!caracteres.containsKey(key)){
            caracteres.put(key, new Caracter(key));
        }
        return caracteres.get(key);
    }
}
