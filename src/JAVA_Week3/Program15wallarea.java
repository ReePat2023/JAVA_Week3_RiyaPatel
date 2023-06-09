package JAVA_Week3;

public class Program15wallarea {

        double width;
        double height;

        public Program15wallarea() {

        }

        public Program15wallarea(double width, double height) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getWidth() {
            return width;
        }


        public double getHeight() {
            return height;
        }


        public void setWidth(double width) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
        }

        public void setHeight(double height) {
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getArea() {
            return (getHeight() * getWidth());
        }

        //Main Method
        public static void main(String[] args) {
            Program15wallarea wall = new Program15wallarea(5, 4);
            System.out.println("area= " + wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());
        }
    }

