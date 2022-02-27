package modelos;

/**
 *
 * @author Graziela Guimarães
 */

//Classe filha (especificação) herda da classe Pessoa
public class Usuario extends Pessoa{
    
    private String login;
    private String senhaAcesso;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }
    
    public void mostraDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereco());
    }
    
}
