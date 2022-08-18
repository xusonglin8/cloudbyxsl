package com.atxsl.springcloud.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author xusonglin
 * @date 2020/9/22 - 15:26
 */
@Entity
@Data
@Table(name = "payment")
public class Payment implements Serializable {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "serial")
    private String serial;


}
