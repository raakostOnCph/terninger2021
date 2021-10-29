public class Main {

    public static void main(String[] args) {
	// write your code here


        Bæger bæger = new Bæger(10);

        bæger.slå();

        bæger.kig();

      //  System.out.println("summen " + bæger.sum());

//        bæger.fjern(Input.getTal("fjern : "));

        System.out.println("\n");
        bæger.filter(Input.getTal("filtrer : "));

    }


}
