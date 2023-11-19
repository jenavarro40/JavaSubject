
public class CreateSpaService {

	public static void main(String[] args) {
		SpaService service = new SpaService();
		service.setServiceDescription("facial");
		service.setPrice(28.95);

		service = null;
		System.out.println(service.getServiceDescription() + ": $" + service.getPrice());

	}

}
