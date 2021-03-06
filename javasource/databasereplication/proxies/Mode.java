// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public enum Mode
{
	Normal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Normal" }, new java.lang.String[] { "nl_NL", "Normaal" }, new java.lang.String[] { "en_GB", "Normal" }, new java.lang.String[] { "en_ZA", "Normal" } }),
	Advanced(new java.lang.String[][] { new java.lang.String[] { "en_US", "Advanced" }, new java.lang.String[] { "nl_NL", "Geavanceerd" }, new java.lang.String[] { "en_GB", "Advanced" }, new java.lang.String[] { "en_ZA", "Advanced" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Mode(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
