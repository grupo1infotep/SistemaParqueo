package Controllers;
import Models.UsuariosModel;
import java.sql.*;
import java.util.*;


public class UsuariosController {
    
//GlobalVariables
    ConnectionController connectionController = new ConnectionController();
    PreparedStatement  preparedStatement;
    ResultSet resultSet;
//GlobalVariables
    
  
//<Insert 
    public boolean InsertUsuario(UsuariosModel usuariosModel){
                        
        try {
            PreparedStatement preparedStatement = connectionController.Conectar().prepareStatement(
                "insert into usuarios (id_usuario,primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,documento,usuario,contrasena,tipo_usuario,status,creado,modificado,eliminado) values ("
                + "uuid(),?,?,?,?,?,?,?,?,?,now(),now(),?)"
            );
            
            
            preparedStatement.setString(1, usuariosModel.getPrimerNombre());
            preparedStatement.setString(2, usuariosModel.getSegundoNombre());
            preparedStatement.setString(3, usuariosModel.getPrimerApellido());
            preparedStatement.setString(4, usuariosModel.getSegundoApellido());
            preparedStatement.setString(5, usuariosModel.getDocumento());
            preparedStatement.setString(6, usuariosModel.getUsuario());
            preparedStatement.setString(7, usuariosModel.getContrasena());
            preparedStatement.setString(8, usuariosModel.getTipoUsuario());
            preparedStatement.setString(9, usuariosModel.getStatus());
            preparedStatement.setString(10, usuariosModel.getEliminado());
            
            preparedStatement.executeUpdate();
            
            return true;
            
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
//>Insert 
    
    
//<Select
    public List<UsuariosModel> SelectUsuarios(){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement("select * from usuarios where eliminado='no'");
            return GetListFromResultSet();
        } catch(Exception e){return null;}
            
    }
    public List<UsuariosModel> SelectUsuarioById(String idUsuario){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement("select * from usuarios where id_usuario=?");
            preparedStatement.setString(1, idUsuario);
            return GetListFromResultSet();
        } catch(Exception e){return null;}
    }
    public List<UsuariosModel> SelectUsuarioByName(String nombreCompleto){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                "SELECT * FROM `usuarios` "
                    + "WHERE CONCAT(primer_nombre,segundo_nombre,primer_apellido,segundo_apellido) REGEXP ? "
                    + "or CONCAT(primer_nombre,primer_apellido) REGEXP ?"
                    + "or CONCAT(primer_nombre,segundo_apellido) REGEXP ?"
            );            
            preparedStatement.setString(1, nombreCompleto);
            preparedStatement.setString(2, nombreCompleto);
            preparedStatement.setString(3, nombreCompleto);
            return GetListFromResultSet();
        } catch(Exception e){return null;}
    }
    public List<UsuariosModel> SelectUsuarioByUsuarioAndContrasena(String usuario, String contrasena){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement("select * from usuarios where usuario=? and contrasena=?");
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, contrasena);

            return GetListFromResultSet();
        } catch(Exception e){return null;}
    }  
    private List<UsuariosModel> GetListFromResultSet(){
        try{
            resultSet = preparedStatement.executeQuery();
            
            List<UsuariosModel> UsuariosList = new ArrayList<>();
            
            while (resultSet.next()){
                UsuariosModel usuariosModel = new UsuariosModel(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getString(8),
                    resultSet.getString(9),
                    resultSet.getString(10),
                    resultSet.getString(11),
                    resultSet.getString(12),
                    resultSet.getString(13)
                );
                
                UsuariosList.add(usuariosModel);
            }
            
            return UsuariosList;
            
        } catch(Exception e){return null;}

    }
//>Select

    
//<Update
    public boolean UpdateUsuario(UsuariosModel usuariosModel){            
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "update usuarios set "
                        + "primer_nombre= ? ,"
                        + "segundo_nombre= ? ,"
                        + "primer_apellido= ? ,"
                        + "segundo_apellido= ? ,"
                        + "documento= ? ,"
                        + "usuario= ? ,"
                        + "contrasena= ? ,"
                        + "tipo_usuario= ? ,"
                        + "status= ? ,"
                        + "modificado=now()"
                    + "where id_usuario= ?"
            );
            
            
            preparedStatement.setString(1, usuariosModel.getPrimerNombre());
            preparedStatement.setString(2, usuariosModel.getSegundoNombre());
            preparedStatement.setString(3, usuariosModel.getPrimerApellido());
            preparedStatement.setString(4, usuariosModel.getSegundoApellido());
            preparedStatement.setString(5, usuariosModel.getDocumento());
            preparedStatement.setString(6, usuariosModel.getUsuario());
            preparedStatement.setString(7, usuariosModel.getContrasena());
            preparedStatement.setString(8, usuariosModel.getTipoUsuario());
            preparedStatement.setString(9, usuariosModel.getStatus());
            preparedStatement.setString(10, usuariosModel.getIdUsuario());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch(Exception e){return false;}
    }
//>update
   
    
//<Delete
    public boolean DeleteUsuario(UsuariosModel usuariosModel){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "update usuarios set "
                        + "eliminado='si'"
                    + "where id_usuario= ?"
            );            
            preparedStatement.setString(1, usuariosModel.getIdUsuario());
            preparedStatement.executeUpdate();
            return true;
        } catch(Exception e){return false;}
    }
//>Delete    
    
    
    
    
}
