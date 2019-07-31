package Controllers;
import Models.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DireccionesController {
    
 //GlobalVariables
    ConnectionController connectionController = new ConnectionController();
    PreparedStatement preparedStatement;
    ResultSet resultSet;
//GlobalVariables
    
        
        
        
//<Insert 
    public boolean InsertDireccion(DireccionesModel direccionesModel){
                        
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                "insert into direcciones (id_direccion,id_relacion,calle,numero,sector,ciudad,pais,creado,modificado,eliminado) "
                + "values (uuid(),?,?,?,?,?,?,now(),now(),'no')"
            );

            
            preparedStatement.setString(1, direccionesModel.getIdRelacion());
            preparedStatement.setString(2, direccionesModel.getCalle());
            preparedStatement.setString(3, direccionesModel.getNumero());
            preparedStatement.setString(4, direccionesModel.getSector());
            preparedStatement.setString(5, direccionesModel.getCiudad());
            preparedStatement.setString(6, direccionesModel.getPais());
            
            preparedStatement.executeUpdate();
            
            return true;
            
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
//>Insert 
    
    
//<Select
    public List<DireccionesModel> SelectDireccionById(String idRelacion){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement("select * from Direcciones where id_relacion= ? and eliminado='no'");
            preparedStatement.setString(1, idRelacion);
            
            resultSet = preparedStatement.executeQuery();
            
            List<DireccionesModel> direccionesList = new ArrayList<>();
            
            while (resultSet.next()){
                DireccionesModel direccionesModel = new DireccionesModel(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getString(8),
                    resultSet.getString(9),
                    resultSet.getString(10)
                );
                
                direccionesList.add(direccionesModel);
            }
            
            return direccionesList;
        }catch(Exception e){return null;}
    }
//>Select

    
//<Update
    public boolean UpdateDireccionById(DireccionesModel direccionesModel){            
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "update direcciones set "
                        + "calle = ? ,"
                        + "numero= ? ,"
                        + "sector = ? ,"
                        + "ciudad= ? ,"
                        + "pais = ? ,"
                        + "modificado=now()"
                    + " where id_relacion= ?"
            );
            
            
            preparedStatement.setString(1, direccionesModel.getCalle());
            preparedStatement.setString(2, direccionesModel.getNumero());
            preparedStatement.setString(3, direccionesModel.getSector());
            preparedStatement.setString(4, direccionesModel.getCiudad());
            preparedStatement.setString(5, direccionesModel.getPais());
            preparedStatement.setString(6, direccionesModel.getIdRelacion());
            
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
