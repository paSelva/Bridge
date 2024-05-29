package bridge;

public class Bermuda extends Roupa {

    public Bermuda(TamanhoRoupa tamanhoRoupa) {
        super(tamanhoRoupa);
    }

    @Override
    public void exibirTamanho(String tamanho) {
        System.out.println("Tamanho da Bermuda: " + tamanhoRoupa.getTamanho(tamanho));
    }
}
