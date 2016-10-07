package apaw.pd.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class ReferencesFactory {
    
    private Map<String, Integer> references;
    
    private int reference;
    
    private static ReferencesFactory referencesFactory;
    
    public ReferencesFactory(){
        references = new HashMap<String, Integer>();
        reference = 0;
    }
    
    public static ReferencesFactory getFactory(){
        if (ReferencesFactory.referencesFactory == null ){
            ReferencesFactory.referencesFactory = new ReferencesFactory();
        }
        
        return ReferencesFactory.referencesFactory;
    }

    public int getReference(String string) {
        if (!references.containsKey(string)){
            references.put(string, reference);
            reference++;
        }
        return references.get(string);
    }

    public void removeReference(String string) {
        references.remove(string);
    }
}
