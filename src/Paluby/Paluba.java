package Paluby;


import container.Container;
import container.CylinderContainer;
import container.KonusContainer;
import container.SquareContainer;

public class Paluba {


    public Paluba(Container bigCon, Container bigCon1) {
        this.bigCon = bigCon;
        this.bigCon1 = bigCon1;
    }

    Container bigCon;
    Container bigCon1;

    public Paluba(Container smallCon, Container smallCon1, Container smallCon2, Container smallCon3) {
        this.smallCon = smallCon;
        this.smallCon1 = smallCon1;
        this.smallCon2 = smallCon2;
        this.smallCon3 = smallCon3;
    }

    Container smallCon;
    Container smallCon1;
    Container smallCon2;
    Container smallCon3;


}









