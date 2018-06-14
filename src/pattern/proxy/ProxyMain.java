package pattern.proxy;


import java.lang.reflect.Proxy;
import java.util.List;

public class ProxyMain {

    public static void main(String[] args) {

        /*
        UserService userService = new UserServiceImpl();
        UserService proxyUserService = new UserServiceImplTx(userService);

        userService.insertUser(new User());         //정상적으로 처리
        proxyUserService.insertUser(new User());    //쓰기 실패

        //읽기는 정상적으로 실행
        List<User> userAllList = proxyUserService.getUserAll();
        userAllList.forEach(System.out::println);
        */

        //다이나믹 프록시
        ProxyMain proxyMain = new ProxyMain();
        proxyMain.dynamicProxy();

    }

    public void dynamicProxy(){

        UserServiceHandler userServiceHandler = new UserServiceHandler(new UserServiceImpl());
        UserService userService = (UserService) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{UserService.class}, userServiceHandler);

        userService.insertUser(new User());     //쓰기 실패!

        List<User> userListAll = userService.getUserAll();
        userListAll.forEach(System.out::println);               //읽기는 정상적으로 출력
    }
}
