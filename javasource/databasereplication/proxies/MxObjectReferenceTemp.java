// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public class MxObjectReferenceTemp
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mxObjectReferenceTempMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DatabaseReplication.MxObjectReferenceTemp";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Module("Module"),
		Name("Name");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MxObjectReferenceTemp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DatabaseReplication.MxObjectReferenceTemp"));
	}

	protected MxObjectReferenceTemp(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxObjectReferenceTempMendixObject)
	{
		if (mxObjectReferenceTempMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DatabaseReplication.MxObjectReferenceTemp", mxObjectReferenceTempMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DatabaseReplication.MxObjectReferenceTemp");

		this.mxObjectReferenceTempMendixObject = mxObjectReferenceTempMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxObjectReferenceTemp.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static databasereplication.proxies.MxObjectReferenceTemp initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return databasereplication.proxies.MxObjectReferenceTemp.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static databasereplication.proxies.MxObjectReferenceTemp initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new databasereplication.proxies.MxObjectReferenceTemp(context, mendixObject);
	}

	public static databasereplication.proxies.MxObjectReferenceTemp load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return databasereplication.proxies.MxObjectReferenceTemp.initialize(context, mendixObject);
	}

	public static java.util.List<databasereplication.proxies.MxObjectReferenceTemp> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<databasereplication.proxies.MxObjectReferenceTemp> result = new java.util.ArrayList<databasereplication.proxies.MxObjectReferenceTemp>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DatabaseReplication.MxObjectReferenceTemp" + xpathConstraint))
			result.add(databasereplication.proxies.MxObjectReferenceTemp.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Module
	 */
	public final java.lang.String getModule()
	{
		return getModule(getContext());
	}

	/**
	 * @param context
	 * @return value of Module
	 */
	public final java.lang.String getModule(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Module.toString());
	}

	/**
	 * Set value of Module
	 * @param module
	 */
	public final void setModule(java.lang.String module)
	{
		setModule(getContext(), module);
	}

	/**
	 * Set value of Module
	 * @param context
	 * @param module
	 */
	public final void setModule(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String module)
	{
		getMendixObject().setValue(context, MemberNames.Module.toString(), module);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mxObjectReferenceTempMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final databasereplication.proxies.MxObjectReferenceTemp that = (databasereplication.proxies.MxObjectReferenceTemp) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "DatabaseReplication.MxObjectReferenceTemp";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
