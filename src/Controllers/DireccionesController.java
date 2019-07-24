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

    
}
