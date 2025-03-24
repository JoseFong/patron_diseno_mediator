public class ChatCliente {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        Usuario user1 = new Usuario("Fong");
        Usuario user2 = new Usuario("Andrés");
        Usuario user3 = new Usuario("Canett");
        Usuario user4 = new Usuario("Gabriel");

        user1.agregarUsuario(user2);
        user1.agregarUsuario(user3);
        user1.agregarUsuario(user4);

        user2.agregarUsuario(user1);
        user2.agregarUsuario(user3);
        user2.agregarUsuario(user4);

        user3.agregarUsuario(user1);
        user3.agregarUsuario(user2);
        user3.agregarUsuario(user4);

        user4.agregarUsuario(user1);
        user4.agregarUsuario(user2);
        user4.agregarUsuario(user3);

        user1.enviar("Hola");

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo de ejecución: " + (fin - inicio) + " ms");
    }
}