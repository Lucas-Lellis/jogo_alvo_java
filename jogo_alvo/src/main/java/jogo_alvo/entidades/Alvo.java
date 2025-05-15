package jogo_alvo.entidades;

public abstract class Alvo {

    private static Integer quantADestuir = 3;
    private Integer posX = 0;
    private Integer posY = 0;

    public Alvo(Integer posX, Integer posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public static Integer getQuantADestuir() {
        return quantADestuir;
    }

    public static void setQuantADestuir(Integer quantADestuir) {
        Alvo.quantADestuir = quantADestuir;
    }

    public Integer getPosX() {
        return posX;
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    public boolean igual(Alvo outro) {
        return this.posX == outro.getPosX() && this.posY == outro.posY;
    }

    @Override
    public String toString() {
        return "Alvos na posição (" + posX + ", " + posY + ") ";
    }

    public abstract boolean acerta(int posX, int posY);
}
