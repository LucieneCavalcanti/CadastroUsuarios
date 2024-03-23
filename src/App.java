import java.util.ArrayList;
import java.util.Scanner;

import model.UsuarioModel;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        UsuarioModel obj = new UsuarioModel();
        ArrayList<UsuarioModel> listaUsuarios = new ArrayList<>();
        int opcao=0;
        do {
            try {
                System.out.println("Digite uma opção:");
                System.out.println("1 - Cadastrar usuário"+
                "\n2 - Editar Usuário"+
                "\n3 - Excluir Usuário"+
                "\n4 - Listar Todos"+
                "\n5 - Pesquisar"+
                "\n10 - Sair");
                opcao = ler.nextInt();
                switch (opcao) {
                    case 1:
                        obj = new UsuarioModel();    
                        System.out.println("Digite o nome:");
                        obj.setNome(ler.next());
                        System.out.println("Digite o e-mail:");
                        obj.setEmail(ler.next());
                        System.out.println("Digite a senha:");
                        obj.setSenha(ler.next());
                        listaUsuarios.add(obj);
                        break;
                    case 2:
                        //listar todos
                        //perguntar o id
                        //mostrar os dados
                        //editar
                        break;
                    case 3:
                        //listar todos
                        //perguntar o id
                        //excluir
                        break;
                    case 4:
                        System.out.println("--------- LISTAGEM -----------");
                        for (UsuarioModel user : listaUsuarios) {
                            System.out.println(user.getId() + "-" + user.getNome());
                            System.out.println(user.getEmail());
                        }
                        break;
                    case 5:
                        //perguntar a pesquisa
                        //listar
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        } while (opcao!=10);
    }
}
