package code.entity;

import code.transfer.PaperTransfer;
import code.transfer.Transferable;
import code.transfer.UserTransfer;

public enum CmsEntity {
    USER("user.csv", new UserTransfer(), "id,email,password,role"),
    PAPER("paper.csv", new PaperTransfer(), "id,authorId,conferenceId,topic,name,submitTime,format,state");
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
