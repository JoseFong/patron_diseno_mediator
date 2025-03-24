public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator med, String name) {
        this.name = name;
        this.mediator = med;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
