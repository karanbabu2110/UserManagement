//import com.core.usermanagement.controller.UserController
//import com.core.usermanagement.model.Profile
//import com.core.usermanagement.model.User
//import com.core.usermanagement.service.UserService
//import io.restassured.module.mockmvc.RestAssuredMockMvc
//import org.junit.jupiter.api.BeforeEach
//import org.junit.jupiter.api.Test
//import org.mockito.InjectMocks
//import org.mockito.Mock
//import org.mockito.MockitoAnnotations
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
//import org.springframework.boot.test.context.SpringBootTest
//import org.springframework.http.HttpStatus
//import spock.lang.Specification
//
//import static io.restassured.module.mockmvc.RestAssuredMockMvc.given
//import static org.mockito.ArgumentMatchers.any
//import static org.mockito.Mockito.verify
//import static org.mockito.Mockito.when
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class UserControllerTests extends Specification {
//
//    @Mock
//    UserService userService;
//
//    @InjectMocks
//    UserController userController;
//
//    @BeforeEach
//    void setup() {
//        MockitoAnnotations.initMocks(this);
//        RestAssuredMockMvc.standaloneSetup(userController);
//    }
//
//    @Test
//    void shouldRegisterUserSuccessfully() {
//        // Given
//        User user = new User("testUser", "password", new Profile("John", "Doe", "123456789", "TestLocation"));
//        when(userService.registerUser(any(User.class))).thenReturn(user);
//
//        // When/Then
//        given()
//                .contentType("application/json")
//                .body(user)
//                .when()
//                .post("/api/users/register")
//                .then()
//                .statusCode(HttpStatus.OK.value());
//
//        // Verify
//        verify(userService).registerUser(user);
//    }
//
//    @Test
//    void shouldUpdateUserProfileSuccessfully() {
//        // Given
//        Long userId = 1L;
//        Profile profile = new Profile("John", "Doe", "123456789", "TestLocation");
//        when(userService.updateProfile(userId, profile)).thenReturn(new User());
//
//        // When/Then
//        given()
//                .contentType("application/json")
//                .body(profile)
//                .when()
//                .put("/api/users/updateProfile/{userId}", userId)
//                .then()
//                .statusCode(HttpStatus.OK.value());
//
//        // Verify
//        verify(userService).updateProfile(userId, profile);
//    }
//}