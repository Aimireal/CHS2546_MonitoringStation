package AssignmentTwo;


/**
* AssignmentTwo/MonitoringStationHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from AssignmentTwo.idl
* Monday, 30 March 2020 15:54:25 o'clock BST
*/

abstract public class MonitoringStationHelper
{
  private static String  _id = "IDL:AssignmentTwo/MonitoringStation:1.0";

  public static void insert (org.omg.CORBA.Any a, AssignmentTwo.MonitoringStation that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AssignmentTwo.MonitoringStation extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AssignmentTwo.MonitoringStationHelper.id (), "MonitoringStation");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AssignmentTwo.MonitoringStation read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_MonitoringStationStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AssignmentTwo.MonitoringStation value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AssignmentTwo.MonitoringStation narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AssignmentTwo.MonitoringStation)
      return (AssignmentTwo.MonitoringStation)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AssignmentTwo._MonitoringStationStub stub = new AssignmentTwo._MonitoringStationStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AssignmentTwo.MonitoringStation unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AssignmentTwo.MonitoringStation)
      return (AssignmentTwo.MonitoringStation)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AssignmentTwo._MonitoringStationStub stub = new AssignmentTwo._MonitoringStationStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
