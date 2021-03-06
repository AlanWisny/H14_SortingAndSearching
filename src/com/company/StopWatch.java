package com.company;


// A stopwatch accumulates time when it is running, You can repeatedly start and stop the stopwatch.
// You can use a stopwatch to measure the running time of a program.
public class StopWatch {
    private long elapsedTime;
    private long startTime;
    private boolean isRunning;

    public StopWatch() {
        reset();
    }

    // Starts the stopwatch. Time starts accumulating now.
    public void start() {
        if(isRunning) {
            return;
        }
        isRunning = true;
        startTime = System.currentTimeMillis();
    }

    // Stops the stopwatch. Time stops accumulating and is added to the elapsed time.
    public void stop() {
        if(!isRunning) {
            return;
        }
        isRunning = false;
        long endTime = System.currentTimeMillis();
        elapsedTime = elapsedTime + endTime - startTime;
        System.out.println("Elapsed time: " + getElapsedTime() + " milliseconds");
    }

    // Return the total elapsed time.
    public long getElapsedTime() {
        if(isRunning) {
            long endTime = System.currentTimeMillis();
            return elapsedTime + endTime - startTime;
        } else {
            return elapsedTime;
        }
    }

    // Stops the watch and resets the elapsed time to 0.
    public void reset() {
        elapsedTime = 0;
        isRunning = false;
    }
}
