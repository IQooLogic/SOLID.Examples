package rs.co.ast.srp.example.good;

/**
 *
 * @author IQooLogic
 */
public class UserSettingService {

    public void changeEmail(User user) {
        if (SecurityService.checkAccess(user)) {
            //Grant option to change
        }
    }
}
