package org.openingo.cloud.dictionary.core.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.openingo.cloud.dictionary.core.entity.DictionaryDO;
import org.openingo.cloud.dictionary.core.mapper.DictionaryMapper;
import org.openingo.cloud.dictionary.core.service.IDictionaryService;
import org.openingo.cloud.dictionary.core.service.base.CloudDictionaryServiceImpl;
import org.openingo.cloud.dictionary.vo.DictionaryVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 词典 服务实现类
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Service
@Slf4j
public class DictionaryServiceImpl extends CloudDictionaryServiceImpl<DictionaryVO, DictionaryDO, DictionaryMapper> implements IDictionaryService {

	/**
	 * put之前的工作
	 *
	 * @param dictionaryVO 某对象
	 */
	@Override
	public void beforePut(DictionaryVO dictionaryVO) {
		log.info("dictionary before put");
	}
}
