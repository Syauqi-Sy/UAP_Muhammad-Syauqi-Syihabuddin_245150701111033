public class KumpulanCLass {
}

class Torus extends Shape implements ThreeDimensional, ShippingCostCalculator, MassConverter, MassCalculable, PiRequired {
    private double majorRadius;
    private double minorRadius;

    public Torus() {
        this.majorRadius = 0;
        this.minorRadius = 0;
    }

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return 2 * Math.pow(PI, 2) * majorRadius * Math.pow(minorRadius, 2);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.pow(PI, 2) * majorRadius * Math.pow(minorRadius, 2);
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume              : " + getVolume());
        System.out.println("Luas permukaan      : " + getSurfaceArea());
        System.out.println("Massa               : " + getMass());
        System.out.println("Massa (dalam kg)    : " + gramToKilogram());
        System.out.println("Biaya kirim         : Rp" + calculateCost());
    }

    @Override
    public double gramToKilogram() {
        return Math.ceil(getMass() / DENOMINATOR);
    }

    @Override
    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }
}

class Sphere extends Shape implements ThreeDimensional, ShippingCostCalculator, MassConverter, MassCalculable, PiRequired {
    private double radius;

    public Sphere() {
        this.radius = 0;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4 * PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * Math.pow(radius, 3);
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume              : " + getVolume());
        System.out.println("Luas permukaan      : " + getSurfaceArea());
        System.out.println("Massa               : " + getMass());
        System.out.println("Massa (dalam kg)    : " + gramToKilogram());
        System.out.println("Biaya kirim         : Rp" + calculateCost());
    }

    @Override
    public double gramToKilogram() {
        return Math.ceil(getMass() / DENOMINATOR);
    }

    @Override
    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }
}
