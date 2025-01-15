package comunicacion;

public class Alfabeto extends Pictograma {
    
    private String[] letras;

    public Alfabeto(String origen, String[] letras) {
        super(origen);
        this.letras = letras;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public Integer cantidadLetras() {
        return letras.length;
    }

    @Override
    public String interpretacion() {
        // Implementación específica para la interpretación del alfabeto
        return "Interpretación del alfabeto";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String letra : letras) {
            sb.append(letra).append(" ");
        }
        return sb.toString().trim();
    }
}
