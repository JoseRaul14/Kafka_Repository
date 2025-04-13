package pe.edu.idat.demo_kafka.Model;

public class ComentariosModel {

    private String usuario;
    private Long productoId;
    private String comentario;

    public ComentariosModel() {
    }

    public ComentariosModel(String usuario, Long productoId, String comentario) {
        this.usuario = usuario;
        this.productoId = productoId;
        this.comentario = comentario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
