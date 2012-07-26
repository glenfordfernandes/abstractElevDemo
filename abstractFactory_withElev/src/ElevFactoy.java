
public class ElevFactoy implements MainFactory {

	@Override
	public ElevPart createPart() {
		// TODO Auto-generated method stub
		return new Elevator();
	}

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new ElevDoor();
	}

	

	

}
