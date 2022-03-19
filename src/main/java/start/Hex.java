package start;

public class Hex {

	private Resource resource;
	private int token;
	private boolean robber;

	public Hex(Resource resource, int token){
		this.resource = resource;
		this.token = token;

		if (resource == Resource.Nothing){
			robber = true;
		}
	}

	@Override
	public String toString() {
		return "Hex{" + "resource=" + resource + ", token=" + token + ", robber=" + robber + '}';
	}
}
