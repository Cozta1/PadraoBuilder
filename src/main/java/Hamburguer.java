package main.java;

public class Hamburguer {

    private String tamanho;
    private String pao;
    private String carne;
    private String queijo;
    private String molho;
    private String vegetais;
    private boolean bacon;
    private String observacao;

    public Hamburguer() {
        this.tamanho = "";
        this.pao = "";
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getVegetais() {
        return vegetais;
    }

    public void setVegetais(String vegetais) {
        this.vegetais = vegetais;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Hamburguer{" +
                "tamanho='" + tamanho + '\'' +
                ", pao='" + pao + '\'' +
                ", carne='" + carne + '\'' +
                ", queijo='" + (queijo != null ? queijo : "sem queijo") + '\'' +
                ", molho='" + (molho != null ? molho : "sem molho") + '\'' +
                ", vegetais='" + (vegetais != null ? vegetais : "sem vegetais") + '\'' +
                ", bacon=" + bacon +
                ", observacao='" + (observacao != null ? observacao : "nenhuma") + '\'' +
                '}';
    }
}
