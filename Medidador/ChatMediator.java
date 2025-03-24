public interface ChatMediator {
    public void addUser(User user);

    public void sendMessage(String msg, User user);
}