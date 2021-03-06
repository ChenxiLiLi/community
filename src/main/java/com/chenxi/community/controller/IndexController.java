package com.chenxi.community.controller;

import com.chenxi.community.dto.PaginationDTO;
import com.chenxi.community.dto.QuestionDTO;
import com.chenxi.community.service.NotificationsService;
import com.chenxi.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Mr.Chen
 * @Description: 首页控制器
 * @Date:Created in 14:20 2020/3/1
 */
@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(@RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "pageSize", defaultValue = "5") Integer pageSize,
                        @RequestParam(name = "search",  required = false) String search,
                        Model model) {
        //展示首页问题列表
        PaginationDTO<QuestionDTO> paginationDTO = questionService.getPaginationDTOList(search, page, pageSize, false);
        model.addAttribute("pagination1", paginationDTO);
        model.addAttribute("search", search);
        return "index";
    }
}
