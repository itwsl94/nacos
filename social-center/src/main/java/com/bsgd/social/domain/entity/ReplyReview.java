package com.bsgd.social.domain.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
@Table(name = "t_reply_review")
public class ReplyReview {
    /**
     * id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 回复人
     */
    @Column(name = "reply_name")
    private String replyName;

    /**
     * 回复人头像
     */
    @Column(name = "reply_photo")
    private String replyPhoto;

    /**
     * 评论人名称
     */
    @Column(name = "review_name")
    private String reviewName;

    /**
     * 回复内容
     */
    @Column(name = "reply_content")
    private String replyContent;

    /**
     * 评论编号
     */
    @Column(name = "review_id")
    private Integer reviewId;

    /**
     * 状态 0删除1正常
     */
    private Integer status;
}