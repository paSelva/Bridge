package bridge;

public class Jaqueta extends Roupa {
    public Jaqueta(TamanhoRoupa tamanhoRoupa) {
        super(tamanhoRoupa);
    }

    @Override
    public void exibirTamanho(String tamanho) {
        System.out.println("Tamanho da Jaqueta: " + tamanhoRoupa.getTamanho(tamanho));
    }
}
