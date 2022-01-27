// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public class Column
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject columnMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DatabaseReplication.Column";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Length("Length"),
		DataType("DataType"),
		UpdateCounter("UpdateCounter"),
		TableId("TableId"),
		DbId("DbId"),
		Column_Table("DatabaseReplication.Column_Table"),
		Column_ValueType("DatabaseReplication.Column_ValueType");

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

	public Column(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DatabaseReplication.Column"));
	}

	protected Column(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject columnMendixObject)
	{
		if (columnMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DatabaseReplication.Column", columnMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DatabaseReplication.Column");

		this.columnMendixObject = columnMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Column.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static databasereplication.proxies.Column initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return databasereplication.proxies.Column.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static databasereplication.proxies.Column initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new databasereplication.proxies.Column(context, mendixObject);
	}

	public static databasereplication.proxies.Column load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return databasereplication.proxies.Column.initialize(context, mendixObject);
	}

	public static java.util.List<databasereplication.proxies.Column> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<databasereplication.proxies.Column> result = new java.util.ArrayList<databasereplication.proxies.Column>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DatabaseReplication.Column" + xpathConstraint))
			result.add(databasereplication.proxies.Column.initialize(context, obj));
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
	 * @return value of Length
	 */
	public final java.lang.Integer getLength()
	{
		return getLength(getContext());
	}

	/**
	 * @param context
	 * @return value of Length
	 */
	public final java.lang.Integer getLength(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Length.toString());
	}

	/**
	 * Set value of Length
	 * @param length
	 */
	public final void setLength(java.lang.Integer length)
	{
		setLength(getContext(), length);
	}

	/**
	 * Set value of Length
	 * @param context
	 * @param length
	 */
	public final void setLength(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer length)
	{
		getMendixObject().setValue(context, MemberNames.Length.toString(), length);
	}

	/**
	 * @return value of DataType
	 */
	public final java.lang.String getDataType()
	{
		return getDataType(getContext());
	}

	/**
	 * @param context
	 * @return value of DataType
	 */
	public final java.lang.String getDataType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DataType.toString());
	}

	/**
	 * Set value of DataType
	 * @param datatype
	 */
	public final void setDataType(java.lang.String datatype)
	{
		setDataType(getContext(), datatype);
	}

	/**
	 * Set value of DataType
	 * @param context
	 * @param datatype
	 */
	public final void setDataType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String datatype)
	{
		getMendixObject().setValue(context, MemberNames.DataType.toString(), datatype);
	}

	/**
	 * @return value of UpdateCounter
	 */
	public final java.lang.Integer getUpdateCounter()
	{
		return getUpdateCounter(getContext());
	}

	/**
	 * @param context
	 * @return value of UpdateCounter
	 */
	public final java.lang.Integer getUpdateCounter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.UpdateCounter.toString());
	}

	/**
	 * Set value of UpdateCounter
	 * @param updatecounter
	 */
	public final void setUpdateCounter(java.lang.Integer updatecounter)
	{
		setUpdateCounter(getContext(), updatecounter);
	}

	/**
	 * Set value of UpdateCounter
	 * @param context
	 * @param updatecounter
	 */
	public final void setUpdateCounter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer updatecounter)
	{
		getMendixObject().setValue(context, MemberNames.UpdateCounter.toString(), updatecounter);
	}

	/**
	 * @return value of TableId
	 */
	public final java.lang.String getTableId()
	{
		return getTableId(getContext());
	}

	/**
	 * @param context
	 * @return value of TableId
	 */
	public final java.lang.String getTableId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TableId.toString());
	}

	/**
	 * Set value of TableId
	 * @param tableid
	 */
	public final void setTableId(java.lang.String tableid)
	{
		setTableId(getContext(), tableid);
	}

	/**
	 * Set value of TableId
	 * @param context
	 * @param tableid
	 */
	public final void setTableId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tableid)
	{
		getMendixObject().setValue(context, MemberNames.TableId.toString(), tableid);
	}

	/**
	 * @return value of DbId
	 */
	public final java.lang.Long getDbId()
	{
		return getDbId(getContext());
	}

	/**
	 * @param context
	 * @return value of DbId
	 */
	public final java.lang.Long getDbId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.DbId.toString());
	}

	/**
	 * Set value of DbId
	 * @param dbid
	 */
	public final void setDbId(java.lang.Long dbid)
	{
		setDbId(getContext(), dbid);
	}

	/**
	 * Set value of DbId
	 * @param context
	 * @param dbid
	 */
	public final void setDbId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long dbid)
	{
		getMendixObject().setValue(context, MemberNames.DbId.toString(), dbid);
	}

	/**
	 * @return value of Column_Table
	 */
	public final databasereplication.proxies.Table getColumn_Table() throws com.mendix.core.CoreException
	{
		return getColumn_Table(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_Table
	 */
	public final databasereplication.proxies.Table getColumn_Table(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		databasereplication.proxies.Table result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Column_Table.toString());
		if (identifier != null)
			result = databasereplication.proxies.Table.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Column_Table
	 * @param column_table
	 */
	public final void setColumn_Table(databasereplication.proxies.Table column_table)
	{
		setColumn_Table(getContext(), column_table);
	}

	/**
	 * Set value of Column_Table
	 * @param context
	 * @param column_table
	 */
	public final void setColumn_Table(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.Table column_table)
	{
		if (column_table == null)
			getMendixObject().setValue(context, MemberNames.Column_Table.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Column_Table.toString(), column_table.getMendixObject().getId());
	}

	/**
	 * @return value of Column_ValueType
	 */
	public final java.util.List<mxmodelreflection.proxies.ValueType> getColumn_ValueType() throws com.mendix.core.CoreException
	{
		return getColumn_ValueType(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_ValueType
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<mxmodelreflection.proxies.ValueType> getColumn_ValueType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.ValueType> result = new java.util.ArrayList<mxmodelreflection.proxies.ValueType>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Column_ValueType.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(mxmodelreflection.proxies.ValueType.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Column_ValueType
	 * @param column_valuetype
	 */
	public final void setColumn_ValueType(java.util.List<mxmodelreflection.proxies.ValueType> column_valuetype)
	{
		setColumn_ValueType(getContext(), column_valuetype);
	}

	/**
	 * Set value of Column_ValueType
	 * @param context
	 * @param column_valuetype
	 */
	public final void setColumn_ValueType(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<mxmodelreflection.proxies.ValueType> column_valuetype)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (mxmodelreflection.proxies.ValueType proxyObject : column_valuetype)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Column_ValueType.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return columnMendixObject;
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
			final databasereplication.proxies.Column that = (databasereplication.proxies.Column) obj;
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
		return "DatabaseReplication.Column";
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