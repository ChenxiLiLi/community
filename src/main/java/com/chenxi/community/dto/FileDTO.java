package com.chenxi.community.dto;

import lombok.Data;

/**
 * @Author: Mr.Chen
 * @Description:
 * @Date:Created in 20:45 2020/3/29
 */
@Data
public class FileDTO {
    /**
     *  0 表示上传失败，1 表示上传成功
     */
    private Integer success;
    /**
     * 提示信息，上传成功或上传失败及错误信息等
     */

    private String message;
    /**
     * 文件地址，上传成功时才返回
     */
    private String url;
}
