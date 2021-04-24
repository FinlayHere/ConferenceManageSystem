package code.transfer;

import code.entity.Paper;

public class PaperTransfer implements Transferable<Paper>{
    @Override
    public PaperTransfer getTransfer() {
        return new PaperTransfer();
    }

    @Override
    public Paper toObjectBy(String[] info) {
        return null;
    }

    @Override
    public String toStringBy(Paper entity) {
        return null;
    }
}
