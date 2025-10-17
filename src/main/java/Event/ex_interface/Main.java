package Event.ex_interface;

public class Main {
    public static void main(String[] args){
        PasswordChangeEvent event1 = new PasswordChangeEvent("123579");
        MissedPaymentEvent event2 = new MissedPaymentEvent("456347");
        AccountTransferEvent event3 = new AccountTransferEvent("789721");

        Event[] events = {event1, event2, event3};

        for (Event e : events) {
            System.out.println("Event Timestamp: " + e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}
