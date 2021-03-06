package com.androidweb.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class TaskAssign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //任务创建者用户ID
    private Integer creatorId;
    //被分配者用户ID
    private Integer assigneeId;
    //任务的标题
    private String taskTitle;
    //任务的具体内容
    private String taskContent;
    private Date taskCreateTime;
    private Date taskFinishTime;
    //用于标记该任务是否完成,完成则为1,未完成则为0
    private Integer status;


}
