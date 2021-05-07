package code.entity;

public class Chair extends User {
		
		public Chair(Integer id, String email, String password, String role) {
				super(id, email, password, role);
		}
		
		public Chair() {
		}
		
		public void sendNotification(Author author) {
				System.out.println("send notification");
		}
}
