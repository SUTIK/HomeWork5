package container;

public abstract class Container {
    private int height;
    private boolean  isBig;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(this.height<10 & this.height<100){
        this.height=height;
        }
        else {

            System.out.println("Значение должно быть от 10 до 100");
        }
    }

    public boolean isBig() {
        return isBig;
    }

    public void setBig(boolean big) {
        isBig = big;
    }

    public Container(int height, boolean isBig) {
        this.height = height;
        this.isBig = isBig;
    }

    public abstract double getMass();

}


