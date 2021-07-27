package org.openingo.cloud.dictionary.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.openingo.cloud.dictionary.core.entity.base.BaseDO;

/**
 * <p>
 * 词典属性
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "t_dictionary_property", autoResultMap = true)
public class DictionaryPropertyDO extends BaseDO<DictionaryPropertyDO> {

    /**
     * 父节点id
     */
    private Integer parentId;

    /**
     * 父节点code
     */
    private String parentCode;

    /**
     * 词典id
     */
    private Integer dictionaryId;

    /**
     * 词典编码
     */
    private String dictionaryCode;
}
