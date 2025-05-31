public interface KumpulanInterface {
      interface ShippingCostCalculator {
        int PRICE_PER_KG = 2000;
    
        public double calculateCost();
    }
    
    interface MassConverter {
        int DENOMINATOR = 1000;
    
        public double gramToKilogram();
    }
    
    interface MassCalculable {
        int DENSITY = 8;
        double THICKNESS = 0.5;
    
        public double getMass();
    }
    
    interface PiRequired {
        double PI = 22.0 / 7.0;
    }
    
    interface ThreeDimensional {
        public double getSurfaceArea();
        public double getVolume();
    }
}
