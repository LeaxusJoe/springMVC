package com.leaxus.spring.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by leaxus on 2016/9/28.
 */

//region = pojoCache，表示：指定缓存的区域，这个是配置在 ehcache.xml 中
//CacheConcurrencyStrategy 资料可以看：http://www.iteye.com/problems/49111
//READ_WRITE：严格读写缓存。用于对数据同步要求严格的情况，对于经常被读、较少修改的数据，可以采用此策略缓存。不支持分布式缓存。实际应用最广泛的缓存策略。

@Entity
@Table(name = "member")
public class Member {
    @Id
    @GenericGenerator(name = "IdentifierGenerator", strategy = "identity")
    @GeneratedValue(generator = "IdentifierGenerator")

    @Column(name = "uid", nullable = false)
    private Long uid;

    @Column(name = "employee_id", nullable = false)
    private String employee_id;

    @Column(name = "nick_name", nullable = false)
    private String nickName;

    @Column(name = "status", nullable = false)
    private String status;

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Member{" +
                "employee_id='" + employee_id + '\'' +
                ", uid=" + uid +
                ", nickName='" + nickName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
