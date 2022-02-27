package controles;


import modelos.Cliente;
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
        
        /*******Utilizando polimorfismo com a classe Usuário********/
        usuario.polimorfismo();        
        
        
        
        
        /*******************Intância de cliente*****************************/
        Cliente cliente = new Cliente();
        
        //Atributos herdados da classe mãe
        cliente.setId(1);
        cliente.setNome("Maria de Souza");
        cliente.setTelefone("1111-0000");
        cliente.setEmail("maria@exemplo.com");
        cliente.setEndereco("Rua das Marias, 001");
        
        //Atributos específicos da classe filha
        cliente.setStatusCliente(true);
        
        System.out.println("\n/********Mostrando os dados de cliente no console*******\n");
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Telefone do cliente: " + cliente.getTelefone());
        System.out.println("Email do cliente: " + cliente.getEmail());
        System.out.println("Endereço do cliente: " + cliente.getEndereco());
        System.out.println("ID do cliente: " + cliente.getId());
        
        System.out.println("Status do cliente: " + cliente.isStatusCliente());
        
        //Mostrando mensagem através do resultado do status do cliente
        if(cliente.isStatusCliente() == true){
            System.out.println("Status do cliente atualizado: Ativo" );
        }else{
            System.out.println("Status do cliente atualizado: Inativo" );
        }
        
        
        /*******Utilizando polimorfismo com a classe Cliente********/
        cliente.polimorfismo();
        
    }
    
}
