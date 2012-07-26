
public class CallerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainFactory mfE = new ElevFactoy();
		ElevPart elev = mfE.createPart();
		Door eDoor = mfE.createDoor();
		
		MainFactory mfF = new FloorFactory();
		ElevPart floor = mfF.createPart();
		Door fDoor = mfF.createDoor();
			
	}

}
