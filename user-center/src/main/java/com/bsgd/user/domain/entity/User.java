package com.bsgd.user.domain.entity;

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
@Table(name = "t_user")
public class User {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户昵称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户地址
     */
    private Date address;

    /**
     * 用户账号
     */
    private String account;

    /**
     * 更新时间 最后登录时间
     */
    @Column(name = "last_time")
    private Date lastTime;

    /**
     * 用户密码
     */
    private String pwd;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 用户头像
     */
    @Column(name = "head_portrait")
    private String headPortrait;

    /**
     * 认证等级 根据设备数量来分等级
     */
    private Integer attestation;

    /**
     * 用户类型 1生产用户2消费用户
     */
    private Integer type;

    /**
     * 手机号
     */
    private Integer tel;

    /**
     * 用户姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 用户手持身份证照
     */
    private String potho;

    /**
     * 用户身份证号
     */
    @Column(name = "card_id")
    private String cardId;

    /**
     * 用户证件
     */
    private String permit;

    /**
     * 用户实名状态 0未认证1未审核2审核未通过3已认证
     */
    @Column(name = "is_real_name")
    private Integer isRealName;

    /**
     * 状态 0删除1正常
     */
    private Integer status;
}