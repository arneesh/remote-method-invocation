package cnpproject;

import java.io.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;
public class rmiclient
{
    public static void main(String args[]) throws RemoteException
    {
        try
        {
            String host="rmi://localhost/server";
            inter a=(inter)Naming.lookup(host);
            System.out.println("Enter a number:");
            DataInputStream ds=new DataInputStream(System.in);
            int n=Integer.parseInt(ds.readLine());
            a.fact(n);
        }
        catch(Exception e)
        {
        }
    }
}
