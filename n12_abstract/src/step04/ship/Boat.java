package step04.ship;

public class Boat extends Ship {
	public Boat() {}
	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override
	public void sail(int distance) {
		setFuelTank(getFuelTank() - (distance * 10));
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel * 10));
	}
}