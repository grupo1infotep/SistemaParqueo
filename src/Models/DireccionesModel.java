
package Models;

public class DireccionesModel {
   
    private String idDireccion;
    private String idRelacion;
    private String calle;
    private String numero;
    private String sector;
    private String ciudad;
    private String pais;
    private String creado;
    private String modificado;
    private String eliminado;

    public DireccionesModel() {
    }

    public DireccionesModel(String idDireccion) {
        this.idDireccion = idDireccion;
    }

    public DireccionesModel(String idDireccion, String idRelacion, String calle, String numero, String sector, String ciudad, String pais, String creado, String modificado, String eliminado) {
        this.idDireccion = idDireccion;
        this.idRelacion = idRelacion;
        this.calle = calle;
        this.numero = numero;
        this.sector = sector;
        this.ciudad = ciudad;
        this.pais = pais;
        this.creado = creado;
        this.modificado = modificado;
        this.eliminado = eliminado;
    }

    public String getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(String idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getIdRelacion() {
        return idRelacion;
    }

    public void setIdRelacion(String idRelacion) {
        this.idRelacion = idRelacion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCreado() {
        return creado;
    }

    public void setCreado(String creado) {
        this.creado = creado;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public String getEliminado() {
        return eliminado;
    }

    public void setEliminado(String eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public String toString() {
        return "DireccionesModel{" + "idDireccion=" + idDireccion + ", idRelacion=" + idRelacion + ", calle=" + calle + ", numero=" + numero + ", sector=" + sector + ", ciudad=" + ciudad + ", pais=" + pais + ", creado=" + creado + ", modificado=" + modificado + ", eliminado=" + eliminado + '}';
    }
    
    
    
    
    
}
