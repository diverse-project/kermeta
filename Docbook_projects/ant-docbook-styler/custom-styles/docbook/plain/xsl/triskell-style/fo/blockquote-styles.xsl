<?xml version="1.0"?>
	<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
					xmlns:fo="http://www.w3.org/1999/XSL/Format"
					version="1.0">


	<!-- Citations and epigraph -->
	
	<xsl:attribute-set name="blockquote.properties">	
		<xsl:attribute name="font-family">Times</xsl:attribute>
		<xsl:attribute name="font-style">italic</xsl:attribute>
	    <xsl:attribute name="font-size">10pt</xsl:attribute>
		<xsl:attribute name="border-bottom">solid black 0.5pt</xsl:attribute>	
		<xsl:attribute name="margin-left">2cm</xsl:attribute>    
		<xsl:attribute name="text-align">right</xsl:attribute>   
	</xsl:attribute-set>
	
	
	<xsl:template match="blockquote">
		<fo:block xsl:use-attribute-sets="blockquote.properties">
			  <xsl:value-of select="."/>
		</fo:block>
	</xsl:template>
	
</xsl:stylesheet>	
