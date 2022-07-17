package com.ll.exam;

import java.util.Map;

public class WiseSaying {
    int id;
    String content;
    String author;

    public WiseSaying(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public WiseSaying(Map<String, Object> map) {
        this.id = (int) map.get("id"); //Object 타입이라 형변환 해줘야됨.
        this.content = (String) map.get("content"); //Object 타입이라 형변환 해줘야됨.
        this.author = (String) map.get("author"); //Object 타입이라 형변환 해줘야됨.
    }

    @Override
    public String toString() {
        return "WiseSaying{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String toJson() {
        return """
                {
                    "id": %d,
                    "content": "%s",
                    "author": "%s"
                }
                """
                .stripIndent()
                .formatted(id, content, author)
                .trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if( o instanceof  WiseSaying == false) return false;

        WiseSaying other = (WiseSaying) o;

        if( this.id !=other.id) return false;
        if( this.content.equals(other.content) == false) return false;
        if( this.author.equals(other.author) == false) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}