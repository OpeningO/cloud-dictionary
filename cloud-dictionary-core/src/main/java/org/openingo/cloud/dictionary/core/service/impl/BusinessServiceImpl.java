package org.openingo.cloud.dictionary.core.service.impl;

import org.openingo.cloud.dictionary.core.entity.BusinessDO;
import org.openingo.cloud.dictionary.core.mapper.BusinessMapper;
import org.openingo.cloud.dictionary.core.service.IBusinessService;
import org.openingo.cloud.dictionary.core.service.base.CloudDictionaryServiceImpl;
import org.openingo.cloud.dictionary.vo.BusinessVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业务信息 服务实现类
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Service
public class BusinessServiceImpl extends CloudDictionaryServiceImpl<BusinessVO, BusinessDO, BusinessMapper> implements IBusinessService {

	/**
	 * put之前的工作
	 *
	 * @param vo 某对象
	 */
	@Override
	public void beforePut(BusinessVO vo) {

	}
}
