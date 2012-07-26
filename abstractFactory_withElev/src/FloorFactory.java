
public class FloorFactory implements MainFactory {

	@Override
	public ElevPart createPart() {
		// TODO Auto-generated method stub
		return new Floor();
	}

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new FloorDoor();
	}

	
	
}
