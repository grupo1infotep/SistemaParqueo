package Models;

public class TelefonosModel {

    private String idTelefono;
    private String idRelacion;
    private String telefono1;
    private String tipoTelefono1;
    private String telefono2;
    private String tipoTelefono2;
    private String telefono3;
    private String tipoTelefono3;
    private String creado;
    private String modificado;
    private String eliminado;

    public TelefonosModel() {
    }

    public TelefonosModel(String idRelacion) {
        this.idRelacion = idRelacion;
    }

    public TelefonosModel(String idTelefono, String idRelacion, String telefono1, String tipoTelefono1, String telefono2, String tipoTelefono2, String telefono3, String tipoTelefono3, String creado, String modificado, String eliminado) {
        this.idTelefono = idTelefono;
        this.idRelacion = idRelacion;
        this.telefono1 = telefono1;
        this.tipoTelefono1 = tipoTelefono1;
        this.telefono2 = telefono2;
        this.tipoTelefono2 = tipoTelefono2;
        this.telefono3 = telefono3;
        this.tipoTelefono3 = tipoTelefono3;
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

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTipoTelefono1() {
        return tipoTelefono1;
    }

    public void setTipoTelefono1(String tipoTelefono1) {
        this.tipoTelefono1 = tipoTelefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getTipoTelefono2() {
        return tipoTelefono2;
    }

    public void setTipoTelefono2(String tipoTelefono2) {
        this.tipoTelefono2 = tipoTelefono2;
    }

    public String getTelefono3() {
        return telefono3;
    }

    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    public String getTipoTelefono3() {
        return tipoTelefono3;
    }

    public void setTipoTelefono3(String tipoTelefono3) {
        this.tipoTelefono3 = tipoTelefono3;
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
        return "TelefonosModel{" + "idTelefono=" + idTelefono + ", idRelacion=" + idRelacion + ", telefono1=" + telefono1 + ", tipoTelefono1=" + tipoTelefono1 + ", telefono2=" + telefono2 + ", tipoTelefono2=" + tipoTelefono2 + ", telefono3=" + telefono3 + ", tipoTelefono3=" + tipoTelefono3 + ", creado=" + creado + ", modificado=" + modificado + ", eliminado=" + eliminado + '}';
    }

}
