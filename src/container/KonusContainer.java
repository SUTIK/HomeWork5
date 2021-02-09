package container;

public class KonusContainer extends Container {

    public KonusContainer(int height, boolean isBig) {
        super(height, isBig);
    }

    @Override
    public double getMass() {

        double radiusOsnovania;
        if (isBig()){
            radiusOsnovania=20/2;
        }else {
            radiusOsnovania=10/2;
        }

        double vKonus=getHeight()/3*Math.PI*Math.pow(radiusOsnovania,2);
        double mass = vKonus*1000;
        return mass;
    }
}
