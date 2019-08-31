package com.wp.hrm;

import com.wp.hrm.domain.Systemdictionaryitem;
import com.wp.hrm.service.ISystemdictionaryitemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SysManage9001Application.class)
public class SystemTest {
    @Autowired
    private ISystemdictionaryitemService systemdictionaryitemService;

    @Test
    public void test() throws Exception {
        for (Systemdictionaryitem systemdictionaryitem : systemdictionaryitemService.selectList(null)) {
            System.out.println(systemdictionaryitem);

        }
        
    }
}
