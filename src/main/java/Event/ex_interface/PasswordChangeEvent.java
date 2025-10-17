package Event.ex_interface;

import java.sql.Timestamp;

public class PasswordChangeEvent extends AbstractEvent{

    public PasswordChangeEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Password changed for user: " + id + "\nSending notification email...");

    }
}
