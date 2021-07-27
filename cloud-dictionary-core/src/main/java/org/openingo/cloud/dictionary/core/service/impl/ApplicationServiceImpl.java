package org.openingo.cloud.dictionary.core.service.impl;

import org.openingo.cloud.dictionary.core.entity.ApplicationDO;
import org.openingo.cloud.dictionary.core.mapper.ApplicationMapper;
import org.openingo.cloud.dictionary.core.service.IApplicationService;
import org.openingo.cloud.dictionary.core.service.base.CloudDictionaryServiceImpl;
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
public class ApplicationServiceImpl extends CloudDictionaryServiceImpl<ApplicationVO, ApplicationDO, ApplicationMapper> implements IApplicationService {

	/**
	 * put之前的工作
	 *
	 * @param vo 某对象
	 */
	@Override
	public void beforePut(ApplicationVO vo) {

	}
}
