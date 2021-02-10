import Paluby.Paluba;
import container.Container;
import container.CylinderContainer;
import container.KonusContainer;
import container.SquareContainer;

public class Main {
    public static void main(String[] args) {



     Container bigCon1 = new KonusContainer(12,true);
     Container bigCon2 = new CylinderContainer(15,true);

     Container smallCon =new SquareContainer(50,false);
     Container smallCon1 =new SquareContainer(34,false);
     Container smallCon2 =new SquareContainer(65,false);
     Container smallCon3 =new SquareContainer(23,false);


     Paluba pal = new Paluba(bigCon1,bigCon2);
     Paluba pal1 = new Paluba(smallCon1,smallCon2,smallCon3,smallCon);







    }
}
