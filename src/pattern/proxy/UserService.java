package pattern.proxy;

import java.util.List;

public interface UserService {

    public static final int SUCCESSFUL = 1;
    public static final int FAIL = -1;
    public static final int WARNING = 0;


    public User getUser(int userIdx);

    public List<User> getUserAll();

    public int insertUser(User user);

    public int updateUser(User user);

    public int deleteUser(int userIdx);

}
