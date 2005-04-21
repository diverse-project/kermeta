<?xml version="1.0"?>
	<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
					xmlns:fo="http://www.w3.org/1999/XSL/Format"
					version="1.0">

	<!-- List of Figure -->
	
	<xsl:attribute-set name="lof.title.properties">
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
		<xsl:attribute name="font-weight">bold</xsl:attribute>   
	    <xsl:attribute name="font-style">normal</xsl:attribute>
		<xsl:attribute name="color">midnightblue</xsl:attribute>
	    <xsl:attribute name="font-size">28pt</xsl:attribute>
	  	<xsl:attribute name="text-align">right</xsl:attribute>   
		<xsl:attribute name="space-before">40pt</xsl:attribute>
	  	<xsl:attribute name="space-after">30pt</xsl:attribute>
	</xsl:attribute-set>
	
	
	<xsl:template name="list.of.figures.titlepage" priority="1">
	  <fo:block xsl:use-attribute-sets="lof.title.properties">
	    <xsl:call-template name="gentext">
	      <xsl:with-param name="key" select="'ListofFigures'"/>
	    </xsl:call-template>
	  </fo:block>
	</xsl:template>

</xsl:stylesheet>