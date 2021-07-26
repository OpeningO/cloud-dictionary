package org.openingo.cloud.dictionary.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.openingo.cloud.dictionary.enums.DictionaryTypeEnum;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Map;

/**
 * DictionaryVO
 *
 * @author Qicz
 * @since 2021-07-2333
 */
@Data
@ApiModel(description = "词典信息")
public class DictionaryVO implements Serializable {

    /**
     * 应用id
     */
    @NotNull(message = "应用id不能为空")
    @ApiModelProperty(value = "应用id", required = true, example = "1")
    private Integer applicationId;

    /**
     * 应用编码
     */
    @NotBlank(message = "应用编码不能为空")
    @ApiModelProperty(value = "应用编码", required = true, example = "xxxxxx")
    private String applicationCode;

    /**
     * 业务id
     */
    @NotNull(message = "业务id不能为空")
    @ApiModelProperty(value = "业务id", required = true, example = "1")
    private Integer businessId;

    /**
     * 业务编码
     */
    @NotBlank(message = "业务编码不能为空")
    @ApiModelProperty(value = "业务编码", required = true, example = "xxxxxx")
    private String businessCode;

    /**
     * 名称
     */
    @NotBlank(message = "词典名称不能为空")
    @ApiModelProperty(value = "词典名称", required = true, example = "xxxxxx")
    private String name;

    /**
     * 类型，1=dictionary，2=tag
     */
    @NotNull(message = "词典类型不能为空")
    @ApiModelProperty(value = "词典类型", required = true, example = "1")
    private DictionaryTypeEnum type;

    /**
     * 扩展信息
     */
    @ApiModelProperty(value = "词典扩展信息[json]", example = "")
    private Map<String, Object> extra;
}
