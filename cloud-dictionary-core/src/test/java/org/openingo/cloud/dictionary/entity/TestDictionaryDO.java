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

package org.openingo.cloud.dictionary.entity;

import com.google.common.base.Converter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openingo.cloud.dictionary.App;
import org.openingo.cloud.dictionary.core.converter.DictionaryConverter;
import org.openingo.cloud.dictionary.core.entity.DictionaryDO;
import org.openingo.cloud.dictionary.core.service.IDictionaryService;
import org.openingo.cloud.dictionary.enums.DictionaryTypeEnum;
import org.openingo.cloud.dictionary.vo.DictionaryVO;
import org.openingo.jdkits.hash.HashKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * TestDictionaryDO
 *
 * @author Qicz
 * @since 2021/7/23 16:06
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = App.class)
public class TestDictionaryDO {

	@Autowired
	private IDictionaryService dictionaryService;

	@Test
	public void saveDictionary() {
		final DictionaryDO dictionaryDO = new DictionaryDO();
		dictionaryDO.setApplicationId(12);
		dictionaryDO.setApplicationCode("appcode");
		dictionaryDO.setBusinessId(12);
		dictionaryDO.setBusinessCode("bizcode");
		dictionaryDO.setName("dictionary" + HashKit.generateSalt(2));
		dictionaryDO.setType(DictionaryTypeEnum.DICTIONARY);

		dictionaryService.save(dictionaryDO);
	}

	@Test
	public void getDictionary() {
		System.out.println(dictionaryService.getById(1));
	}

	@Resource
	DictionaryConverter dictionaryConverter;

	@Test
	public void saveDictionaryByVO() {
		final DictionaryVO dictionaryVO = new DictionaryVO();
		dictionaryVO.setApplicationId(123);
		dictionaryVO.setApplicationCode(HashKit.generateSalt(30));
		dictionaryVO.setBusinessId(123);
		dictionaryVO.setBusinessCode(HashKit.generateSalt(30));
		dictionaryVO.setName("one dict");
		dictionaryVO.setType(DictionaryTypeEnum.DICTIONARY);

		dictionaryService.addOrEdit(dictionaryVO);
	}
}
