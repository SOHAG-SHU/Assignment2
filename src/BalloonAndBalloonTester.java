public class BalloonAndBalloonTester {
    public static void main(String[] args) {
        Balloon myBalloon = new Balloon();
        myBalloon.addAir(100);
        System.out.println("Volume of the balloon after adding 100 cm^3 of air: " + myBalloon.getVolume() + " cm^3");
        System.out.println("Surface area of the balloon after adding 100 cm^3 of air: " + myBalloon.getSurfaceArea() + " cm^2");
        System.out.println("Radius of the balloon after adding 100 cm^3 of air: " + myBalloon.getRadius() + " cm");
        myBalloon.addAir(100);
        System.out.println("\nVolume of the balloon after adding another 100 cm^3 of air: " + myBalloon.getVolume() + " cm^3");
        System.out.println("Surface area of the balloon after adding another 100 cm^3 of air: " + myBalloon.getSurfaceArea() + " cm^2");
        System.out.println("Radius of the balloon after adding another 100 cm^3 of air: " + myBalloon.getRadius() + " cm");
    }
}
