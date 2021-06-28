package PracticaTercerParcial.Proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Proxy implements ICluster{

    private String ip;
    private String port;
    private Servidor servidor1 = new Servidor("192.168.0.1", "8080","Logins Exitosos");
    private Servidor servidor2 = new Servidor("192.168.0.1", "8080","Logins incorrectos");
    private Map<String, String> userMap = new HashMap<String, String>();

    public Proxy(String ip, String port) {
        this.ip = ip;
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }

    public void addUser(User user){
        userMap.put(user.getPwd(), user.getName());
    }

    @Override
    public void login(User user) {
        if(userMap.containsValue(user.getName())&&userMap.containsKey(user.getPwd())){
            System.out.println("Usuario y pwd correctos");
            System.out.println("Atendiendo en el servidor1");
            servidor1.login(user);
        }
        else{
            System.out.println("Usuario y pwd correctos");
            System.out.println("Atendiendo en el servidor1");
            servidor2.login(user);
        }

    }
}
