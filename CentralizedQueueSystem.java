public class CentralizedQueueSystem {

    private static CentralizedQueueSystem instance;

    private int queueNumber = 0;

    private CentralizedQueueSystem() {}

    public static CentralizedQueueSystem getInstance() {
        if (instance == null) {
            instance = new CentralizedQueueSystem();
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        queueNumber++;
        return queueNumber;
    }

    public synchronized void resetQueueNumber(int newNumber) {
        queueNumber = newNumber;
    }

    public synchronized int getCurrentQueueNumber() {
        return queueNumber;
    }
}
