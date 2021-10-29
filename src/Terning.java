import java.util.Random;

public class Terning
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


}
