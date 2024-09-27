public class Main 
{
    public static void main(String[] args)
    {
        Feeder a = new Feeder(500); //example 1
        a.simulateOneDay(12);
        System.out.println(a.getCurrentFood());

        Feeder b = new Feeder(1000); //example 2
        b.simulateOneDay(12);
        System.out.println(b.getCurrentFood());

        Feeder c = new Feeder(100); //example 3
        c.simulateOneDay(5);
        System.out.println(c.getCurrentFood());

        Feeder d = new Feeder(2400); //example 4
        System.out.println(d.simulateManyDays(10, 4));

        Feeder e = new Feeder(250); //example 5
        System.out.println(e.simulateManyDays(10, 5));

        Feeder f = new Feeder(0); //example 6
        System.out.println(f.simulateManyDays(5, 10));
    }
}