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
@Table(name = "t_review")
public class Review {
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
     * 发布人编号
     */
    @Column(name = "publisher_id")
    private Integer publisherId;

    /**
     * 评论人编号
     */
    @Column(name = "review_id")
    private Integer reviewId;

    /**
     * 评论人名称
     */
    @Column(name = "review_name")
    private String reviewName;

    /**
     * 评论人头像
     */
    @Column(name = "review_photo")
    private String reviewPhoto;

    /**
     * 评论内容
     */
    @Column(name = "review_content")
    private String reviewContent;

    /**
     * 社交编号
     */
    @Column(name = "social_id")
    private String socialId;

    /**
     * 状态 0删除1正常
     */
    private Integer status;
}