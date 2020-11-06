

public class GerenciadoraCliente{
    protected int id;
    protected String nome;
    protected String endereco;
    
    private DAOCliente DAOCliente = new DAOCliente();


    public int inserir(Cliente cliente){
        this.id = cliente.id;
        this.nome = cliente.nome;
        this.endereco = cliente.endereco;
        
        return 1;
        
    }

    public int getId(){
        return this.id;
    }


    public Boolean remover(Cliente cliente){
        if(cliente)
           return this.DAOCliente.delete(cliente);
        return false;

    }

}