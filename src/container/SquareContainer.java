package container;

public class SquareContainer extends Container {

    public SquareContainer(int height, boolean isBig) {
        super(height, isBig);
    }

    @Override
    public double getMass() {

        double diagonal;
        if (isBig()){
            diagonal=20;
        }else {
            diagonal=10;
        }
        double a=diagonal*Math.sqrt(2)/2;//найдем сторону
        double vKvadrat = a*a*getHeight() ;//считаем обьем
        double mass=vKvadrat*1000;//обьем
       // System.out.println(mass);
        return mass;

    }

}































