package PC;

public class Case {

        private String brand;
        private Dimension dimension; //width, height, depth
        private String color;
        private String typeOfBatteries;

        public Case(String brand, Dimension dimension, String color, String typeOfBatteries) {
            this.brand = brand;
            this.dimension = dimension;
            this.color = color;
            this.typeOfBatteries = typeOfBatteries;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public Dimension getDimension() {
            return dimension;
        }

        public void setDimension(Dimension dimension) {
            this.dimension = dimension;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getTypeOfBatteries() {
            return typeOfBatteries;
        }

        public void setTypeOfBatteries(String typeOfBatteries) {
            this.typeOfBatteries = typeOfBatteries;
        }

        @Override
        public String toString() {
            return "Case{" +
                    "brand='" + brand + '\'' +
                    ", dimension=" + dimension +
                    ", color='" + color + '\'' +
                    ", typeOfBatteries='" + typeOfBatteries + '\'' +
                    '}';
        }
    }


