package org.openingo.cloud.dictionary.service.impl;

import org.openingo.cloud.dictionary.entity.BusinessDO;
import org.openingo.cloud.dictionary.mapper.BusinessMapper;
import org.openingo.cloud.dictionary.service.IBusinessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业务信息 服务实现类
 * </p>
 *
 * @author Qicz
 * @since 2021-07-20
 */
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, BusinessDO> implements IBusinessService {

}
