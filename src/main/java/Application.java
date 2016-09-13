import com.pluralsight.AppConfig;
import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by leemorris on 25/08/2016.
 */

    public class Application {

        public static void main(String[] args){

            ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
            //CustomerService service = new CustomerServiceImpl();

            CustomerService service = appContext.getBean("customerService", CustomerService.class);

            System.out.println(service.findAll().get(0).getFirstName());
        }
    }


