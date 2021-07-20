package org.openingo.cloud.dictionary.service.impl;

import org.openingo.cloud.dictionary.entity.ApplicationDO;
import org.openingo.cloud.dictionary.mapper.ApplicationMapper;
import org.openingo.cloud.dictionary.service.IApplicationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用 服务实现类
 * </p>
 *
 * @author Qicz
 * @since 2021-07-20
 */
@Service
public class ApplicationServiceImpl extends ServiceImpl<ApplicationMapper, ApplicationDO> implements IApplicationService {

}
