package data;
public class TesteConexao{
    public static void main(String args[]){
        try{
            System.out.println("Tentando conexão...");
            Conexao teste = new Conexao();
            System.out.println("Deu certooooooo");
        }catch(Exception erro){
            System.out.println("Losseeeeeeeeeeerrrrr");
            System.out.println(erro.getMessage());
        }
    }
}