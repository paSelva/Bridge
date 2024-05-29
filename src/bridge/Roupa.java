package bridge;

public abstract class Roupa{

    protected TamanhoRoupa tamanhoRoupa;

    public Roupa(TamanhoRoupa tamanhoRoupa) {
        this.tamanhoRoupa = tamanhoRoupa;
    }

    public abstract void exibirTamanho(String tamanho);

}
