package controles;

import modelos.Usuario;

/**
 *
 * @author Graziela Guimarães
 */
public class ClasseController {
    
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario();
        
        //Atributos herdados da classe mãe
        usuario.setId(1);
        usuario.setNome("Graziela Guimarães");
        usuario.setTelefone("0000-0000");
        usuario.setEmail("graziela@exemplo.com");
        usuario.setEndereco("Rua tal tal, número 000");
        
        //Atributos específicos da classe filha
        usuario.setLogin("admin");
        usuario.setSenhaAcesso("123");
        
        //Chama o métodos que lista no console o contéudo dos atributos de usuario
        usuario.mostraDados();
        
    }
    
}
