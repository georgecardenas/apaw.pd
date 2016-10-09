package apaw.pd.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class ReferencesFactory {
    
    private Map<String, Integer> references;
    
    private int reference;
    
    private static ReferencesFactory referencesFactory;
    
    private ReferencesFactory(){
        references = new HashMap<>();
        reference = 0;
    }
    
    public static ReferencesFactory getFactory(){
        if (ReferencesFactory.referencesFactory == null ){
            ReferencesFactory.referencesFactory = new ReferencesFactory();
        }
        
        return ReferencesFactory.referencesFactory;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        references.remove(key);
    }
}
