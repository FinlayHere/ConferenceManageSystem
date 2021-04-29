package code.entity;

import code.transfer.*;

public enum CmsEntity {
    USER("user.csv", new UserTransfer(), "id,email,password,role"),
    PAPER("paper.csv", new PaperTransfer(), "id,authorId,conferenceId,topic,name,submitTime,format,state"),
    CONFERENCE("conference.csv", new ConferenceTransfer(), "id,title,deadline"),
    EVALUATION("evaluation.csv", new EvaluationTransfer(), "id,authorId,reviewerId,score");
    private String fileName;
    private Transferable transfer;
    private String fileTitle;

    CmsEntity(String fileName, Transferable transfer, String fileTitle) {
        this.fileName = fileName;
        this.transfer = transfer;
    }

    public String getFileName() {
        return fileName;
    }

    public Transferable getTransfer() {
        return transfer;
    }

    public String getFileTitle() {
        return fileTitle;
    }
}
