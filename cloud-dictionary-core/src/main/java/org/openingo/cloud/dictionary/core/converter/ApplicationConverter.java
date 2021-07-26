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

package org.openingo.cloud.dictionary.core.converter;

import com.google.common.base.Converter;
import org.openingo.cloud.dictionary.core.entity.ApplicationDO;
import org.openingo.cloud.dictionary.vo.ApplicationVO;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Component;

/**
 * ApplicationConverter
 *
 * @author Qicz
 * @since 2021/7/26 14:37
 */
@Component
public class ApplicationConverter extends Converter<ApplicationVO, ApplicationDO> {

	private BeanCopier forwardCopier = BeanCopier.create(ApplicationVO.class, ApplicationDO.class, false);

	private BeanCopier backwardCopier = BeanCopier.create(ApplicationDO.class, ApplicationVO.class, false);

	@Override
	protected ApplicationDO doForward(ApplicationVO applicationVO) {
		final ApplicationDO applicationDO = new ApplicationDO();
		this.forwardCopier.copy(applicationVO, applicationDO, null);
		return applicationDO;
	}

	@Override
	protected ApplicationVO doBackward(ApplicationDO applicationDO) {
		final ApplicationVO applicationVO = new ApplicationVO();
		this.backwardCopier.copy(applicationDO, applicationVO, null);
		return applicationVO;
	}
}
