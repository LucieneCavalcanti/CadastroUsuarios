package data;

import java.util.ArrayList;

import model.UsuarioModel;

public class UsuarioData extends Conexao implements CRUD {
    public UsuarioData() throws Exception{}

    @Override
    public boolean editar(UsuarioModel obj) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean excluir(int id) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean incluir(UsuarioModel obj) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ArrayList<UsuarioModel> listar(String pesquisa) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UsuarioModel obter(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
