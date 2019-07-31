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
            preparedStatement = connectionController.Conectar().prepareStatement(
                "insert into telefonos (id_telefono,id_relacion,telefono_1,tipo_telefono_1,telefono_2,tipo_telefono_2,telefono_3,tipo_telefono_3,creado,modificado,eliminado) values ("
                + "uuid(),?,?,?,?,?,?,?,now(),now(),'no')"
            );
            
            
            preparedStatement.setString(1, telefonosModel.getIdRelacion());
            preparedStatement.setString(2, telefonosModel.getTelefono1());
            preparedStatement.setString(3, telefonosModel.getTipoTelefono1());
            preparedStatement.setString(4, telefonosModel.getTelefono2());
            preparedStatement.setString(5, telefonosModel.getTipoTelefono2());
            preparedStatement.setString(6, telefonosModel.getTelefono3());
            preparedStatement.setString(7, telefonosModel.getTipoTelefono3());
            
            preparedStatement.executeUpdate();
            
            return true;
            
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
//>Insert 
    
    
//<Select
    public List<TelefonosModel> SelectTelefonosById(String idRelacion){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement("select * from Telefonos where id_relacion= ? and eliminado='no'");
            preparedStatement.setString(1, idRelacion);
            
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
                    resultSet.getString(7),
                    resultSet.getString(8),
                    resultSet.getString(9),
                    resultSet.getString(10),
                    resultSet.getString(11)
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
                        + "telefono_1 = ? ,"
                        + "tipo_telefono_1= ? ,"
                        + "telefono_2 = ? ,"
                        + "tipo_telefono_2= ? ,"
                        + "telefono_3 = ? ,"
                        + "tipo_telefono_3= ? ,"
                        + "modificado=now()"
                    + "where id_relacion= ?"
            );
            
            
            preparedStatement.setString(1, telefonosModel.getTelefono1());
            preparedStatement.setString(2, telefonosModel.getTipoTelefono1());
            preparedStatement.setString(3, telefonosModel.getTelefono2());
            preparedStatement.setString(4, telefonosModel.getTipoTelefono2());
            preparedStatement.setString(5, telefonosModel.getTelefono3());
            preparedStatement.setString(6, telefonosModel.getTipoTelefono3());
            preparedStatement.setString(7, telefonosModel.getIdRelacion());
            
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
