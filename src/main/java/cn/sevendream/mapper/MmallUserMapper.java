package cn.sevendream.mapper;


import cn.sevendream.entity.MmallUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MmallUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MmallUser record);

    MmallUser selectByPrimaryKey(Integer id);

    List<MmallUser> selectAll(@Param("offset") int offset, @Param("limit") int limit);

    int updateByPrimaryKey(MmallUser record);
}