package com.tetras;

//Safetycar utilise un pattern de singleton parce qu'il ne peut y en avoir qu'une seule d'instanciée.

public class Safetycar {
    
    private SafetyCar (){}

    private static SafetyCar instance = new SafetyCar();

    public static SafetyCar getInstance() {
        return instance;
    }
}