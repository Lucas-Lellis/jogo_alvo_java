package jogo_alvo.entidades;

public class AlvoPreto extends Alvo{

    public AlvoPreto(Integer posX, Integer posY) {
        super(posX, posY);
    }

    @Override
    public boolean acerta(int posX, int posY) {
        if (getPosX() == posX && getPosY() == posY) {
            setQuantADestruir(getQuantADestruir() - 1);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ALVO PRETO na posição (" + getPosY() + ", " + getPosX() + ") ";
    }
}
