public class Feeder {

    private int currentFood;

    public void simulateOneDay(int numBirds)
    {
        if(Math.random() < 0.05 ) currentFood = 0;
        else 
        {
            int eaten = (int)(Math.random() * 41) + 10;
            currentFood -= eaten * numBirds;
            if (currentFood < 0) currentFood = 0;
        }
    }

    public String toString()
    {
        return "Current Food: " + currentFood;
    }

    public int simulateManyDays(int numBirds, int numDays) 
    {
        int days = 0;
        while(numDays > 0)
        {
            if(currentFood == 0) return days;
            simulateOneDay(numBirds);
            numDays--;
            days++;
            
        }
        return days;
    }

    public int getCurrentFood() 
    {
        return currentFood;
    }

    public Feeder(int c) 
    {
        currentFood = c;
    }
    public Feeder() {}
}