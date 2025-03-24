public class ChatClient {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Fong");
        User user2 = new UserImpl(mediator, "Andrés");
        User user3 = new UserImpl(mediator, "Canett");
        User user4 = new UserImpl(mediator, "Gabriel");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hola");

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución: " + (fin - inicio) + " ms");
    }
}
