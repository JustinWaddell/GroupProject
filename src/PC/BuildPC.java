package PC;

public class BuildPC {
    public static void main(String[] args) {


        Case pcCase = new Case("Something", new Dimension(20, 40, 30), "black", "Double A");
        Resolution resolution = new Resolution(20, 30);
        Size size = new Size(20, 40, 60);
        Motherboard motherboard = new Motherboard("Something else", 40, size, 4);
        Monitor myMonitor = new Monitor("Coolname ", resolution, 4);
        PC MyPC = new PC(pcCase, myMonitor, motherboard);
        System.out.println(MyPC);
    }
}
