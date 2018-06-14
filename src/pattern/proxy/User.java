package pattern.proxy;

public class User {

    private int userIdx;
    private String userID;
    private String userPW;
    private String userName;

    public User(){}

    public User(int userIdx, String userID, String userName) {
        this.userIdx = userIdx;
        this.userID = userID;
        this.userName = userName;
    }

    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userIdx=" + userIdx +
                ", userID='" + userID + '\'' +
                ", userPW='" + userPW + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
