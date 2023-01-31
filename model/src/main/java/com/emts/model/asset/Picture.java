package com.emts.model.asset;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: tr256
 * @time: 2023/1/29
 */
@Data
@TableName("tf_picture")
public class Picture {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Byte[] picture;

    @TableField("create_time")
    private String createTime;

    @TableField("create_by")
    private String createBy;

    @TableField("update_time")
    private String updateTime;

    @TableField("update_by")
    private String updateBy;
}
