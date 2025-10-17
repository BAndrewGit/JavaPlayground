package Event.ex_interface;

public abstract class AbstractEvent implements Event{
    protected Long timeStamp;
    protected String id;

    public AbstractEvent(String id) {
        this.timeStamp = System.currentTimeMillis();
        this.id = id;
    }

    @Override
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public abstract void process();
}
