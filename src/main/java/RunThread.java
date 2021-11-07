public class RunThread implements Runnable{

    private Parser parser = new Parser(new Reader());
    private Counter counter = new Counter(parser.parsing());
    private int state;

    public RunThread(int state) {
        this.state = state;
    }

    @Override
    public void run() {
        if(state == 0)
            Main.amount.getAndAdd(counter.countAmountOfWords(0, counter.getSize()/2));
        else if(state == 1)
            Main.amount.getAndAdd(counter.countAmountOfWords(counter.getSize()/2,counter.getSize()));

    }
}
