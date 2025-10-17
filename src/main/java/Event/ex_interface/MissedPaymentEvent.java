package Event.ex_interface;

import java.sql.Timestamp;

public class MissedPaymentEvent extends AbstractEvent {

    public MissedPaymentEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Missed payment detected for user: " + id + "\nNotifying user and applying late fees...");
    }
}
