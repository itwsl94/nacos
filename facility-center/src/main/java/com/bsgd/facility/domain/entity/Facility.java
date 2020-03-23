package com.bsgd.facility.domain.entity;

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
@Table(name = "t_facility")
public class Facility {
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
     * 设备唯一标识码
     */
    private String facility;

    /**
     * 是否在线
     */
    @Column(name = "is_online")
    private Integer isOnline;

    /**
     * 用户人id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 设备类型id
     */
    @Column(name = "facility_type")
    private Integer facilityType;

    /**
     * 设备绑定时间
     */
    @Column(name = "binding_time")
    private Date bindingTime;

    /**
     * 状态 0删除1正常
     */
    private Integer status;
}