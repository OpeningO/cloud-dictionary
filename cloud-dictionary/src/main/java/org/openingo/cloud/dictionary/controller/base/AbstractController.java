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

package org.openingo.cloud.dictionary.controller.base;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.openingo.cloud.dictionary.core.entity.base.BaseDO;
import org.openingo.cloud.dictionary.core.service.base.ICloudDictionaryService;
import org.openingo.cloud.dictionary.vo.resp.PutResultRespVO;
import org.openingo.java.lang.ThreadLocalKit;
import org.openingo.jdkits.lang.BeanKit;
import org.openingo.spring.boot.extension.http.response.annotation.AutoMappingRespResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * AbstractController
 *
 * @author Qicz
 * @since 2021/7/27 10:25
 */
@Validated
@Slf4j
public abstract class AbstractController<VO, Service extends ICloudDictionaryService<VO, ? extends BaseDO<?>>> {

	protected final Service service;

	public AbstractController(Service service) {
		this.service = service;
	}

	@PutMapping("/")
	@AutoMappingRespResult
	@ApiOperation(value = "新增或更新")
	public PutResultRespVO put(@RequestBody @Validated VO vo) {
		final boolean putRet = this.service.put(vo);
		final PutResultRespVO afterPut = this.service.getAfterPut();
		log.info("put result {} data {}", putRet, afterPut);
		return afterPut;
	}

	@GetMapping("list")
	@AutoMappingRespResult
	@ApiOperation(value = "清单")
	public List<VO> list() {
		return this.service.listAll();
	}
}
