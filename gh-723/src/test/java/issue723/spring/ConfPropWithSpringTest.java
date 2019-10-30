/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package issue723.spring;

import issue723.Mapper;
import issue723.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:issue723/spring/beans.xml"})
public class ConfPropWithSpringTest {

    @Autowired
    Mapper mapper;

    @Test
    public void shouldGetAUser() {
        User user = mapper.getUser(1);
        Assert.assertEquals("User1", user.getName());
    }

    @Test
    public void shouldInsertAUser() {
        User user = new User();
        user.setId(2);
        user.setName("User2");
        mapper.insertUser(user);
    }

}
