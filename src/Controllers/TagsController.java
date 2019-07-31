package Controllers;
import Models.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class TagsController {


    
 //GlobalVariables
    ConnectionController connectionController = new ConnectionController();
    PreparedStatement preparedStatement;
    ResultSet resultSet;
//GlobalVariables
    
        
        
        
//<Insert 
    public boolean InsertTags(TagsModel tagsModel){
                        
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                "insert into tags (id_tags,numero_tags,referencias,activo,creado,modificado,eliminado) "
                + "values (uuid(),?,?,?,?,?,?,now(),now(),'no')"
            );

            
            preparedStatement.setString(1, tagsModel.getId_tags());
            preparedStatement.setString(2, tagsModel.getNumero_tags());
            preparedStatement.setString(3, tagsModel.getReferencias());
            preparedStatement.setString(4, tagsModel.getActivo());
            preparedStatement.setString(5, tagsModel.getCreado());
            preparedStatement.setString(6, tagsModel.getEliminado());
            
            preparedStatement.executeUpdate();
            
            return true;
            
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
//>Insert 
    
    
//<Select
    public List<TagsModel> SelectTagsById(String id_tags){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement("select * from tags where id_tags= ? and eliminado='no'");
            preparedStatement.setString(1, id_tags);
            
            resultSet = preparedStatement.executeQuery();
            
            List<TagsModel> tagsList = new ArrayList<>();
            
            while (resultSet.next()){
                TagsModel tagsModel = new TagsModel(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7)          
               
                );
                
          
            }
            
            return tagsList;
        }catch(Exception e){return null;}
        
        
    }
//>Select

    
//<Update
    public boolean UpdateDireccionById(TagsModel tagsModel){            
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "update tags set "
                        + "numero_tags = ? ,"
                        + "referencias= ? ,"
                        + "activo = ? ,"
                        + "modificado=now()"
                    + " where id_tags= ?"
            );
            
            
            preparedStatement.setString(1, tagsModel.getNumero_tags());
            preparedStatement.setString(2, tagsModel.getReferencias());
            preparedStatement.setString(3, tagsModel.getActivo());
     
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch(Exception e){return false;}
    }
//>update
   
    
//<Delete
    public boolean DeleteTelefono(TagsModel tagsModel){
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "update tags set "
                        + "eliminado='si'"
                    + "where id_tags= ?"
            );
            
            preparedStatement.setString(1, tagsModel.getNumero_tags());
            
            preparedStatement.executeUpdate();
            return true;
        } catch(Exception e){return false;}
    }
//>Delete    
       
    
    
    
    
    
    
    
    
    
    
}
