package assign8_3;

public class CarParking {

	public static final int FLOORS = 5;// constant variable to hold no of
												// floors
	public static final int SLOTS = 2;// constant variable to hold no of slots
	public static int slotIndex = 1;// static variable to create unique
									// parking slot
	KvStore kvstore[];// array of KeyValueMap objects

	/* constructor to initialize array of KeyValueMapObjects */
	// Default constructor
	public CarParking() {
		kvstore = new KvStore[FLOORS];// Initializing array with no of
												// floors
		for (int i = 0; i < kvstore.length; i++) {
			kvstore[i] = new KvStore(SLOTS);// constructing keyValueMap												// Object for every floor with
												// slot size
		}
	}

	/* Parameterized constructor with no of floors and slots */
	public CarParking(int floors, int slot) {
		kvstore = new KvStore[floors];// Initializing array with no of
											// floors
		for (int i = 0; i < kvstore.length; i++) {
			kvstore[i] = new KvStore(slot);// constructing keyValueMap
												// Object for every floor with												// slot size
		}
	}

	/* method to print available place */
	/*
	 * For every floor check whether its empty by calling isEmpty of keyValueMap
	 * if its empty it prints the floor i.e.,empty
	 * else it will call showSpaceAvailable() of KeyValueMap which returns no of
	 * space available.	 
	 *
	 */
	public void showAvailableParkingFloors() {

		for (int i = 0; i < kvstore.length; i++) {
			int count = 0;
			if (kvstore[i].isEmpty()) {
				System.out.println("All slots are Free!!! in Floor " + (i + 1));

			} else {

				count = kvstore[i].showSpaceAvailabile();
				System.out.println(count + " number of Parking is available in " + (i + 1) + " floor");
			}
		}
	}

	/*
	 * @param : String CarNumber	 * For every floor check whether the space available if yes
	 * it parks car by calling put(key,value) of KeyValueMap in first slot of
	 * that floor
	 * so the car gets Park in the 1st floor if space available there else in
	 * second floor so on..
	 * until a floor gets filled up all cars are parked in that floor once its
	 * filled it moves to next floor
	 */
	public void parkACar(String CarNumber) {
		String parkingSlot = "slot" + slotIndex++;
		boolean flag = false;
		for (int i = 0; i < kvstore.length; i++) {
			// Object[] keySet = kvstore[i].getKeySet();
			while (kvstore[i].key.size() < kvstore[i].capacity) {
				kvstore[i].put(CarNumber, parkingSlot);
				flag = true;
				break;
			}

			if (flag) {
				break;
			}

		}

	}

	/* method to print slot number of a Car */
 	/*
	 * @param : String CarNumber
	 * loops through all slots of every floor and finds for the CarNumber as key
	 * using get(key) of KeyMapValue
	 * and prints the floor n slot number
	 */
	public void getACar(String CarNumber) {
		for (int i = 0; i < kvstore.length; i++) {
			String value = kvstore[i].get(CarNumber);			
			if (value != null) {
				System.out.println("Car " + CarNumber + " is placed at " + (i + 1) + " Floor in slot number:" + kvstore[i].get(CarNumber));				break;
			} else {
				continue;
			}
		}

	}

	public static void main(String arg[]) {

		CarParking cp = new CarParking(3, 4);


		cp.showAvailableParkingFloors();

		cp.parkACar("Bnz001");
		cp.parkACar("Zgr009");
		cp.parkACar("BMW003");
		cp.parkACar("Aud004");
		cp.parkACar("Skd005");

		cp.getACar("car001");
		cp.getACar("car002");		
		cp.getACar("car003");
		cp.getACar("car005");

		cp.showAvailableParkingFloors();

	}

} 
