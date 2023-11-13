package OOP.FizzBuzz;

public class FizzBuzz {
    //start number
    //end number
    private int sn;
    private int en;
    // default constructor
    public FizzBuzz(){
        this.sn = sn;
        this.en=en;
    }

    //constructor taking sn and en
    public FizzBuzz(int sn, int en){
        //this.sn = sn;
        //this.en = en;

    }
    //getters


    public int getEn() {
        return en;
    }

    public int getSn() {
        return sn;
    }
    //setters

    public void setSn(int sn) {
        this.sn = sn;
    }

    public void setEn(int en) {
        this.en = en;
    }
    public void checkFizzBuzz(FizzBuzz fb){
      this.sn = fb .sn;
      this.en = fb.en;

        // value is multiple o 3 and 5 then it will print out FizzBuzz
        //value is divisible or multiple of 3, it will out fizz
        //value is divisble or multiple of 5, it will print buzz
        //otherwise it wil print out the number itself


        // you will have a starting number
        //the sn number will be increment by one
        //the sn number will be incremented
    }
}
    class FizzBuzzTester{

        public static void main(String[] args) {

        }
    }

