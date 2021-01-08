package com.tetras;

// C'est ce qui permet de liée un type de voiture avec son constructeur et donc de l'instancier
// Utilisation du design pattern Factory car cela permet d'instancier des objets dérivées (VoitureType.java) à une interface mère (VoitureDuChampionnatDeFormuleUn)

public class VoitureFactory {
    public static VoitureDuChampionnatDeFormuleUn getVoitureDuChampionnatDeFormuleUn (VoitureType type) {
        if (VoitureType.Mercedes.equals(type))
            return new MercedesCar();
        else if (VoitureType.Renault.equals(type))
            return new RenaultCar();
        else if (VoitureType.Ferrari.equals(type))
            return new FerrariCar();
        else
            throw new IllegalArgumentException();
    }
}