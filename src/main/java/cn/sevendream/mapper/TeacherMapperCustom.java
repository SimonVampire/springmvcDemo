package cn.sevendream.mapper;


import cn.sevendream.entity.PagingVO;
import cn.sevendream.entity.TeacherCustom;

import java.util.List;

/**
 * Created by Jacey on 2017/6/29.
 */
public interface TeacherMapperCustom {

    //分页查询老师信息
    List<TeacherCustom> findByPaging(PagingVO pagingVO) throws Exception;

    //获取
}
