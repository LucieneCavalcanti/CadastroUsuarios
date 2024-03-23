package data;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.UsuarioModel;

public class UsuarioData extends Conexao implements CRUD {
    public UsuarioData() throws Exception{}

    @Override
    public boolean editar(UsuarioModel obj) throws Exception {
        String sql="update tbusuarios set nome=?,email=?,senha=? where id=?";
        PreparedStatement ps = getCon().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getEmail());
        ps.setString(3, obj.getSenha());
        ps.setInt(4,obj.getId());
        //return (ps.executeUpdate()>0); //insert,update,delete
        //ou
        //if (ps.executeUpdate()>0) return true;
        //else return false;
        return (ps.executeUpdate()>0) ? true : false;
    }

    @Override
    public boolean excluir(int id) throws Exception {
        String sql="delete from tbusuarios where id=?";
        PreparedStatement ps = getCon().prepareStatement(sql);
        ps.setInt(1, id);
        //return (ps.executeUpdate()>0); //insert,update,delete
        //ou
        //if (ps.executeUpdate()>0) return true;
        //else return false;
        return (ps.executeUpdate()>0) ? true : false;
    }

    @Override
    public boolean incluir(UsuarioModel obj) throws Exception {
        String sql="insert into tbusuarios (nome,email,senha) values(?,?,?)";
        PreparedStatement ps = getCon().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getEmail());
        ps.setString(3, obj.getSenha());
        //return (ps.executeUpdate()>0); //insert,update,delete
        //ou
        //if (ps.executeUpdate()>0) return true;
        //else return false;
        return (ps.executeUpdate()>0) ? true : false; //if ternário
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
