package comunicacion;

public class Fabula extends Escrito {
    
    private String enseñanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.enseñanzas = enseñanzas;
        this.interpretacion = interpretacion;
    }

    public String getEnseñanzas() {
        return enseñanzas;
    }

    public void setEnseñanzas(String enseñanzas) {
        this.enseñanzas = enseñanzas;
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
               enseñanzas;
    }
}
