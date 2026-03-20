package Exception;

public class User {

    public static void findUser(String username) throws UserNotFoundException {
        if (!username.equals("Raj")){
            throw new UserNotFoundException("User not found" + username);
        }
        System.out.println("User found " + username);
    }

    public static void main(String[] args) {
        try {
            findUser("Amit");
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
