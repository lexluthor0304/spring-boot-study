/**
 *
 */
package com.springboot.jdbc.respository;

import java.util.List;

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
		User user = new User("わたる", "123456", 20);
		userRepository.save(user);
	}

	@Test
	public void testUpdate() {
		User user = new User("わたる二号", "78910", 25);
		user.setId(1L);
		userRepository.update(user);
	}

	@Test
	public void testDelete() {
		userRepository.delete(1L);
	}

	@Test
	public void testQueryOne() {
		User user = userRepository.findById(4L);
		System.out.println("user == " + user.toString());
	}

	@Test
	public void testQueryAll() {
		List<User> users = userRepository.findAll();
		for (User user:users) {
			System.out.println("user ==" + user.toString());
		}
	}
}
