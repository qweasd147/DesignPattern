package pattern.proxy;

import java.util.List;

/**
 * 읽기는 가능, 쓰기는 불가능하게 구현
 */
public class UserServiceImplTx implements UserService{

    private UserService userService;

    public UserServiceImplTx(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getUser(int userIdx) {
        if(isReadAble()){
            return userService.getUser(userIdx);
        }else{
            System.out.println("읽기 실패!");
            return null;
        }
    }

    @Override
    public List<User> getUserAll() {
        if(isReadAble()){
            return userService.getUserAll();
        }else{
            System.out.println("읽기 실패!");
            return null;
        }
    }

    @Override
    public int insertUser(User user) {
        if(isWritAble()){
            return userService.insertUser(user);
        }else{
            System.out.println("쓰기 실패!");
            return FAIL;
        }
    }

    @Override
    public int updateUser(User user) {
        if(isWritAble()){
            return userService.updateUser(user);
        }else{
            System.out.println("쓰기 실패!");
            return FAIL;
        }
    }

    @Override
    public int deleteUser(int userIdx) {
        if(isWritAble()){
            return userService.deleteUser(userIdx);
        }else{
            System.out.println("쓰기 실패!");
            return FAIL;
        }
    }

    private boolean isWritAble(){
        //TODO : 쓰기 가능 체크 로직
        return false;
    }

    private boolean isReadAble(){
        //TODO : 읽기 가능 체크로직
        return true;
    }
}
