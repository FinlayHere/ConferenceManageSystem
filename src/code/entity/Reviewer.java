package code.entity;

import code.repo.EvaluationRepository;
import code.repo.PaperRepository;

import java.util.Scanner;

public class Reviewer extends User {
    private final EvaluationRepository evaluationRepository = new EvaluationRepository();

    public void markPaper(Paper paper) {
        Scanner input=new Scanner(System.in);
        System.out.println("Current paper is" + paper.getEntityLine());
        System.out.println("Please give score: ");
        Integer score = input.nextInt();
        evaluationRepository.addOne(new Evaluation(evaluationRepository.generateMaxId(), paper.getId(), this.getId(), score));
        System.out.println("Add evaluation successfully");
    }
}
