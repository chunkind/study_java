package step04.ship;

public abstract class Ship {
	protected int fuelTank;	//연료 탱크
	protected String shipName; //배이름

	public Ship(){}
	public Ship(String shipName, int fuelTank) { // 타입과 순서는 중요..
		super();
		this.fuelTank = fuelTank;
		this.shipName = shipName;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	@Override
	public String toString() {
		if(this instanceof Boat){
			return " " + shipName + "\t\t" + fuelTank;
		}else{
			return " " + shipName + "\t" + fuelTank;
		}
	}

	public abstract void sail(int dist);
	public abstract void refuel(int fuel);
}