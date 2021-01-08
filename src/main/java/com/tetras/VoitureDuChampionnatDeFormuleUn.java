package com.tetras;

// VoitureDuChampionnatDeFormuleUn est l'interface qui va initialiser les 3 types de voiture 
//avec les 4 méthodes qui sont freiner tourner accélerer et getColor

public interface VoitureDuChampionnatDeFormuleUn {
	public void tourner();
    public void freiner();
    public void accelerer();
	public String getColor();
}