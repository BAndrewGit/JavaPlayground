package Event.ex_interface;

import java.sql.Timestamp;

public class AccountTransferEvent extends AbstractEvent{

    public AccountTransferEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Account transfer initiated for user: " + id + "\nProcessing transfer...");

    }
}
