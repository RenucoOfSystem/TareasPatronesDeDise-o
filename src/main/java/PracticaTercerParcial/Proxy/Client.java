package PracticaTercerParcial.Proxy;

public class Client {
    public static void main(String[]args){
        Proxy proxy = new Proxy("192.168.1.1", "8080");

        //Agregando usuarios para comparar
        proxy.addUser(new User("Renuco1", "123"));
        proxy.addUser(new User("Renuco2", "222"));

        //Verificando los usuarios que quieren loguearse
        proxy.login(new User("Renuco1", "123"));
        proxy.login(new User("Renuco2", "999"));
    }
}
