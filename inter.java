package cnpproject;

import java.rmi.*;
import java.rmi.server.*;
public interface inter extends Remote
{
public void fact(int n) throws RemoteException;
}

