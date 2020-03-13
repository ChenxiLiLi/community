package com.chenxi.community.service;

import com.chenxi.community.dto.PaginationDTO;
import com.chenxi.community.dto.QuestionDTO;

/**
 * @Author: Mr.Chen
 * @Description:
 * @Date:Created in 15:04 2020/3/9
 */
public interface QuestionService {
    /**
     * 该方法用来获取展示到前端的页面元素
     * @param accountId Github用户的唯一标识
     * @param page 当前页码
     * @param pageSize 总页数
     * @return 页面元素的集合
     */
    PaginationDTO getPaginationDTOList(String accountId, Integer page, Integer pageSize);

    /**
     * 通过Question的ID来查询Question对象
     * @param id Question的唯一标识
     * @return QuestionDTO对象
     */
    QuestionDTO getQuestionById(Integer id);
}
