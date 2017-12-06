import cn.edu.whu.impl.DefaultServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import cn.edu.whu.service.DefaultService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created by Administrator on 2017/12/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class schoolClient {
    @Autowired
    private DefaultService DefaultService;
    @Test
    public  void  main() throws IOException {
        String path="F:\\精准扶贫\\1021导数据库\\专题\\大学.xls";
        DefaultService.insertSchoolInfo(path);
        System.out.println("导入成功");
    }
}
