package com.sparta.week04_hw_2.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Comment extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private String author;

    private String comment;

    private Long postId;

    public Comment(Long postId, String nickname, String comment) {
        this.postId = postId;
        this.author = nickname;
        this.comment = comment;

    }
}
