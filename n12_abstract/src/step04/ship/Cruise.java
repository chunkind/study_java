package step04.ship;

public class Cruise extends Ship {
	public Cruise() {}
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override
	public void sail(int distance) {
		setFuelTank(getFuelTank() - (distance * 13));
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel * 8));
	}
}