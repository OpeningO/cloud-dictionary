package org.openingo.cloud.dictionary.vo;

import lombok.Data;
import org.openingo.cloud.dictionary.enums.DictionaryTypeEnum;

import java.io.Serializable;

/**
 * DictionaryVO
 *
 * @author Qicz
 * @since 2021-07-2333
 */
@Data
public class DictionaryVO implements Serializable {

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
}
