package org.openingo.cloud.dictionary.core.service.impl;

import org.openingo.cloud.dictionary.core.entity.DictionaryPropertyDO;
import org.openingo.cloud.dictionary.core.mapper.DictionaryPropertyMapper;
import org.openingo.cloud.dictionary.core.service.IDictionaryPropertyService;
import org.openingo.cloud.dictionary.core.service.base.CloudDictionaryServiceImpl;
import org.openingo.cloud.dictionary.vo.DictionaryPropertyVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 词典属性 服务实现类
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Service
public class DictionaryPropertyServiceImpl extends CloudDictionaryServiceImpl<DictionaryPropertyVO, DictionaryPropertyDO, DictionaryPropertyMapper> implements IDictionaryPropertyService {

	/**
	 * put之前的工作
	 *
	 * @param dictionaryPropertyVO 某对象
	 */
	@Override
	public void beforePut(DictionaryPropertyVO dictionaryPropertyVO) {

	}
}
