package AssignmentTwo;


/**
* AssignmentTwo/Agency.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from AssignmentTwo.idl
* Monday, 30 March 2020 15:54:25 o'clock BST
*/

public final class Agency implements org.omg.CORBA.portable.IDLEntity
{
  public String agency_name = null;
  public String agency_region = null;
  public String agency_contact = null;

  public Agency ()
  {
  } // ctor

  public Agency (String _agency_name, String _agency_region, String _agency_contact)
  {
    agency_name = _agency_name;
    agency_region = _agency_region;
    agency_contact = _agency_contact;
  } // ctor

} // class Agency
