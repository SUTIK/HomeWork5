package container;

public class CylinderContainer extends Container {


    public CylinderContainer(int height, boolean isBig) {
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

        double vCylinder=getHeight()*Math.PI*Math.pow(radiusOsnovania,2);
        double mass = vCylinder*1000;
        return mass;
    }
}
