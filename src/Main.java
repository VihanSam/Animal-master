public class Main {
    public static void main (String args[]) {
        // Create my cat object
        Animal myCat = new Animal();
        //Set my cat name
        myCat.setName("Johnny");


        // Create my dog object
        Animal myDog = new Animal();
        // Set my dog name
        myDog.setName("Tammy");



        // Make animals Noise
        // Make cat bark
       // System.out.println(myCat.getName() + " Meows");
        // Make dog bark
       // System.out.println(myDog.getName() +

        //Set Noise
        myCat.setNoise("Meows");
        myDog.setNoise("Barks");


        // Create my cat2 object
        Animal myCat2 = new Animal();

        // Name myCat2
        myCat2.setName("Donny");


        //Get my cat name and display output
        System.out.println("My Cat name is " + myCat.getName());

        // Get my other cat name and display output
        System.out.println("My Second cat name is " + myCat2.getName());

        // Get my dog name and display output
        System.out.println("My Dog name is " + myDog.getName());



        //Display Noise
        System.out.println(myCat.getName() + " " + myCat.getNoise());
        System.out.println(myDog.getName() + " " + myDog.getNoise());
        
        

        // Set noise for Donny
        myCat2.setNoise("Meups");

        //Display noise
        System.out.println(myCat2.getName() + " " + myCat2.getNoise());


    }
}
