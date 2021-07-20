package org.openingo.cloud.dictionary.service.impl;

import org.openingo.cloud.dictionary.entity.DictionaryDO;
import org.openingo.cloud.dictionary.mapper.DictionaryMapper;
import org.openingo.cloud.dictionary.service.IDictionaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 词典 服务实现类
 * </p>
 *
 * @author Qicz
 * @since 2021-07-20
 */
@Service
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, DictionaryDO> implements IDictionaryService {

}
