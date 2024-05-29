package bridge;

public class Main {

    public static void main(String[] args) {
        Roupa roupa = new Camisa(new SistemaTamanhoBR());
        roupa.exibirTamanho("M");

        Roupa roupa2 = new Jaqueta(new SistemaTamanhoBR());
        roupa2.exibirTamanho("P");

        Roupa roupa3 = new Bermuda(new SistemaTamanhoBR());
        roupa3.exibirTamanho("G");

        Roupa roupa4 = new Camisa(new SistemaTamanhoUS());
        roupa4.exibirTamanho("S");

        Roupa roupa5 = new Jaqueta(new SistemaTamanhoUS());
        roupa5.exibirTamanho("M");

        Roupa roupa6 = new Bermuda(new SistemaTamanhoUS());
        roupa6.exibirTamanho("L");
    }
}
