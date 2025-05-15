package jogo_alvo.entidades;

public class AltoBranco extends Alvo{

    public AltoBranco(Integer posX, Integer posY) {
        super(posX, posY);
    }

    @Override
    public boolean acerta(int posX, int posY) {
        if (getPosX() == posX && getPosY() == posY) {
            setQuantADestuir(getQuantADestuir() + 1);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ALVO BRANCO na posição (" + getPosX() + ", " + getPosY() + ") ";
    }
}
