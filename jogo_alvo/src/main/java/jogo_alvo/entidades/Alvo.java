package jogo_alvo.entidades;

public abstract class Alvo {

    private Integer quantADestruir = 3;
    private Integer posX;
    private Integer posY;

    public Alvo(Integer posX, Integer posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Integer getQuantADestruir() {
        return quantADestruir;
    }

    public void setQuantADestruir(Integer quantADestruir) {
        this.quantADestruir = quantADestruir;
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
        return this.posX == outro.getPosX() && this.posY == outro.getPosY();
    }

    @Override
    public String toString() {
        return "Alvo na posição (" + posX + ", " + posY + ") ";
    }

    public abstract boolean acerta(int posX, int posY);
}
