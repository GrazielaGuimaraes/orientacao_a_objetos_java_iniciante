package modelos;

/**
 *
 * @author Graziela Guimarães
 */


//Classe genérica (mãe)
public class Pessoa {
    
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

     public void polimorfismo(){
    
        System.out.println("As classes filhas herdarão este método, porém, seu conteúdo interno poderá ser alterado.");
    
    }
    
 
    
}
