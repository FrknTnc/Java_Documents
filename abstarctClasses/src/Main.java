public class Main {

    public static void main(String[] args) {


        GameCalculator[] calculators = new GameCalculator[]{new ManGameCalculator(),new WomanGameCalculator(),new ChildrenGameCalculator()};

        for(GameCalculator calculator:calculators)
            calculator.hesapla();

        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.hesapla();

        ChildrenGameCalculator childrenGameCalculator = new ChildrenGameCalculator();
        childrenGameCalculator.hesapla();
        childrenGameCalculator.gameOver();
        manGameCalculator.gameOver();


    }
}
