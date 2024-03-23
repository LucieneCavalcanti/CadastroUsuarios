package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        String sql="select * from tbusuarios where nome like '"+pesquisa+"%' or email like '"+pesquisa+"%' order by nome";
        //ou
        //String sql="select * from tbusuarios where nome like ? order by nome";
        PreparedStatement ps = getCon().prepareStatement(sql);
        //ps.setString(1, pesquisa+"%");
        ResultSet rs = ps.executeQuery();
        ArrayList<UsuarioModel> lista = new ArrayList<>();
        while(rs.next()){
            UsuarioModel obj = new UsuarioModel(rs.getInt("id"), rs.getString("nome"), rs.getString("email"), rs.getString("senha"));
            lista.add(obj);
            //ou
            //lista.add(new UsuarioModel(rs.getInt("id"), rs.getString("nome"), rs.getString("email"), rs.getString("senha")));
        }
        return lista;
    }

    @Override
    public UsuarioModel obter(int id) throws Exception {
        String sql = "Select * from tbusuarios where id=?";
        PreparedStatement ps = getCon().prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        UsuarioModel obj = null;
        if (rs.next()){
            obj = new UsuarioModel(rs.getInt("id"),rs.getString("nome"),rs.getString("email"),rs.getString("senha") );
            //ou
            // obj = new UsuarioModel();
            // obj.setId(rs.getInt("id"));
            // obj.setNome(rs.getString("nome"));
            // obj.setEmail(rs.getString("email"));
            // obj.setSenha(rs.getString("senha"));
        }
        return obj;
    }

}
