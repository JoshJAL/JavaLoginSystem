import java.util.HashMap;

public class IDandPasswords {
  HashMap<String, String> loginInfo = new HashMap<String, String>();

  IDandPasswords() {
    loginInfo.put("JoshJAL", "somePassword");
    loginInfo.put("Brometheus", "PASSWORD");
    loginInfo.put("JoshJALOtherAccount", "ABC123");
  }

  protected HashMap<String, String> getLoginInfo() {
    return loginInfo;
  }
}
