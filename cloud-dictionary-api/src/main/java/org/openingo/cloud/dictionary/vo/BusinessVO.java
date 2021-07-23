/*
 * MIT License
 *
 * Copyright (c) 2021 OpeningO Co.,Ltd.
 *
 *    https://openingo.org
 *    contactus(at)openingo.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.openingo.cloud.dictionary.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Map;

/**
 * BusinessVO
 *
 * @author Qicz
 * @since 2021/7/21 15:23
 */
@Data
@ApiModel(description = "业务信息")
public class BusinessVO implements Serializable {

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
	 * 名称
	 */
	@NotBlank(message = "业务名称不能为空")
	@ApiModelProperty(value = "业务名称", required = true, example = "businessName")
	private String name;

	/**
	 * 扩展信息
	 */
	@ApiModelProperty(value = "业务扩展信息[json]", example = "")
	private Map<String, Object> extra;
}
