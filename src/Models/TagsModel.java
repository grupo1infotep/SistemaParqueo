package Models;

public class TagsModel {

    private String id_tags;
    private String numero_tags;
    private String referencias;
    private String activo;
    private String creado;
    private String modificado;
    private String eliminado;

    public TagsModel() {
    }

    public TagsModel(String id_tags) {
        this.id_tags = this.id_tags;
    }

    public TagsModel(String id_tags, String numero_tags, String referencias, String activo, String creado, String modificado, String eliminado) {

        this.id_tags = id_tags;
        this.numero_tags = numero_tags;
        this.referencias = referencias;
        this.activo = activo;
        this.creado = creado;
        this.modificado = modificado;
        this.eliminado = eliminado;
    }

    public String getId_tags() {
        return id_tags;
    }

    public void setId_tags(String id_tags) {
        this.id_tags = id_tags;
    }

    public String getNumero_tags() {
        return numero_tags;
    }

    public void setNumero_tags(String numero_tags) {
        this.numero_tags = numero_tags;
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
        return "TagsModel{" + "id_tags=" + id_tags + ", numero_tags=" + numero_tags + ", referencias=" + referencias + ", activo=" + activo + ", creado=" + creado + ", modificado=" + modificado + ", eliminado=" + eliminado + '}';
    }

}
