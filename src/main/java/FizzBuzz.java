
public class FizzBuzz {
    public String execute(Integer number) {
        String output = null;

        switch(number){
            case 1:
            output = "1";
            break;
            case 2:
            output = "2";
            break;
            case 3:
            output = "Fizz";
            break;
        }


        return output;
    }
}
