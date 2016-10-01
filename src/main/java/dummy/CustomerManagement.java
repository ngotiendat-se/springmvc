package dummy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by datnt on 10/1/2016.
 */
public class CustomerManagement {

    private Object lock = new Object();
    private static volatile Map<String, Customer> mapCustomer;

    private CustomerManagement() {}

    public synchronized static Map<String, Customer> init() {
        Customer ngotiendat = new Customer.Builder("ngotiendat", "01265663317").email("ngotiendat.se@gmail.com").fullname("Ngô Tiến Đạt").build();
        Customer tranquanghuy = new Customer.Builder("tranquanghuy", "0129876793").email("tranquanghuy.se@gmail.com").fullname("Trần Quang Huy").build();
        Customer trandieuthu = new Customer.Builder("trandieuthu", "1998365978").email("trandieuthu.se@gmail.com").fullname("Trần Diệu Thư").build();

        mapCustomer = new HashMap<>();
        mapCustomer.put(ngotiendat.getUserName(), ngotiendat);
        mapCustomer.put(tranquanghuy.getUserName(), tranquanghuy);
        mapCustomer.put(trandieuthu.getUserName(), trandieuthu);

        return mapCustomer;
    }

    public static boolean contains(final Customer customer) {
        return mapCustomer.containsKey(customer.getUserName());
    }

    public static Customer authenticate(final String username, final String password) {
        if (username == null || password == null) throw new NullPointerException("authenticate method receive null value");
        Customer customer = mapCustomer.get(username);
        if (customer != null) {
            if (customer.getPassword().equals(password)) {
                return customer;
            }
        }
        return null;
    }

    public static Map<String, Customer> getCustomers() {
        return mapCustomer;
    }
}
