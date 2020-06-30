package cnpproject;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class implement extends UnicastRemoteObject implements inter
{
public implement() throws RemoteException
{
}
public void fact(int n) throws RemoteException
{
int f=1;
for(int i=1;i<=n;i++)
f=f*i;
System.out.println("Factorial of "+n+" is "+f);
}
}
