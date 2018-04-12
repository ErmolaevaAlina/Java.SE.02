package com.company;

public class NuclearSubmarine {
    private Engine engine;

    public NuclearSubmarine() {
        engine = new Engine();
    }

    public void Start(int speed)
    {
        engine.start(speed);
    }

    private class Engine
    {

        public void start(int speed){
            while(true)
            {
                System.out.print("G");
                for(int i = 0; i < speed; i++) {
                    System.out.print("E");
                }
                System.out.println();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
