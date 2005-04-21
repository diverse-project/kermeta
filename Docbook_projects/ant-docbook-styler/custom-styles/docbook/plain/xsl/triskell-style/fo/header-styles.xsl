<?xml version="1.0"?>
	<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
					xmlns:fo="http://www.w3.org/1999/XSL/Format"
					version="1.0">

	<!-- Header style definition -->

	<xsl:param name="section.autolabel.max.depth" select="3" />
	<xsl:param name="section.label.includes.component.label" select="1" />
	<xsl:param name="body.start.indent" select="'1cm'"></xsl:param>
	
	<xsl:param name="title.color">navy</xsl:param>
	
	<xsl:param name="title.margin.left">-1cm</xsl:param>
	
	<xsl:attribute-set name="section.title.properties">
	  <xsl:attribute name="font-family">Helvetica</xsl:attribute>
	  <xsl:attribute name="color"><xsl:value-of select="$title.color" /></xsl:attribute>
	  <xsl:attribute name="hyphenate">true</xsl:attribute>
	</xsl:attribute-set> 
	
	<!-- Chapter title -->
	
	<xsl:attribute-set name="component.title.properties">
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
		<xsl:attribute name="font-size">28pt</xsl:attribute>
		<xsl:attribute name="font-weight">bold</xsl:attribute>
		<xsl:attribute name="text-shadow">gray 0.3px -0.3px 5px</xsl:attribute>
		<xsl:attribute name="space-before">10pt</xsl:attribute>
		<xsl:attribute name="space-after">30pt</xsl:attribute>
		<xsl:attribute name="color"><xsl:value-of select="$title.color" /></xsl:attribute>
		<xsl:attribute name="text-align">right</xsl:attribute>   
	</xsl:attribute-set>
	
	
	<xsl:attribute-set name="component.label.properties">
	  <xsl:attribute name="font-family">Times</xsl:attribute>
	  <xsl:attribute name="font-size">18pt</xsl:attribute>
	  <xsl:attribute name="font-weight">bold</xsl:attribute>
	  <xsl:attribute name="font-style">italic</xsl:attribute>
	  <xsl:attribute name="font-stretch">5pt</xsl:attribute>
	  <xsl:attribute name="font-variant">small-caps</xsl:attribute>
	  <xsl:attribute name="space-before">40pt</xsl:attribute>
	  <xsl:attribute name="space-after">10pt</xsl:attribute>
	  <xsl:attribute name="color">gray</xsl:attribute>
	  <xsl:attribute name="text-align">right</xsl:attribute>   
	</xsl:attribute-set>
	
	
	<xsl:template name="component.title">
		<fo:block xsl:use-attribute-sets="component.label.properties">
			<xsl:if test="local-name(.)!='index'">
				<xsl:call-template name="gentext">
		  			<xsl:with-param name="key" select="'chapter'"/>
				</xsl:call-template>
				<xsl:text> </xsl:text>
				<xsl:apply-templates select=".." mode="label.markup"/>
				</xsl:if>
		</fo:block>
		<fo:block xsl:use-attribute-sets="component.title.properties">
			<xsl:apply-templates select="." mode="title.markup"/>
		</fo:block>
	</xsl:template>
	
	<!-- Section level -->
	
	<!--<xsl:attribute-set name="section.properties">
	  <xsl:attribute name="margin-left">1cm</xsl:attribute>
	</xsl:attribute-set> -->
	
	<xsl:attribute-set name="section.title.level1.properties">
	  <xsl:attribute name="font-size">16pt</xsl:attribute>
	  <xsl:attribute name="font-weight">bold</xsl:attribute>
	  <xsl:attribute name="color"><xsl:value-of select="$title.color" /></xsl:attribute>
	  <xsl:attribute name="border-bottom-style">solid</xsl:attribute>
	  <xsl:attribute name="border-bottom-color"><xsl:value-of select="$title.color" /></xsl:attribute>
	  <xsl:attribute name="border-bottom-width">0.5pt</xsl:attribute>
	  <xsl:attribute name="space-before">20pt</xsl:attribute> 
	  <xsl:attribute name="space-after">10pt</xsl:attribute>
	  <xsl:attribute name="margin-left">-0.5cm</xsl:attribute>
	</xsl:attribute-set>
	
	<xsl:attribute-set name="section.title.level2.properties">
	  <xsl:attribute name="font-size">14pt</xsl:attribute>
	  <xsl:attribute name="font-weight">bold</xsl:attribute>
	  <xsl:attribute name="margin-left">1cm</xsl:attribute>
	  <xsl:attribute name="space-before">10pt</xsl:attribute> 
	  <xsl:attribute name="space-after">5pt</xsl:attribute>
	</xsl:attribute-set>
	
	
	<xsl:attribute-set name="section.title.level3.properties">
	  <xsl:attribute name="font-size">12pt</xsl:attribute>
	  <xsl:attribute name="font-weight">bold</xsl:attribute>
	  <xsl:attribute name="margin-left">1cm</xsl:attribute>
	  <xsl:attribute name="space-before">10pt</xsl:attribute> 
	  <xsl:attribute name="space-after">5pt</xsl:attribute>
	</xsl:attribute-set>
	
	
	<xsl:attribute-set name="section.title.level4.properties">
	  <xsl:attribute name="font-size">10pt</xsl:attribute>
	  <xsl:attribute name="font-weight">bold</xsl:attribute>
	  <xsl:attribute name="margin-left">1cm</xsl:attribute>
	  <xsl:attribute name="space-before">10pt</xsl:attribute> 
	  <xsl:attribute name="space-after">5pt</xsl:attribute>
	</xsl:attribute-set>
	
	
	<xsl:attribute-set name="section.title.level5.properties">
	  <xsl:attribute name="font-size">10pt</xsl:attribute>
	  <xsl:attribute name="font-weight">normal</xsl:attribute>
	  <xsl:attribute name="margin-left">1cm</xsl:attribute>
	  <xsl:attribute name="space-before">5pt</xsl:attribute> 
	  <xsl:attribute name="space-after">5pt</xsl:attribute>
	</xsl:attribute-set>
	

</xsl:stylesheet>