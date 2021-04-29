package code.transfer;

public class EvaluationTransfer implements Transferable {
    @Override
    public Transferable getTransfer() {
        return new EvaluationTransfer();
    }

    @Override
    public Object toObjectBy(String[] info) {
        return null;
    }

    @Override
    public String toStringBy(Object entity) {
        return null;
    }
}
