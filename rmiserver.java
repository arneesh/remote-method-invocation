package cnpproject;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;
public class rmiserver
{
    public static void main(String args[]) throws RemoteException
    {
        try{
            implement i=new implement();
            Naming.rebind("server",i);
            System.out.println("server ready");
        }
        catch(Exception e){
            System.out.println("exception:"+e);
        }
    }
}
