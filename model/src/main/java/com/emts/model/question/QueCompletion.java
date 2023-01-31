package com.emts.model.question;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import javax.security.auth.Subject;

/**
 * @author: tr256
 * @time: 2023/1/28
 */
public class QueCompletion extends Question{

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("subject_id")
    private Long subjectId;

    private String problem;

    private String correct;

    @TableField("ignore_order")
    private Boolean ignoreOrder;

    private String analysis;

    @TableField("picture_id")
    private Long pictureId;

    @TableField("create_time")
    private String createTime;

    @TableField("create_by")
    private String createBy;

    @TableField("update_time")
    private String updateTime;

    @TableField("update_by")
    private String updateBy;
}
