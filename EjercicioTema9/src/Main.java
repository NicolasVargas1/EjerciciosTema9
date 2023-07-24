public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Nicolas Vargas");
        client.setAge(26);
        client.setPhone(12345);
        client.setCredit(1000000);

        System.out.println("CLient name: " + client.getName());
        System.out.println("Client age: " + client.getAge());
        System.out.println("Client phone: " + client.getPhone());
        System.out.println("Client credit (COP) " + client.getCredit());

        System.out.println();

        Worker worker = new Worker();

        worker.setName("Nicolas Vargas");
        worker.setAge(26);
        worker.setPhone(12345);
        worker.setSalary(1000);

        System.out.println("Worker name: " + worker.getName());
        System.out.println("Worker age: " + worker.getAge());
        System.out.println("Worker phone: " + worker.getPhone());
        System.out.println("Worker salary (COP) " + worker.getSalary());


    }
}
class Person {
    String name;
    int age;
    int phone;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setPhone (int phone) {
        this.phone = phone;
    }
    public int getPhone(){
        return phone;
    }

}
class Client extends Person {

    private int credit;

    public void setCredit(int credit){
        this.credit = credit;
    }
    public int getCredit(){
        return credit;
    }

        }
class Worker extends Person {
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}