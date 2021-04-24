package code.entity;

import code.transfer.EntityPrinter;
import code.transfer.TransferToCsvLine;

public class Conference implements TransferToCsvLine, EntityPrinter {
    private Integer id;
    private String title;

    public Conference(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Conference() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getEntityLine() {
        return null;
    }

    @Override
    public String toCsvLine() {
        return String.format("%n,%s", id, title);
    }
}
