package cn.sevendream.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MmallUser implements Serializable {

    /**
     * mmall_user
     */
    private static final long serialVersionUID = 1L;
    /**
     * 用户表id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码，MD5加密
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 找回密码问题
     */
    private String question;

    /**
     * 找回密码答案
     */
    private String answer;

    /**
     * 角色0-管理员,1-普通用户
     */
    private Integer role;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后一次更新时间
     */
    private Date updateTime;


}