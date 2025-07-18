import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

class Main {
    public static Worker[] workers = {
            new Worker(
                    "E001",
                    "Mana",
                    "Ngandee",
                    LocalDate.of(2004, Month.MAY, 13),
                    7000.0f,
                    "VC",
                    "Male",
                    "Service"
            ),
            new Worker(
                    "E002",
                    "Chuttima",
                    "Gademanee",
                    LocalDate.of(2003, Month.AUGUST, 15),
                    10000.0f,
                    "Bachelor",
                    "Female",
                    "Financial"
            ),
            new Worker(
                    "E003",
                    "Tonkao",
                    "Ngammoung",
                    LocalDate.of(2004, Month.OCTOBER, 15),
                    6200.0f,
                    "Junior HC",
                    "Male",
                    "Cleaning"
            ),
            new Worker(
                    "E004",
                    "Somkid",
                    "Deengam",
                    LocalDate.of(2004, Month.MAY, 13),
                    7000.0f,
                    "VC",
                    "Male",
                    "Service"
            ),
            new Worker(
                    "E005",
                    "Sountree",
                    "Ngamying",
                    LocalDate.of(2002, Month.MAY, 13),
                    7000.0f,
                    "VC",
                    "Female",
                    "Service"
            )
    };

    public static Food[] foods = {
            new Food(
                    "001",
                    "Yum pra duk ful",
                    200.0f
            ),
            new Food(
                    "002",
                    "Tomyum sie sahai",
                    250.0f
            ),
            new Food(
                    "003",
                    "Pragao noung ma nao",
                    300.0f
            ),
            new Food(
                    "004",
                    "Tod mun pra guy",
                    50.0f
            ),
            new Food(
                    "005",
                    "Pra rad prik",
                    100.0f
            )
    };

    public static Customer[] customers = {
            new Customer(
                    "C001",
                    "Meedee",
                    "Srubmangmee",
                    "(02)-911-8541"
            ),
            new Customer(
                    "C002",
                    "Tong rouy",
                    "Srubmrak",
                    "(02)-911-8542"
            ),
            new Customer(
                    "C003",
                    "Boonchu",
                    "Trakuldee",
                    "(02)-911-8542"
            ),
            new Customer(
                    "C004",
                    "Ma rouy",
                    "Wanischa",
                    "(02)-911-8543"
            ),
            new Customer(
                    "C005",
                    "Niwat",
                    "Yorddee",
                    "(02)-911-8544"
            )
    };

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println(
                "Welcome to Restaurant!\n" +
                "\nHere is our workers:"
        );
        for (Worker worker : workers) {
            System.out.println(
                    "[" + worker.id + "] " + worker.firstName  + " " + worker.lastName +
                    " - " + worker.joinDate.format(dtf) +
                    " | " + worker.salary + " ฿ |" +
                    " - " + worker.edu +
                    " - " + worker.gender +
                    " - " + worker.role
            );
        }

        System.out.println("\nHere is our foods:");
        for (Food food : foods) {
            System.out.println(
                    "[" + food.id + "] " + food.name +
                    " - " + food.price + " ฿"
            );
        }

        System.out.println("\nHere is our customers:");
        for (Customer customer : customers) {
            System.out.println(
                    "[" + customer.id + "] " + customer.firstName + " " + customer.lastName +
                    " - " + customer.tel
            );
        }

        System.out.println("\nThanks!");
    }
}