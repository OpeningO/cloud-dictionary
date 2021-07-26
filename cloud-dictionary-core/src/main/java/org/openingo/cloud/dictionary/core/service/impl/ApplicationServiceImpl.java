package org.openingo.cloud.dictionary.core.service.impl;

import org.openingo.cloud.dictionary.core.entity.ApplicationDO;
import org.openingo.cloud.dictionary.core.mapper.ApplicationMapper;
import org.openingo.cloud.dictionary.core.service.IApplicationService;
import org.openingo.cloud.dictionary.vo.ApplicationVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用 服务实现类
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Service
public class ApplicationServiceImpl extends BaseServiceImpl<ApplicationVO, ApplicationDO, ApplicationMapper> implements IApplicationService {

}
