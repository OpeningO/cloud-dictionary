package org.openingo.cloud.dictionary.dao.config;

import org.openingo.boot.mybatisplus.config.TimeFillMetaObjectHandler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * DaoConfiguration
 *
 * @author Qicz
 * @since 2021/7/20 11:03
 */
@Configuration
@EnableTransactionManagement
public class DaoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public TimeFillMetaObjectHandler timeFillMetaObjectHandler() {
		return new TimeFillMetaObjectHandler();
	}
}
