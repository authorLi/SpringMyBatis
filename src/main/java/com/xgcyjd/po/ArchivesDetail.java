
package com.xgcyjd.po;

public class ArchivesDetail
{
    private int id;
    private int author;
    private String title;
    private String content;
    private String accessory;
    private int state;
    private String receiver;

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "ArchivesDetail{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", accessory='" + accessory + '\'' +
                ", state=" + state +
                ", receiver='" + receiver + '\'' +
                '}';
    }

    public ArchivesDetail()
    {
    }

    public ArchivesDetail(int id, int state)
    {
        this.id = id;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
