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

package org.openingo.cloud.dictionary.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import org.openingo.jdkits.lang.EnumItem;
import org.openingo.jdkits.lang.EnumKit;
import org.openingo.jdkits.lang.StrKit;

import java.io.Serializable;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * DictionaryTypeEnum
 *
 * @author Qicz
 * @since 2021/7/20 18:22
 */
@Getter
public enum DictionaryTypeEnum implements EnumItem<DictionaryTypeEnum> {

	/**
	 * 未知类型
	 */
	UNKNOWN(-1, "未知"),

	/**
	 * 词典
	 */
	DICTIONARY(1, "词典"),

	/**
	 * 标签
	 */
	TAG(2, "标签");

	@EnumValue
	private final Integer id;
	private final String description;

	DictionaryTypeEnum(Integer id, String description) {
		this.id = id;
		this.description = description;
	}

	@Override
	public int intVal() {
		return this.id;
	}

	@Override
	public String strVal() {
		return this.description;
	}

	@JsonCreator
	public static DictionaryTypeEnum one(Integer id) {
		return EnumKit.find(DictionaryTypeEnum.class, e -> e.id.equals(id), UNKNOWN);
	}
}
