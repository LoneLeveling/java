package Oops;

public class UserController_FieldInjection {
    UserService   userService;
    public void create()
    {
        userService.createUser();
    }
}
