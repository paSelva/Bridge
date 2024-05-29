package bridge;

public class Camisa extends Roupa {
    public Camisa(TamanhoRoupa tamanhoRoupa) {
        super(tamanhoRoupa);
    }

    @Override
    public void exibirTamanho(String tamanho) {
        System.out.println("Tamanho da Camisa: " + tamanhoRoupa.getTamanho(tamanho));
    }
}
