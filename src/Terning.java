import java.util.Random;
import java.util.function.Predicate;

public class Terning implements Comparable<Terning>
{

    private int slag = 0;

    int sideantal;

    Random random = new Random();

    public Terning(int sideantal)
    {
        this.sideantal = sideantal;
    }

    public Terning()
    {
        this.sideantal = 6;
    }

    public int getSlag()
    {
        return slag;
    }

    public int kast() {


        slag = random.nextInt(sideantal)+1;
        return slag;

    }


    @Override
    public int compareTo(Terning o)
    {

        return this.getSlag() - o.getSlag() ;

    }
}
