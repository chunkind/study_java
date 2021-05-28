package stream.object.step3;

import java.util.ArrayList;

public class CarServiceTest3 {
	public static void main(String[] args) throws Exception {
		String path = "src/kostaObj\\serial\\list.obj";
		CarService service = new CarService();
		ArrayList<Car> list = new ArrayList<Car>();

		list.add(new Car("아우디", 6000, "white"));
		list.add(new Car("렉서스", 3500, "black"));
		list.add(new Car("소나타", 4000, "red"));

		service.ouputCar(path, list);
		System.out.println("list를 list.obj 파일에 저장했습니다.. 직렬화");
		System.out.println("=======================================");

		ArrayList<Car> returnlist = service.inputCar(path);
		for (Car c : returnlist) {
			System.out.println("Model of the Car ::" + c.getModel());
		}

	}
}
