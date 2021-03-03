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

    public List<String> returnStringsAsMapInGuaranteedNumericalKeyOrder(){
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";

        return Arrays.asList("");
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
