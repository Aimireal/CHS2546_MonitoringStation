package AssignmentTwo;


/**
* AssignmentTwo/ServerDetails.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from AssignmentTwo.idl
* Monday, 30 March 2020 15:54:25 o'clock BST
*/

public final class ServerDetails implements org.omg.CORBA.portable.IDLEntity
{
  public String server_name = null;
  public String location = null;

  public ServerDetails ()
  {
  } // ctor

  public ServerDetails (String _server_name, String _location)
  {
    server_name = _server_name;
    location = _location;
  } // ctor

} // class ServerDetails
