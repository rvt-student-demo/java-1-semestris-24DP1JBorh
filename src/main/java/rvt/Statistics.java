package rvt;
public class Statistics {
    private int count;
    private int sum;

    public Statistics () {
    }

    public void addNumber(int number) {
        count++;
        sum += number;
    }

    public int sum() {
        return sum;
    }

    public int getCount() {
        return count;
    }
    
    public double average() {
        return (double) sum / count;
    }
}

