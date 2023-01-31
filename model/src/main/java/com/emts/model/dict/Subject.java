package com.emts.model.dict;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: tr256
 * @time: 2023/1/29
 */
@Data
@TableName("td_subject")
public class Subject {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String description;
}
