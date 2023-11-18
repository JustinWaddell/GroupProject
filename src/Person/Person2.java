package Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Person2 {
        //two attributes - name and age

        private String name;
        private int age;

        public Person2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " is " +  age + " years old.";
        }
    }


    class AgeTester{
        //start from here 11/10
        public static int[] findingAgeArrays(ArrayList<Person2> list){

//      int[] x = {1,2,3,4};
//      int[] y = new int[4];
//      int[] zs = new int[] {1,2,3,4};


            int maxValue = 0;
            int minValue = list.get(0).getAge();
            //loop
            //if

            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getAge() > maxValue)
                    maxValue = list.get(i).getAge();

                if(list.get(i).getAge() < minValue){
                    minValue = list.get(i).getAge();
                }
            }
//            int[] result = new int[2];
//                result[0] = maxValue;
//                result[1] = minValue;
//
//                return result;

            return new int[]{minValue, maxValue};


        }


        public static void main(String[] args) {
            ArrayList<Person2> list = new ArrayList<>();
            Person2 p1 = new Person2("Alice",34);
            list.add(p1);

            list.add(new Person2("Sam",100));

            list.add(new Person2("Sultan",102));
            list.add(new Person2("Nicholas",85));
            System.out.println(Arrays.toString( findingAgeArrays(list)));


        }




}
