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

    public Paper(Integer id, Integer authorId, Integer conferenceId, String topic, String name, LocalDate submitTime, String format, String state) {
        this.id = id;
        this.authorId = authorId;
        this.conferenceId = conferenceId;
        this.topic = topic;
        this.name = name;
        this.submitTime = submitTime;
        this.format = format;
        this.state = state;
    }

    public Paper() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(Integer conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(LocalDate submitTime) {
        this.submitTime = submitTime;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    @Override
    public String getEntityLine() {
        return String.format("id : %d, authorId : %d, conferenceId : %d, name : %s, topic : %s, submitDate : %s," +
                " format : %s, state : %s", id, authorId, conferenceId, topic, name, submitTime.toString(), format, state);
    }

    @Override
    public String toCsvLine() {
        return String.format("%d,%d,%d,%s,%s,%s,%s,%s", id, authorId, conferenceId, topic, name, submitTime.toString(), format, state);
    }
}
