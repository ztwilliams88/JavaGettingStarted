import java.util.*;

public class WeekFourExercises {
    public List<String> returnStringsInAlphabeticalOrder(){
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";

        ArrayList<String> myStrings = new ArrayList <String>();
        myStrings.add(one);
        myStrings.add(two);
        myStrings.add(three);
        myStrings.add(four);
        myStrings.add(five);

        Collections.sort(myStrings);
        return myStrings;

    }

    public HashMap<Integer, String> returnStringsAsMapInGuaranteedNumericalKeyOrder(){
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";

        HashMap<Integer, String> order = new HashMap<Integer, String>();
        order.put(1, one);
        order.put(2, two);
        order.put(3, three);
        order.put(4, four);
        order.put(5, five);

        return order;
    }

    // Create a set of accessors for each of the fields in the following class.
    // Implement a fullName accessor that returns "lastName, firstName middleInitial"
    // How would you implement  a static "clone()" method on the following class that
    // returned a new immutable instance?

    public class Person{
        private String firstName;
        private  String middleName;
        private String lastName;
        private Date dateOfBirth;
        private String phoneNumber;

        public Person(){

        }

        public Person(String firstName, String middleName, String lastName, Date dateOfBirth, String phoneNumber){

            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.dateOfBirth = dateOfBirth;
            this.phoneNumber = phoneNumber;
        }
    }

    public void demonstrateCloneOfPersonClassImplementation(){

    }


}
