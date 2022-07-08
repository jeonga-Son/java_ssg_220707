package com.ll.exam;

public class WiseSaying {
    int id;
    String content;
    String author;
    //노출해야하는 것 빼고 모두 private으로!
    public WiseSaying(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return "|  " +
                id + "  |  " +
                 content + "  |  " +
                 author +
                "  |";
    }
}
