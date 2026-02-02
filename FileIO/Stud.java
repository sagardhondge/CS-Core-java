import java.io.Serializable;

class Stud implements Serializable
{	int StudId;
	// transient int StudId;
	String StudName;
	Stud(int StudId,String StudName)
	{	this.StudId=StudId;
		this.StudName=StudName;	
	}
}
// if we make the data member as "transient" keyword we can avoid serialization process