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

package org.openingo.cloud.dictionary.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.google.common.base.Converter;
import com.google.common.collect.Lists;
import org.openingo.jdkits.reflect.ClassKit;
import org.openingo.jdkits.validate.ValidateKit;
import org.springframework.cglib.beans.BeanCopier;

import java.util.Collections;
import java.util.List;

/**
 * IBaseService
 *
 * @author Qicz
 * @since 2021/7/26 15:35
 */
public interface IBaseService<VO, DO> extends IService<DO>  {

	/**
	 * 创建或编辑一个对象
	 * @param entity 某对象
	 * @return true成功false失败
	 */
	default boolean addOrEdit(VO entity) {
		return this.saveOrUpdate(this.converter().convert(entity));
	}

	/**
	 * 所有对象
	 * @return 所有对象集合
	 */
	default List<VO> listAll() {
		final List<DO> list = this.list();
		if (ValidateKit.isEmpty(list)) {
			return Collections.emptyList();
		}
		return Lists.newArrayList(this.converter().reverse().convertAll(list));
	}

	/**
	 * VO DO 转换器
	 * @return 转换器
	 */
	default Converter<VO, DO> converter() {
		Class<VO> voClass = ClassKit.getGenericType(this, 0);
		Class<DO> doClass = ClassKit.getGenericType(this, 1);
		BeanCopier forwardCopier = BeanCopier.create(voClass, doClass, false);
		BeanCopier backwardCopier = BeanCopier.create(doClass, voClass, false);
		return Converter.from(f -> {
			final DO aDO = ClassKit.newInstance(doClass);
			forwardCopier.copy(f, aDO, null);
			return aDO;
		}, b -> {
			final VO aVO = ClassKit.newInstance(voClass);
			backwardCopier.copy(b, aVO, null);
			return aVO;
		});
	}
}
