//import com.core.usermanagement.model.Profile
//import com.core.usermanagement.model.User
//import com.core.usermanagement.repository.UserRepository
//import com.core.usermanagement.service.impl.UserServiceImpl
//import org.junit.jupiter.api.Test
//import org.mockito.InjectMocks
//import org.mockito.Mock
//import org.mockito.MockitoAnnotations
//import org.springframework.boot.test.context.SpringBootTest
//import spock.lang.Specification
//
//import static org.mockito.ArgumentMatchers.any
//import static org.mockito.Mockito.verify
//import static org.mockito.Mockito.when
//
//@SpringBootTest
//class UserServiceImplTests extends Specification{
//
//    @Mock
//    UserRepository userRepository
//
//    @InjectMocks
//    UserServiceImpl userService
//
//    void setup() {
//        MockitoAnnotations.initMocks(this)
//    }
//
//    @Test
//    void testRegisterUser() {
//        User user = new User("testUser", "password", new Profile("John", "Doe", "123456789", "TestLocation"))
//        when(userRepository.save(any(User.class))).thenReturn(user)
//
//        userService.registerUser(user)
//
//        verify(userRepository).save(any(User.class))
//    }
//
//    @Test
//    void testUpdateProfile() {
//        Long userId = 1L
//        Profile profile = new Profile("John", "Doe", "123456789", "TestLocation")
//        User user = new User()
//        user.setProfile(profile)
//        when(userRepository.findById(userId)).thenReturn(java.util.Optional.of(user))
//
//        userService.updateProfile(userId, profile)
//
//        verify(userRepository).findById(userId)
//    }
//}
