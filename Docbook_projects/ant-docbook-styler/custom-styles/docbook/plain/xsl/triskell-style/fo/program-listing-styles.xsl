<?xml version="1.0"?>
	<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
					xmlns:fo="http://www.w3.org/1999/XSL/Format"
					version="1.0">

	<xsl:param name="callout.graphics" select="'0'" />
	<xsl:param name="callout.unicode" select="'1'" />
	
	<!-- Program Listing -->

	<xsl:param name="shade.verbatim" select="1"/>
	
	<!-- 
	<xsl:param name="linenumbering.extension" select="'1'" />
	<xsl:param name="linenumbering.width" select="'3'"/>
	-->
	
	<xsl:attribute-set name="shade.verbatim.style">
	  	<xsl:attribute name="font-family">Helvetica</xsl:attribute>
		<xsl:attribute name="font-size">8pt</xsl:attribute>
	  	<xsl:attribute name="color"><xsl:value-of select="$title.color" /></xsl:attribute>
	  	<xsl:attribute name="background-color">papayawhip</xsl:attribute>
		<xsl:attribute name="margin-left">1cm</xsl:attribute>
	  	<xsl:attribute name="space-before">5pt</xsl:attribute> 
	  	<xsl:attribute name="space-after">5pt</xsl:attribute>
	  	<xsl:attribute name="padding">5pt</xsl:attribute>
	</xsl:attribute-set>

</xsl:stylesheet>