package PC;
/**
 * DELL OptiPlex 990 DT desktop motherboard CN-0VNP2H VNP2H 6D7TR LGA 1155 DDR3
 * Brand	Dell
 * CPU Socket	LGA 1155
 * Compatible Devices	Personal Computer
 * RAM Memory Technology	DDR3
 * Memory Clock Speed	1333 MHz
 * Platform	Windows
 * Memory Storage Capacity	4 GB
 * Memory Slots Available	2
 * S/PDIF Connector Type	Optical
 * System Bus Standard Supported	SATA 2
 * 15.94 x 13.11 x 2.05 inches
 */
public class Motherboard {
    private String brand;
    private int weight;
    private Size size;
    private int clockSpeed ;

    public Motherboard(String brand, int weight, Size size, int clockSpeed) {
        this.brand = brand;
        this.weight = weight;
        this.size = size;
        this.clockSpeed = clockSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                ", clockSpeed=" + clockSpeed +
                '}';
    }

}
