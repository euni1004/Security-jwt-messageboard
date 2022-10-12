package com.sparta.week04_hw_2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Post extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    private String author;

    private Long memberId;

    public Post(String title, String content, String nickname,Long memberId) {
        this.title = title;
        this.content = content;
        this.author = nickname;
        this.memberId = memberId;
    }

    public Post() {

    }

//    private List<Comment> comment;


}
