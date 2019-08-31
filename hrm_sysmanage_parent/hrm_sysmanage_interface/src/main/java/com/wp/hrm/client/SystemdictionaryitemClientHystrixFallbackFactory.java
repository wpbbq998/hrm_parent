package com.wp.hrm.client;

import com.wp.hrm.domain.Systemdictionaryitem;
import com.wp.hrm.query.SystemdictionaryitemQuery;
import com.wp.hrm.util.AjaxResult;
import com.wp.hrm.util.PageList;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wp
 * @date 2018/10/8-16:18
 */
@Component
public class SystemdictionaryitemClientHystrixFallbackFactory implements FallbackFactory<SystemdictionaryitemClient> {

    @Override
    public SystemdictionaryitemClient create(Throwable throwable) {
        return new SystemdictionaryitemClient() {
            @Override
            public AjaxResult save(Systemdictionaryitem systemdictionaryitem) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public Systemdictionaryitem get(Long id) {
                return null;
            }

            @Override
            public List<Systemdictionaryitem> list() {
                return null;
            }

            @Override
            public PageList<Systemdictionaryitem> json(SystemdictionaryitemQuery query) {
                return null;
            }
        };
    }
}
