package strategypattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.swim();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
