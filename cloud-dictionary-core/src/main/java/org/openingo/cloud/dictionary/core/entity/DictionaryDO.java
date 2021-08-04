package org.openingo.cloud.dictionary.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.openingo.cloud.dictionary.core.entity.base.BaseDO;
import org.openingo.cloud.dictionary.enums.DictionaryTypeEnum;

/**
 * <p>
 * 词典
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "t_dictionary", autoResultMap = true)
public class DictionaryDO extends BaseDO<DictionaryDO> {

    /**
     * 应用id
     */
    private Integer applicationId;

    /**
     * 应用编码
     */
    private String applicationCode;

    /**
     * 业务id
     */
    private Integer businessId;

    /**
     * 业务编码
     */
    private String businessCode;

    /**
     * 类型，1=dictionary，2=tag
     */
    private DictionaryTypeEnum type;
}
