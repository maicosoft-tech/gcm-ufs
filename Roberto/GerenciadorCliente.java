public class GerenciadorCliente{

    int id;
    String nome;
    
    public int inserir(Cliente cliente) {
        this.id = cliente.id;
        this.nome = cliente.nome;
    }
}