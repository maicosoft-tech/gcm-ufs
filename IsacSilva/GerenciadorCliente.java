public class GerenciadorCliente {
    
   private String nome;
   
   private String cpf;
   // Codigo do Produto.
   private int cod;
    
   
   public GerenciadorCliente(){
   
   
   }
   
   public String getNome(){
   
   return nome;
   }
   
   public void setNome(String name){
   
   this.nome = name;
   }
   
   public String getCpf(){
   
   return cpf;
   }
   
   public void setCpf(String cpf ){
   
   this.cpf = cpf;
   }
   // Metodo para exibir as infromações armazenadas nos atributos da classe.
	public void exibirCliente(){
		System.out.println("Nome: "+getNome()+"\nCPF: "+getCpf()+"\nCodigo do Produto: "+getCod());
	}
   
   public String getCod(){
   
   return cod;
   }
   
   public void setCod(String cod){
   
   this.cod = cod;
   } 
   
}