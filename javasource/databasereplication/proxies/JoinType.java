// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public enum JoinType
{
	INNER(new java.lang.String[][] { new java.lang.String[] { "en_US", "Required (INNER)" }, new java.lang.String[] { "nl_NL", "Verplicht (INNER)" }, new java.lang.String[] { "en_GB", "Required (INNER)" }, new java.lang.String[] { "en_ZA", "Required (INNER)" } }),
	LEFT(new java.lang.String[][] { new java.lang.String[] { "en_US", "As long as left side exists (LEFT)" }, new java.lang.String[] { "nl_NL", "Als de linker kant bestaat (LEFT)" }, new java.lang.String[] { "en_GB", "As long as left side exists (LEFT)" }, new java.lang.String[] { "en_ZA", "As long as left side exists (LEFT)" } }),
	RIGHT(new java.lang.String[][] { new java.lang.String[] { "en_US", "As long as right side exists (RIGHT)" }, new java.lang.String[] { "nl_NL", "Als de rechter kant bestaat (RIGHT)" }, new java.lang.String[] { "en_GB", "As long as right side exists (RIGHT)" }, new java.lang.String[] { "en_ZA", "As long as right side exists (RIGHT)" } }),
	LEFT_OUTER(new java.lang.String[][] { new java.lang.String[] { "en_US", "Only when left side exists and right side doesn't (LEFT OUTER)" }, new java.lang.String[] { "nl_NL", "Alleen als de linker tabel bestaat en rechts niet bestaat (LEFT OUTER)" }, new java.lang.String[] { "en_GB", "Only when left side exists and right side doesn't (LEFT OUTER)" }, new java.lang.String[] { "en_ZA", "Only when left side exists and right side doesn't (LEFT OUTER)" } }),
	RIGHT_OUTER(new java.lang.String[][] { new java.lang.String[] { "en_US", "Only when right side exists and left side doesn't (RIGHT OUTER)" }, new java.lang.String[] { "nl_NL", "Alleen als de rechter tabel bestaat en linker niet bestaat (LEFT OUTER)" }, new java.lang.String[] { "en_GB", "Only when right side exists and left side doesn't (RIGHT OUTER)" }, new java.lang.String[] { "en_ZA", "Only when right side exists and left side doesn't (RIGHT OUTER)" } }),
	FROM(new java.lang.String[][] { new java.lang.String[] { "en_US", "Addtional From table" }, new java.lang.String[] { "nl_NL", "Extra tabel in From clause" }, new java.lang.String[] { "en_GB", "Addtional From table" }, new java.lang.String[] { "en_ZA", "Addtional From table" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private JoinType(java.lang.String[][] captionStrings)
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
