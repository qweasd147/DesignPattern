package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class UserServiceHandler implements InvocationHandler {

    private UserService target;

    public static final List<String> CHECK_READABLE_PREFIX = new ArrayList<>();
    public static final List<String> CHECK_WRITABLE_PREFIX = new ArrayList<>();

    public UserServiceHandler(UserService target) {

        this.target = target;

        CHECK_READABLE_PREFIX.add("select");
        CHECK_READABLE_PREFIX.add("read");

        CHECK_WRITABLE_PREFIX.add("insert");
        CHECK_WRITABLE_PREFIX.add("update");
        CHECK_WRITABLE_PREFIX.add("delete");
        CHECK_WRITABLE_PREFIX.add("create");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(isStartsWithConstains(CHECK_READABLE_PREFIX, method.getName().toLowerCase()) && !isReadAble()){
            //쓰기 메소드인데 쓸수 없는 상태 일 시
            System.out.println("읽기 실패!!!!");
            return UserService.FAIL;
        }else if(isStartsWithConstains(CHECK_WRITABLE_PREFIX, method.getName().toLowerCase()) && !isWritAble()){
            //읽기 메소드인데 읽을 수 없는 상태 일 시
            System.out.println("쓰기 실패!!!!");
            return UserService.FAIL;
        }else{
            return method.invoke(target, args);
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

    /**
     * 리스트 안에 반복하면서 starts with 체크하는 유틸 메소드
     * @param list
     * @param str
     * @return
     */
    private static boolean isStartsWithConstains(List<String> list, String str){
        return list.stream()
                .anyMatch((prefix)->str.startsWith(prefix));
    }

}
