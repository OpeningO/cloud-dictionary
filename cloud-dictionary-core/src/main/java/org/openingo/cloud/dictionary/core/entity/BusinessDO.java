package org.openingo.cloud.dictionary.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.openingo.cloud.dictionary.core.entity.base.BaseDO;

/**
 * <p>
 * 业务信息
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "t_business", autoResultMap = true)
public class BusinessDO extends BaseDO<BusinessDO> {

    /**
     * 应用id
     */
    private Integer applicationId;

    /**
     * 应用编码
     */
    private String applicationCode;
}
