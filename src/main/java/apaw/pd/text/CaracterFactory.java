package apaw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {
    private Map<Character, Caracter> caracteres;
    
    private static CaracterFactory caracterFactory;
    
    private CaracterFactory(){
        caracteres = new HashMap<>();
    }
    
    public CaracterFactory getCaracterFactory(){
        if (CaracterFactory.caracterFactory == null){
            CaracterFactory.caracterFactory = new CaracterFactory();
        }
        return CaracterFactory.caracterFactory;
    }
    
    public Caracter getCaracter(Character key){
        return caracteres.get(key);
    }
}
