import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String name;
    private List<Usuario> usuarios;

    public Usuario(String name) {
        this.name = name;
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario us) {
        this.usuarios.add(us);
    }

    public void enviar(String msg) {
        System.out.println(this.name + " envía mensaje: " + msg);
        for (Usuario u : usuarios) {
            if (u != this) {
                u.recibir(msg);
            }
        }
    }

    public void recibir(String msg) {
        System.out.println(this.name + " recibe mensaje: " + msg);
    }
}
