package org.openingo;

import org.openingo.spring.boot.SpringApplicationX;
import org.openingo.spring.boot.annotation.EnableExtension;

/**
 * App
 *
 * @author Qicz
 * @since 2021/7/20 17:40
 */
@EnableExtension
public class App {

	public static void main(String[] args) {
		SpringApplicationX.run(App.class, args);
	}
}
