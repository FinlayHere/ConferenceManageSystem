package code.entity;

import code.repo.EvaluationRepository;
import java.util.Scanner;

public class Reviewer extends User {
		
		public Reviewer(Integer id, String email, String password, String role) {
				super(id, email, password, role);
		}
		
		public Reviewer() {
		}
		
		private final EvaluationRepository evaluationRepository = new EvaluationRepository();
		
		public void markPaper(Paper paper) {
				Scanner input = new Scanner(System.in);
				System.out.println("Current paper is" + paper.getEntityLine());
				System.out.println("Please give score: ");
				Integer score = input.nextInt();
				evaluationRepository.addOne(
						new Evaluation(evaluationRepository.generateMaxId(), paper.getId(), this.getId(),
								score));
				System.out.println("Add evaluation successfully");
		}
}
