package modelos

/**
 *
 * @author Graziela Guimarães
 */

public class ModificadoresDeAcesso {
    
    // Visível a todas as classes
    public String publico;

    // Visível a classes do mesmo pacote
    protected String protegido;

    // Visível apenas pela própria classe
    private String privado;

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    public String getProtegido() {
        return protegido;
    }

    public void setProtegido(String protegido) {
        this.protegido = protegido;
    }

    public String getPrivado() {
        return privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }
    
    
    
}
