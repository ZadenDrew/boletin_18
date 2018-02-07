package correos;

/**
 *
 * @author acabezaslopez
 */
public class Correo {

    private String correo;
   public boolean confirmacion=false;

    public Correo() {
    }

    public Correo(String correo, boolean confirmacion) {
        this.correo = correo;
        this.confirmacion = confirmacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(boolean confirmacion) {
        this.confirmacion = confirmacion;
    }

    @Override
    public String toString() {
        return "Correo{" + "correo=" + correo + ", confirmacion=" + confirmacion + '}';
    }

}
