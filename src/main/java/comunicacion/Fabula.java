package comunicacion;

public class Fabula extends Escrito {
    
    private String ensenanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanzas() {
        return ensenanzas;
    }

    public void setEnsenanzas(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 1;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" +
               getTitulo() + "\n" +
               getAutor() + "\n" +
               getPaginas() + "\n" +
               ensenanzas;
    }
}
