/**
 *
 */
package com.springboot.jdbc.respository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.jdbc.model.User;

/**
 * @author z01.ko.sai
 * テストクラス
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testSave() {
		User user = new User("wataru", "123456", 20);
		userRepository.save(user);
	}
}
