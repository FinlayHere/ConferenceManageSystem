package code.entity;

import code.transfer.EntityPrinter;
import code.transfer.TransferToCsvLine;

import java.time.LocalDate;
import java.util.List;

public class Paper implements TransferToCsvLine, EntityPrinter {

    private Integer id;
    private Integer authorId;
    private Integer conferenceId;
    private String topic;
    private String name;
    private LocalDate submitTime;
    private String format;
    private String state;
    private List<Evaluation> evaluations;


    @Override
    public String getUserLine() {
        return String.format("id : %d, authorId : %d, conferenceId : %d, name : %s, topic : %s, submitDate : %s," +
                " format : %s, state : %s", id, authorId, conferenceId, topic, name, submitTime.toString(), format, state);
    }

    @Override
    public String toCsvLine() {
        return String.format("%d,%d,%d,%s,%s,%s,%s,%s", id, authorId, conferenceId, topic, name, submitTime.toString(), format, state);
    }
}
