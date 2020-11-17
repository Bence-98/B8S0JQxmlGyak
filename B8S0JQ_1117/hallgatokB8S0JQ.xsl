<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
		<body>
		
		<table border="1">
      <tr bgcolor="#32AFFF">
        <th>keresztnev</th>
        <th>vezeteknek</th>
        <th>becenev</th>
        <th>fizetes</th>
      </tr>
      <xsl:for-each select="osztaly/alkalmazott">
      <tr bgcolor="#00FF7F">
        <td><xsl:value-of select="keresztnev"/></td>
        <td><xsl:value-of select="vezeteknek"/></td>
        <td><xsl:value-of select="becenev"/></td>
        <td><xsl:value-of select="fizetes"/></td>
      </tr>
      </xsl:for-each>
    </table>
		
		</body>
		</html>
	</xsl:template>
</xsl:stylesheet>