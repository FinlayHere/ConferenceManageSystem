package code.transfer;

import code.entity.Paper;

import java.time.LocalDate;

public class PaperTransfer implements Transferable<Paper>{
    @Override
    public PaperTransfer getTransfer() {
        return new PaperTransfer();
    }

    @Override
    public Paper toObjectBy(String[] info) {
        return new Paper(Integer.parseInt(info[0]), Integer.parseInt(info[1]), Integer.parseInt(info[2]),
                info[3],info[4], LocalDate.parse(info[5]), info[6], info[7]);
    }

    @Override
    public String toStringBy(Paper paper) {
        return paper.toCsvLine();
    }
}
