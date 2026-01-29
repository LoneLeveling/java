package Oops;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UserServiceImpl implements UserService{
    @Override
    public void createUser() {
        System.out.println("User Created...");
    }
}
