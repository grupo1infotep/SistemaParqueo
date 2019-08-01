package Controllers;

import Models.TagsModel;
import Models.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TagsController {
//GlobalVariables

    ConnectionController connectionController = new ConnectionController();
    PreparedStatement preparedStatement;
    ResultSet resultSet;
//GlobalVariables

//<Insert 
    public String Inserttags(TagsModel tagsModel) {

        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "insert into usuarios (id_tag,numero_tag,referencias,activo,creado,modificado) values ("
                    + "uuid(),?,?,?,?,now(),now())"
            );
             
            preparedStatement.setString(1, tagsModel.getIdtags());  
            preparedStatement.setString(2, tagsModel.getNumerotags());
            preparedStatement.setString(3, tagsModel.getReferencias());
            preparedStatement.setString(4, tagsModel.getActivo());

            preparedStatement.executeUpdate();

            resultSet = connectionController.Conectar().prepareStatement("SELECT id_tags FROM tags WHERE creado =(select MAX(creado)from tags)").executeQuery();
            while (resultSet.next()) {
                return resultSet.getString(1);
            }
            return "";
        } catch (Exception ex) {
            System.out.println(ex);
            return "";
        }
    }
//>Insert 

//<Select
    public List<TagsModel> SelectTags() {
        try {
            preparedStatement = connectionController.Conectar().prepareStatement("select * from tags where eliminado='no'");
            return GetListFromResultSet();
        } catch (Exception e) {
            return null;
        }

    }
    public List<TagsModel> SelecttagsById(String id_tags) {
        try {
            preparedStatement = connectionController.Conectar().prepareStatement("select * from tags where id_tag=?");
            preparedStatement.setString(1, id_tags);
            return GetListFromResultSet();
        } catch (Exception e) {
            return null;
        }
    }
    public List<TagsModel> SelecttagsByreferens(String referencias) {
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "SELECT * FROM `tags` "
                    + "WHERE CONCAT(referencias,numero_tag) REGEXP ? "
                    + "or CONCAT(referencias) REGEXP ?"
                    + "or CONCAT(numero_tag) REGEXP ?"
            );
            preparedStatement.setString(1, referencias);
            preparedStatement.setString(2, referencias);
            preparedStatement.setString(3, referencias);
            return GetListFromResultSet();
        } catch (Exception e) {
            return null;
        }
    }
    public List<TagsModel> SelecttagsoBy_id_and_numero_tags(String usuario, String contrasena) {
        try {
            preparedStatement = connectionController.Conectar().prepareStatement("select * from tags where numero_tag=? and id_tag=?");
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, contrasena);

            return GetListFromResultSet();
        } catch (Exception e) {
            return null;
        }
    }
    private List<TagsModel> GetListFromResultSet() {
        try {
            resultSet = preparedStatement.executeQuery();

            List<TagsModel> TagsList = new ArrayList<>();

            while (resultSet.next()) {
                TagsModel tagsModel = new TagsModel(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7)
                );

                TagsList.add(tagsModel);
            }

            return TagsList;

        } catch (Exception e) {
            return null;
        }

    }
//>Select

//<Update
    public boolean UpdateTags(TagsModel tagsModel) {
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "update tags set "
                    + "numero_tag= ? ,"
                    + "referencias= ? ,"
                    + "activo= ? ,"
                    + "modificado=now()"
                    + "where id_tags= ?"
            );

            preparedStatement.setString(1, tagsModel.getNumerotags());
            preparedStatement.setString(2, tagsModel.getReferencias());
            preparedStatement.setString(3, tagsModel.getActivo());
            preparedStatement.setString(4, tagsModel.getIdtags());

            preparedStatement.executeUpdate();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
//>update

//<Delete
    public boolean Deletetags(TagsModel tagsModel) {
        try {
            preparedStatement = connectionController.Conectar().prepareStatement(
                    "update tags set "
                    + "eliminado='si'"
                    + "where id_tags= ?"
            );
            preparedStatement.setString(1, tagsModel.getIdtags());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
//>Delete    

    public void j() {

        String idtags = "";
        try {
            resultSet = connectionController.Conectar().prepareStatement("SELECT id_tag FROM tags WHERE creado =(select MAX(creado)from tags)").executeQuery();
            while (resultSet.next()) {

            }

        } catch (SQLException ex) {
            Logger.getLogger(TagsController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   
}
