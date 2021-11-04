public class Person implements Comparable<Person>
{

    String navn;
    int alder;
    int skoStørrelse;

    public Person(String navn, int alder, int skoStørrelse)
    {
        this.navn = navn;
        this.alder = alder;
        this.skoStørrelse = skoStørrelse;
    }

    @Override
    public int compareTo(Person o)
    {
        return o.skoStørrelse - this.skoStørrelse  ;
    }
}
