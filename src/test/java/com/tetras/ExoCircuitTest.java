package com.tetras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExoCircuitTest {

    @Test
    public void MercedesTest() {
        VoitureDuChampionnatDeFormuleUn mercedesTest = VoitureFactory.getVoitureDuChampionnatDeFormuleUn(VoitureType.Mercedes);
        assertEquals("Noir", mercedesTest.getColor());
    }

    @Test
    public void FerrariTest() {
        VoitureDuChampionnatDeFormuleUn ferrariTest = VoitureFactory.getVoitureDuChampionnatDeFormuleUn(VoitureType.Ferrari);
        assertEquals("Rouge", ferrariTest.getColor());
    }

    @Test
    public void RenaultTest() {
        VoitureDuChampionnatDeFormuleUn renaultTest = VoitureFactory.getVoitureDuChampionnatDeFormuleUn(VoitureType.Renault);
        assertEquals("Bleu", renaultTest.getColor());
    }

    @Test
    void SingletonTest() {
        SafetyCar safetyCar1 = SafetyCar.getInstance();
        SafetyCar safetyCar2 = SafetyCar.getInstance();
        assertEquals(safetyCar1, safetyCar2);
    }
}