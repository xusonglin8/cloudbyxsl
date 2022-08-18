package com.atxsl.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xusonglin
 * @date 2020/9/22 - 15:26
 */
@Data
public class Payment implements Serializable {
    private String id;
    private String serial;

}
