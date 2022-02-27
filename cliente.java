package modelos;

/**
 *
 * @author Graziela Guimarães
 */

//Herda de pessoa
public class Cliente extends Pessoa {
    
    private boolean statusCliente;

    public boolean isStatusCliente() {
        return statusCliente;
    }

    public void setStatusCliente(boolean statusCliente) {
        this.statusCliente = statusCliente;
    }
    
    
    
}
