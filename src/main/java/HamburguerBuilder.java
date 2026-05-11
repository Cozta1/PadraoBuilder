package main.java;

public class HamburguerBuilder {

    private Hamburguer hamburguer;

    public HamburguerBuilder() {
        hamburguer = new Hamburguer();
    }

    public Hamburguer build() {
        if (hamburguer.getTamanho().isEmpty()) {
            throw new IllegalArgumentException("Tamanho do hambúrguer é obrigatório");
        }
        if (hamburguer.getPao().isEmpty()) {
            throw new IllegalArgumentException("Tipo de pão é obrigatório");
        }
        return hamburguer;
    }

    public HamburguerBuilder setTamanho(String tamanho) {
        hamburguer.setTamanho(tamanho);
        return this;
    }

    public HamburguerBuilder setPao(String pao) {
        hamburguer.setPao(pao);
        return this;
    }

    public HamburguerBuilder setCarne(String carne) {
        hamburguer.setCarne(carne);
        return this;
    }

    public HamburguerBuilder setQueijo(String queijo) {
        hamburguer.setQueijo(queijo);
        return this;
    }

    public HamburguerBuilder setMolho(String molho) {
        hamburguer.setMolho(molho);
        return this;
    }

    public HamburguerBuilder setVegetais(String vegetais) {
        hamburguer.setVegetais(vegetais);
        return this;
    }

    public HamburguerBuilder setBacon(boolean bacon) {
        hamburguer.setBacon(bacon);
        return this;
    }

    public HamburguerBuilder setObservacao(String observacao) {
        hamburguer.setObservacao(observacao);
        return this;
    }
}
