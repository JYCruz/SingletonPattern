public class PagIbigOffice {

    public static void main(String[] args) {
        CentralizedQueueSystem queueSystem = CentralizedQueueSystem.getInstance();

        int number1 = queueSystem.getNextQueueNumber();
        System.out.println("First queued number: " + number1);

        int number2 = queueSystem.getNextQueueNumber();
        System.out.println("Second queued number: " + number2);

        queueSystem.resetQueueNumber(100);
        System.out.println("Queue number after reset: " + queueSystem.getCurrentQueueNumber());

        int number3 = queueSystem.getNextQueueNumber();
        System.out.println("Third queued number after reset: " + number3);
    }
}
