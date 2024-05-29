package bridge;

public class SistemaTamanhoUS implements TamanhoRoupa {
    @Override
    public String getTamanho(String tamanho) {
        switch (tamanho) {
            case "S":
                return "Small";
            case "M":
                return "Medium";
            case "L":
                return "Large";
            default:
                return "Unknown size";
        }
    }
}
