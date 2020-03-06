package com.example.simpleweb.domain;
import javax.persistence.*;

@Entity(name="Message") // This tells Hibernate to make a table out of this class
public class Message {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
@Column
    private String text;

    public Message(String text,String tag) {
        this.text = text;
        this.tag=tag;

    }

     public Message()
     {

     }
  @Column
    private String tag;
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
