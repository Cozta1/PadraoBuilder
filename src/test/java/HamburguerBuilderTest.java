package test.java;

import org.junit.jupiter.api.Test;
import main.java.Hamburguer;
import main.java.HamburguerBuilder;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerBuilderTest {

    @Test
    void deveRetornarExcecaoParaHamburguerSemTamanho() {
        try {
            Hamburguer hamburguer = new HamburguerBuilder()
                    .setPao("Brioche")
                    .setCarne("Angus 180g")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tamanho do hambúrguer é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHamburguerSemPao() {
        try {
            Hamburguer hamburguer = new HamburguerBuilder()
                    .setTamanho("Duplo")
                    .setCarne("Angus 180g")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de pão é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarHamburguerValido() {
        Hamburguer hamburguer = new HamburguerBuilder()
                .setTamanho("Duplo")
                .setPao("Brioche")
                .setCarne("Angus 180g")
                .build();

        assertNotNull(hamburguer);
    }
}
