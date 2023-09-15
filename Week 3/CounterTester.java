public class CounterTester {
    public static void main(String[] args){
        Counter concertCounter = new Counter();
        Counter boardingCounter = new Counter();
        concertCounter.count();
        boardingCounter.count();
        System.out.println(concertCounter.getValue());
        System.out.println(boardingCounter.getValue());
    }
}