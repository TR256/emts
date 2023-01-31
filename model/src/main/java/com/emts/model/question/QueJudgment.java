package com.emts.model.question;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: tr256
 * @time: 2023/1/28
 */
@Data
@TableName("tq_judgment")
public class QueJudgment extends Question{

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("subject_id")
    private Long subjectId;

    private String problem;

    private Boolean correct;

    @TableField("option_t")
    private String optionT;

    @TableField("option_f")
    private String optionF;

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
