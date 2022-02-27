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


     //Utiliza-se a notação @override
    @Override
    public void polimorfismo(){
        
        //Mostrará a mensagem que está na classe pessoa
        super.polimorfismo(); //classe mãe
        System.out.println("Esta é a mensagem da classe filha cliente, utilizando polimorfismo.");
    }
    
    
    
}
