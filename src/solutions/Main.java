package solutions;

import solutions.configuration.IRunnable;

public class Main {
    public static void main(String[] args) {
        IRunnable run = new UniqueEmailAddress();
        run.run();
    }
}
