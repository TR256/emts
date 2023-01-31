package com.emts.service.impl.question;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emts.dao.question.QueSingleChoiceMapper;
import com.emts.model.question.QueSingleChoice;
import com.emts.service.question.IQueSingleChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: tr256
 * @time: 2023/1/29
 */
@Service
public class QueSingleChoiceServiceImpl extends ServiceImpl<QueSingleChoiceMapper, QueSingleChoice> implements IQueSingleChoiceService {

    @Autowired
    private QueSingleChoiceMapper singleChoiceMapper;
}
