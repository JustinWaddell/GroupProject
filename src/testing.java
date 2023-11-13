public class testing {
    public class Conductor {


        public static class Moving {
            int groups;

            public Moving(int groups) {
                this.groups = groups;
                System.out.print("#" + this.groups + "-");
            }

            public void down() {
                this.groups /= 2;
                System.out.print("#" + this.groups + "-");
            }

            public void join() {
                this.groups *= 2;
                System.out.print("#" + this.groups + "-");
            }
        }

        public class OO {
            public static void main(String[] args) {
                Moving fleet = new Moving(10);
                fleet.groups -= 2;
                fleet.join();
                System.out.print(fleet.groups + "-");
            }
        }
    }
}