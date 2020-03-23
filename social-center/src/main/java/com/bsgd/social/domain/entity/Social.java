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
@Table(name = "t_social")
public class Social {
    /**
     * id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 发布人编号
     */
    @Column(name = "publisher_id")
    private String publisherId;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 发布人名称
     */
    @Column(name = "publisher_name")
    private String publisherName;

    /**
     * 图像
     */
    private String photo;

    /**
     * 地址
     */
    private String address;

    /**
     * 发布人头像
     */
    @Column(name = "publisher_photo")
    private String publisherPhoto;

    /**
     * 状态 0删除1正常
     */
    private Integer status;

    /**
     * 内容 json格式
     */
    @Column(name = "publish_content")
    private String publishContent;
}