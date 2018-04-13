package cn.sevendream.mapper;

import cn.sevendream.BaseTest;
import cn.sevendream.entity.MmallUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MmallUserMapperTest extends BaseTest {
    @Autowired
    private MmallUserMapper mmallUserMapper;
    @Test
    public void selectAllTest(){
        List<MmallUser> list = mmallUserMapper.selectAll(0,2);
        if (null != list && list.size() > 0) {
            for (MmallUser user : list) {
                System.out.println(user.toString());
            }
        }
    }
}
