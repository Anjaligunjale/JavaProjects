public class Main {
    public static void main(String[] args) {
        ECommerceSystem system = new ECommerceSystem();

        while (true) {
            User user = system.login();
            if (user == null) continue;

            if (user.isAdmin()) system.adminMenu();
            else system.userMenu(user);
        }
    }
}