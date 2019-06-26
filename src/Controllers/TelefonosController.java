package Controllers;
import Models.*;
import java.sql.*;
import java.util.*;


public class TelefonosController {
    
//GlobalVariables
    ConnectionController connectionController = new ConnectionController();
    PreparedStatement preparedStatement;
    ResultSet resultSet;
//GlobalVariables
    
        
        
        
//<Insert 
    public boolean InsertTelefono(TelefonosModel telefonosModel){
                        
        try {
            PreparedStatement preparedStatement = connectionController.Conectar().prepareStatement(
                "insert into telefonos (id_telefono,id_relacion,numero_telefono,tipo_telefono,creado,modificado,eliminado) values ("
                + "uuid(),?,?,?,now(),now(),'no')"
            );
            
            
            preparedStatement.setString(1, telefonosModel.getIdRelacion());
            preparedStatement.setString(2, telefonosModel.getNumeroTelefono());
            preparedStatement.setString(3, telefonosModel.getTipoTelefono());
            
            preparedStatement.executeUpdate();
            
            return true;
            
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
//>Insert 
    
    
//<Select
    public List<TelefonosModel> SelectTelefonosById(TelefonosModel telefonosModel){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement("select * from Telefonos where id_relacion= ? and eliminado='no'");
            preparedStatement.setString(1, telefonosModel.getIdRelacion());
            
            resultSet = preparedStatement.executeQuery();
            
            List<TelefonosModel> telefonosList = new ArrayList<>();
            
            while (resultSet.next()){
                TelefonosModel telefonosmodel = new TelefonosModel(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7)
                );
                
                telefonosList.add(telefonosmodel);
            }
            
            return telefonosList;
        }catch(Exception e){return null;}
    }
//>Select

    
//<Update
    public boolean UpdateTelefonoById(TelefonosModel telefonosModel){            
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "update telefonos set "
                        + "numero_telefono= ? ,"
                        + "tipo_telefono= ? ,"
                        + "modificado=now()"
                    + "where id_telefono= ?"
            );
            
            
            preparedStatement.setString(1, telefonosModel.getNumeroTelefono());
            preparedStatement.setString(2, telefonosModel.getTipoTelefono());
            preparedStatement.setString(3, telefonosModel.getIdTelefono());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch(Exception e){return false;}
    }
//>update
   
    
//<Delete
    public boolean DeleteTelefono(TelefonosModel telefonosModel){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "update telefonos set "
                        + "eliminado='si'"
                    + "where id_telefono= ?"
            );
            
            preparedStatement.setString(1, telefonosModel.getIdTelefono());
            
            preparedStatement.executeUpdate();
            return true;
        } catch(Exception e){return false;}
    }
//>Delete    
    
}
