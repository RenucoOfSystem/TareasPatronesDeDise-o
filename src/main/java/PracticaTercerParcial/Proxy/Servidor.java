package PracticaTercerParcial.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements ICluster{
    private List<User> userList;
    private String ip;
    private String port;
    private String hostName;

    public Servidor(String ip, String port, String hostName) {
        this.ip = ip;
        this.port = port;
        this.hostName = hostName;
        userList = new ArrayList<>();
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }

    public String getHostName() {
        return hostName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void login(User user) {
        System.out.println("Agregando usuario en el servidor: " + getHostName());
        userList.add(user);
        user.showInfoUser();



    }
}
