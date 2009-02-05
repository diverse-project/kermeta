<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
				xmlns:fo="http://www.w3.org/1999/XSL/Format"
				version="1.0">

	<!-- Title Properties for Formal objects such as Figures, Tables   -->
	
	<xsl:param name="formal.title.placement">
	figure after
	example after
	equation after
	table after
	procedure after
	task after
	</xsl:param>
	
	
	<xsl:attribute-set name="formal.title.properties" use-attribute-sets="normal.para.spacing">
	  <xsl:attribute name="font-family">Helvetica</xsl:attribute>
	  <xsl:attribute name="font-style">italic</xsl:attribute>
	  <xsl:attribute name="font-weight">bold</xsl:attribute>
	  <xsl:attribute name="font-size">10pt</xsl:attribute>
	  <xsl:attribute name="color"><xsl:value-of select="$title.color" /></xsl:attribute>
	  <xsl:attribute name="text-align">center</xsl:attribute>   
	  <xsl:attribute name="space-before">1pt</xsl:attribute>
	  <xsl:attribute name="space-after">5pt</xsl:attribute>
	</xsl:attribute-set>
	
	<xsl:attribute-set name="informal.object.properties">
		<xsl:attribute name="text-align">justify</xsl:attribute>   
	</xsl:attribute-set>
	
	
	<xsl:attribute-set name="formal.object.properties" use-attribute-sets="normal.para.spacing">
		<xsl:attribute name="text-align">justify</xsl:attribute>   
		<!-- <xsl:attribute name="margin-left">1.5cm</xsl:attribute>   -->
	</xsl:attribute-set>
	
	<!-- Tables content -->
	<!--
	<xsl:param name="nominal.table.width" select="15cm"></xsl:param> -->
	
	<xsl:attribute-set name="informaltable.properties" use-attribute-sets="table.properties"/>
	
	<xsl:attribute-set name="table.properties">
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
		<xsl:attribute name="font-style">normal</xsl:attribute>
	    <xsl:attribute name="font-size">10pt</xsl:attribute>
		<!-- <xsl:attribute name="margin-left">1.5cm</xsl:attribute>    -->
	</xsl:attribute-set>
	
	<!-- Figures -->
	
	<xsl:attribute-set name="figure.properties">
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
		<xsl:attribute name="font-style">normal</xsl:attribute>
	    <xsl:attribute name="font-size">10pt</xsl:attribute>
		<xsl:attribute name="text-align">center</xsl:attribute>   
	</xsl:attribute-set>
	
	
</xsl:stylesheet>