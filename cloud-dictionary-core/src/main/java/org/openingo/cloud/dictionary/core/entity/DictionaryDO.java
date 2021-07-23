package org.openingo.cloud.dictionary.core.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.openingo.boot.mybatisplus.extension.ModelX;
import org.openingo.cloud.dictionary.enums.DictionaryTypeEnum;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 词典
 * </p>
 *
 * @author Qicz
 * @since 2021-07-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_dictionary")
public class DictionaryDO extends ModelX<DictionaryDO> {

    private static final long serialVersionUID=1L;
    

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    private String code;

    /**
     * 类型，1=dictionary，2=tag
     */
    private DictionaryTypeEnum type;

    /**
     * 扩展信息
     */
    private String extra;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
