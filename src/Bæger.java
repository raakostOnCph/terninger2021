import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Bæger
{


   private List<Terning> terningniger = new ArrayList<>();

     private List<Terning> fjernedeTerninger = new ArrayList<>();





    int antalTerninger;
    int sideantal;

    public Bæger(int antalTerninger, int sideantal)
    {
        this.antalTerninger = antalTerninger;
        this.sideantal = sideantal;

        fyldBæger();
    }

    public Bæger(int antalTerninger)
    {
        this.antalTerninger = antalTerninger;
        this.sideantal = 6;

        fyldBæger();
    }


    private void fyldBæger()
    {

        for (int i = 0; i < antalTerninger; i++) {

            terningniger.add(new Terning(sideantal));
        }

    }


    public void slå()
    {

        for (Terning terning : terningniger) {

            terning.kast();

        }

    }


    public void kig()
    {

        System.out.println("\n");

        for (Terning terning : terningniger) {

            System.out.println(terning.getSlag());

        }

    }


    public int sum() {

        int sum =0;

        for (Terning terning : terningniger) {

            sum = sum + terning.getSlag();
        }

        return sum;


    }


    public void fjern(int i) {

        Iterator<Terning> terningIterator = terningniger.iterator();

        while (terningIterator.hasNext()) {

            Terning terning = terningIterator.next();

            if (terning.getSlag() == i) {

                terningIterator.remove();
                fjernedeTerninger.add(terning);
            }
        }

        kig();
        System.out.println("\n");
        visFjernede();

    }

    public void visFjernede() {

        for (Terning terning : fjernedeTerninger) {

            System.out.println(terning.getSlag());

        }


    }

    public void filter(int fjern) {

        Predicate<Terning> ligMed = terning -> terning.getSlag() == fjern;
        Predicate<Terning> forskelligeFra = terning -> terning.getSlag() != fjern;

        List<Terning> temp = new ArrayList<>(terningniger);

        terningniger.removeIf(ligMed);  // har nu fjernet alle 2'er

        temp.removeIf(forskelligeFra);    // alle terninger som ikke er 2

        fjernedeTerninger.addAll(temp);

        kig();
        System.out.println("\n");
        visFjernede();

    }

//    public void godeGamleFjern(int i ) {   // vi kan ikke indexere elementerne !
//
//        for (int j = 0; j < terningniger.size(); j++) {
//
//            if (terningniger[j]. )
//
//
//        }
//
//    }


    public void sorter() {

        Collections.sort(terningniger);

        kig();


    }

    
}





