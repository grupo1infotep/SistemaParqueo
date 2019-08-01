package Models;

import Models.*;

public class TagsModel {
    
    private String idtags;
    private String numerotags;
    private String referencias;
    private String activo;
    private String creado;
    private String modificado;
    private String eliminado;

   
    
    public TagsModel() {
    }

    public TagsModel(String idtags) {
        this.idtags = idtags;
    }

    
    public TagsModel(String idtags, String numerotags, String referencias, String activo, String creado, String modificado, String eliminado) {
        this.idtags = idtags;
        this.numerotags = numerotags;
        this.referencias = referencias;
        this.activo = activo;
        this.creado = creado;
        this.modificado = modificado;
        this.eliminado = eliminado;
    }

    public String getIdtags() {
        return idtags;
    }

    public void setIdtags(String idtags) {
        this.idtags = idtags;
    }

    public String getNumerotags() {
        return numerotags;
    }

    public void setNumerotags(String numerotags) {
        this.numerotags = numerotags;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
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
        return "TagsModel{" + "idtags=" + idtags + ", numerotags=" + numerotags + ", referencias=" + referencias + ", activo=" + activo + ", creado=" + creado + ", modificado=" + modificado + ", eliminado=" + eliminado + '}';
    }

   
     
    
}
