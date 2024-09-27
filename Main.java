public class Main 
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        System.out.println(f);
        System.out.println(f.getCurrentFood());
        Feeder g = new Feeder(500);
        
        int random = (int) (Math.random() * 40 + 10);
        System.out.println(random);
        
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
    }
}