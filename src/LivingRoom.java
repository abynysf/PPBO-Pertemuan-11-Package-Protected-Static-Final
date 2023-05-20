public class LivingRoom extends Room {
    LivingRoom area;
    private double length;
    private double width;

    public LivingRoom(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Tidak bisa final
    public double area() {
        return length * width;
    }
}
