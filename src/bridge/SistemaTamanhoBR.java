package bridge;

public class SistemaTamanhoBR implements TamanhoRoupa {

    @Override
    public String getTamanho(String tamanho) {
        switch (tamanho) {
            case "P":
                return "Pequeno";
            case "M":
                return "Médio";
            case "G":
                return "Grande";
            default:
                return "Tamanho desconhecido";
        }
    }
}
