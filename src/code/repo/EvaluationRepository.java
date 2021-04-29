package code.repo;

import code.accessor.Accessor;
import code.entity.CmsEntity;
import code.entity.Evaluation;
import code.entity.User;

import java.util.Comparator;
import java.util.List;

public class EvaluationRepository implements Repository<Evaluation>{
    private static final Accessor<Evaluation> EVALUATION_ACCESSOR = new Accessor<>(CmsEntity.EVALUATION);
    private static List<Evaluation> evaluations = EVALUATION_ACCESSOR.loadAll();

    @Override
    public List<Evaluation> findAll() {
        evaluations = EVALUATION_ACCESSOR.loadAll();
        return evaluations;
    }

    @Override
    public void addOne(Evaluation evaluation) {
        evaluations.add(evaluation);
        EVALUATION_ACCESSOR.saveAll(evaluations);
        evaluations = EVALUATION_ACCESSOR.loadAll();
    }

    @Override
    public Integer generateMaxId() {
        return evaluations.stream()
                .max(Comparator.comparingInt(Evaluation::getId))
                .get()
                .getId();
    }

    @Override
    public void retrieveAll() {
        System.out.println("not support");
    }
}
