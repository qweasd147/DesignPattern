package pattern.proxy;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UserServiceImpl implements UserService{
    
    @Override
    public User getUser(int userIdx) {
        return new User(1, "아이디", "이름");
    }

    @Override
    public List<User> getUserAll() {

        IntStream userIdxStream = new Random().ints(10, 1, 30);

        List<User> userList = userIdxStream
                .mapToObj((idx) -> new User(idx, "아이디" + idx, "이름" + idx))
                .collect(Collectors.toList());

        return userList;
    }

    @Override
    public int insertUser(User user) {
        //입력된 user 처리 로직
        return SUCCESSFUL;
    }

    @Override
    public int updateUser(User user) {
        //입력된 user 수정 로직
        return SUCCESSFUL;
    }

    @Override
    public int deleteUser(int userIdx) {
        //입력된 userIdx로 로직
        return SUCCESSFUL;
    }
}
