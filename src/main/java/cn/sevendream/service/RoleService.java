package cn.sevendream.service;

import cn.sevendream.entity.Role;

/**
 *  Role 权限表Service层
 */
public interface RoleService {

    Role findByid(Integer id) throws Exception;

}
