// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public class ReplicationStatus
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject replicationStatusMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DatabaseReplication.ReplicationStatus";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NrOfObjectsSynchronized("NrOfObjectsSynchronized"),
		NrOfObjectsCreated("NrOfObjectsCreated"),
		NrOfObjectsNotFound("NrOfObjectsNotFound"),
		NrOfObjectsSkipped("NrOfObjectsSkipped"),
		NrOfObjectsRemoved("NrOfObjectsRemoved"),
		NewRemoveIndicatorValue("NewRemoveIndicatorValue"),
		PreviousRemoveIndicatorValue("PreviousRemoveIndicatorValue"),
		ReplicationStatus("ReplicationStatus"),
		ReplicationStatus_TableMapping("DatabaseReplication.ReplicationStatus_TableMapping");

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

	public ReplicationStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DatabaseReplication.ReplicationStatus"));
	}

	protected ReplicationStatus(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject replicationStatusMendixObject)
	{
		if (replicationStatusMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DatabaseReplication.ReplicationStatus", replicationStatusMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DatabaseReplication.ReplicationStatus");

		this.replicationStatusMendixObject = replicationStatusMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ReplicationStatus.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static databasereplication.proxies.ReplicationStatus initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return databasereplication.proxies.ReplicationStatus.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static databasereplication.proxies.ReplicationStatus initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new databasereplication.proxies.ReplicationStatus(context, mendixObject);
	}

	public static databasereplication.proxies.ReplicationStatus load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return databasereplication.proxies.ReplicationStatus.initialize(context, mendixObject);
	}

	public static java.util.List<databasereplication.proxies.ReplicationStatus> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<databasereplication.proxies.ReplicationStatus> result = new java.util.ArrayList<databasereplication.proxies.ReplicationStatus>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DatabaseReplication.ReplicationStatus" + xpathConstraint))
			result.add(databasereplication.proxies.ReplicationStatus.initialize(context, obj));
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
	 * @return value of NrOfObjectsSynchronized
	 */
	public final java.lang.Integer getNrOfObjectsSynchronized()
	{
		return getNrOfObjectsSynchronized(getContext());
	}

	/**
	 * @param context
	 * @return value of NrOfObjectsSynchronized
	 */
	public final java.lang.Integer getNrOfObjectsSynchronized(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NrOfObjectsSynchronized.toString());
	}

	/**
	 * Set value of NrOfObjectsSynchronized
	 * @param nrofobjectssynchronized
	 */
	public final void setNrOfObjectsSynchronized(java.lang.Integer nrofobjectssynchronized)
	{
		setNrOfObjectsSynchronized(getContext(), nrofobjectssynchronized);
	}

	/**
	 * Set value of NrOfObjectsSynchronized
	 * @param context
	 * @param nrofobjectssynchronized
	 */
	public final void setNrOfObjectsSynchronized(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer nrofobjectssynchronized)
	{
		getMendixObject().setValue(context, MemberNames.NrOfObjectsSynchronized.toString(), nrofobjectssynchronized);
	}

	/**
	 * @return value of NrOfObjectsCreated
	 */
	public final java.lang.Integer getNrOfObjectsCreated()
	{
		return getNrOfObjectsCreated(getContext());
	}

	/**
	 * @param context
	 * @return value of NrOfObjectsCreated
	 */
	public final java.lang.Integer getNrOfObjectsCreated(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NrOfObjectsCreated.toString());
	}

	/**
	 * Set value of NrOfObjectsCreated
	 * @param nrofobjectscreated
	 */
	public final void setNrOfObjectsCreated(java.lang.Integer nrofobjectscreated)
	{
		setNrOfObjectsCreated(getContext(), nrofobjectscreated);
	}

	/**
	 * Set value of NrOfObjectsCreated
	 * @param context
	 * @param nrofobjectscreated
	 */
	public final void setNrOfObjectsCreated(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer nrofobjectscreated)
	{
		getMendixObject().setValue(context, MemberNames.NrOfObjectsCreated.toString(), nrofobjectscreated);
	}

	/**
	 * @return value of NrOfObjectsNotFound
	 */
	public final java.lang.Integer getNrOfObjectsNotFound()
	{
		return getNrOfObjectsNotFound(getContext());
	}

	/**
	 * @param context
	 * @return value of NrOfObjectsNotFound
	 */
	public final java.lang.Integer getNrOfObjectsNotFound(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NrOfObjectsNotFound.toString());
	}

	/**
	 * Set value of NrOfObjectsNotFound
	 * @param nrofobjectsnotfound
	 */
	public final void setNrOfObjectsNotFound(java.lang.Integer nrofobjectsnotfound)
	{
		setNrOfObjectsNotFound(getContext(), nrofobjectsnotfound);
	}

	/**
	 * Set value of NrOfObjectsNotFound
	 * @param context
	 * @param nrofobjectsnotfound
	 */
	public final void setNrOfObjectsNotFound(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer nrofobjectsnotfound)
	{
		getMendixObject().setValue(context, MemberNames.NrOfObjectsNotFound.toString(), nrofobjectsnotfound);
	}

	/**
	 * @return value of NrOfObjectsSkipped
	 */
	public final java.lang.Integer getNrOfObjectsSkipped()
	{
		return getNrOfObjectsSkipped(getContext());
	}

	/**
	 * @param context
	 * @return value of NrOfObjectsSkipped
	 */
	public final java.lang.Integer getNrOfObjectsSkipped(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NrOfObjectsSkipped.toString());
	}

	/**
	 * Set value of NrOfObjectsSkipped
	 * @param nrofobjectsskipped
	 */
	public final void setNrOfObjectsSkipped(java.lang.Integer nrofobjectsskipped)
	{
		setNrOfObjectsSkipped(getContext(), nrofobjectsskipped);
	}

	/**
	 * Set value of NrOfObjectsSkipped
	 * @param context
	 * @param nrofobjectsskipped
	 */
	public final void setNrOfObjectsSkipped(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer nrofobjectsskipped)
	{
		getMendixObject().setValue(context, MemberNames.NrOfObjectsSkipped.toString(), nrofobjectsskipped);
	}

	/**
	 * @return value of NrOfObjectsRemoved
	 */
	public final java.lang.Integer getNrOfObjectsRemoved()
	{
		return getNrOfObjectsRemoved(getContext());
	}

	/**
	 * @param context
	 * @return value of NrOfObjectsRemoved
	 */
	public final java.lang.Integer getNrOfObjectsRemoved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NrOfObjectsRemoved.toString());
	}

	/**
	 * Set value of NrOfObjectsRemoved
	 * @param nrofobjectsremoved
	 */
	public final void setNrOfObjectsRemoved(java.lang.Integer nrofobjectsremoved)
	{
		setNrOfObjectsRemoved(getContext(), nrofobjectsremoved);
	}

	/**
	 * Set value of NrOfObjectsRemoved
	 * @param context
	 * @param nrofobjectsremoved
	 */
	public final void setNrOfObjectsRemoved(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer nrofobjectsremoved)
	{
		getMendixObject().setValue(context, MemberNames.NrOfObjectsRemoved.toString(), nrofobjectsremoved);
	}

	/**
	 * @return value of NewRemoveIndicatorValue
	 */
	public final java.lang.Integer getNewRemoveIndicatorValue()
	{
		return getNewRemoveIndicatorValue(getContext());
	}

	/**
	 * @param context
	 * @return value of NewRemoveIndicatorValue
	 */
	public final java.lang.Integer getNewRemoveIndicatorValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NewRemoveIndicatorValue.toString());
	}

	/**
	 * Set value of NewRemoveIndicatorValue
	 * @param newremoveindicatorvalue
	 */
	public final void setNewRemoveIndicatorValue(java.lang.Integer newremoveindicatorvalue)
	{
		setNewRemoveIndicatorValue(getContext(), newremoveindicatorvalue);
	}

	/**
	 * Set value of NewRemoveIndicatorValue
	 * @param context
	 * @param newremoveindicatorvalue
	 */
	public final void setNewRemoveIndicatorValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer newremoveindicatorvalue)
	{
		getMendixObject().setValue(context, MemberNames.NewRemoveIndicatorValue.toString(), newremoveindicatorvalue);
	}

	/**
	 * @return value of PreviousRemoveIndicatorValue
	 */
	public final java.lang.Integer getPreviousRemoveIndicatorValue()
	{
		return getPreviousRemoveIndicatorValue(getContext());
	}

	/**
	 * @param context
	 * @return value of PreviousRemoveIndicatorValue
	 */
	public final java.lang.Integer getPreviousRemoveIndicatorValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.PreviousRemoveIndicatorValue.toString());
	}

	/**
	 * Set value of PreviousRemoveIndicatorValue
	 * @param previousremoveindicatorvalue
	 */
	public final void setPreviousRemoveIndicatorValue(java.lang.Integer previousremoveindicatorvalue)
	{
		setPreviousRemoveIndicatorValue(getContext(), previousremoveindicatorvalue);
	}

	/**
	 * Set value of PreviousRemoveIndicatorValue
	 * @param context
	 * @param previousremoveindicatorvalue
	 */
	public final void setPreviousRemoveIndicatorValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer previousremoveindicatorvalue)
	{
		getMendixObject().setValue(context, MemberNames.PreviousRemoveIndicatorValue.toString(), previousremoveindicatorvalue);
	}

	/**
	 * Set value of ReplicationStatus
	 * @param replicationstatus
	 */
	public final databasereplication.proxies.ReplicationStatusValues getReplicationStatus()
	{
		return getReplicationStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of ReplicationStatus
	 */
	public final databasereplication.proxies.ReplicationStatusValues getReplicationStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ReplicationStatus.toString());
		if (obj == null)
			return null;

		return databasereplication.proxies.ReplicationStatusValues.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ReplicationStatus
	 * @param replicationstatus
	 */
	public final void setReplicationStatus(databasereplication.proxies.ReplicationStatusValues replicationstatus)
	{
		setReplicationStatus(getContext(), replicationstatus);
	}

	/**
	 * Set value of ReplicationStatus
	 * @param context
	 * @param replicationstatus
	 */
	public final void setReplicationStatus(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.ReplicationStatusValues replicationstatus)
	{
		if (replicationstatus != null)
			getMendixObject().setValue(context, MemberNames.ReplicationStatus.toString(), replicationstatus.toString());
		else
			getMendixObject().setValue(context, MemberNames.ReplicationStatus.toString(), null);
	}

	/**
	 * @return value of ReplicationStatus_TableMapping
	 */
	public final databasereplication.proxies.TableMapping getReplicationStatus_TableMapping() throws com.mendix.core.CoreException
	{
		return getReplicationStatus_TableMapping(getContext());
	}

	/**
	 * @param context
	 * @return value of ReplicationStatus_TableMapping
	 */
	public final databasereplication.proxies.TableMapping getReplicationStatus_TableMapping(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		databasereplication.proxies.TableMapping result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReplicationStatus_TableMapping.toString());
		if (identifier != null)
			result = databasereplication.proxies.TableMapping.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReplicationStatus_TableMapping
	 * @param replicationstatus_tablemapping
	 */
	public final void setReplicationStatus_TableMapping(databasereplication.proxies.TableMapping replicationstatus_tablemapping)
	{
		setReplicationStatus_TableMapping(getContext(), replicationstatus_tablemapping);
	}

	/**
	 * Set value of ReplicationStatus_TableMapping
	 * @param context
	 * @param replicationstatus_tablemapping
	 */
	public final void setReplicationStatus_TableMapping(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.TableMapping replicationstatus_tablemapping)
	{
		if (replicationstatus_tablemapping == null)
			getMendixObject().setValue(context, MemberNames.ReplicationStatus_TableMapping.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReplicationStatus_TableMapping.toString(), replicationstatus_tablemapping.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return replicationStatusMendixObject;
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
			final databasereplication.proxies.ReplicationStatus that = (databasereplication.proxies.ReplicationStatus) obj;
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
		return "DatabaseReplication.ReplicationStatus";
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