package Models;

public class TelefonosModel {

    private String idTelefono;
    private String idRelacion;
    private String numeroTelefono;
    private String tipoTelefono;
    private String creado;
    private String modificado;
    private String eliminado;

    public TelefonosModel() {
    }

    public TelefonosModel(String idTelefono, String idRelacion) {
        this.idTelefono = idTelefono;
        this.idRelacion = idRelacion;
    }
    
    public TelefonosModel(String idTelefono, String idRelacion, String numeroTelefono, String tipoTelefono, String creado, String modificado, String eliminado) {
        this.idTelefono = idTelefono;
        this.idRelacion = idRelacion;
        this.numeroTelefono = numeroTelefono;
        this.tipoTelefono = tipoTelefono;
        this.creado = creado;
        this.modificado = modificado;
        this.eliminado = eliminado;
    }

    public String getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(String idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getIdRelacion() {
        return idRelacion;
    }

    public void setIdRelacion(String idRelacion) {
        this.idRelacion = idRelacion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
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
        return "TelefonosModel{" + "idTelefono=" + idTelefono + ", idRelacion=" + idRelacion + ", numeroTelefono=" + numeroTelefono + ", tipoTelefono=" + tipoTelefono + ", creado=" + creado + ", modificado=" + modificado + ", eliminado=" + eliminado + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
