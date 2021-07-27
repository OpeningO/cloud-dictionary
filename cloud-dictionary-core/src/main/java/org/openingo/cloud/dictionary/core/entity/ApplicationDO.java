package org.openingo.cloud.dictionary.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.openingo.cloud.dictionary.core.entity.base.BaseDO;

/**
 * <p>
 * 应用
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "t_application", autoResultMap = true)
public class ApplicationDO extends BaseDO<ApplicationDO> {

}
