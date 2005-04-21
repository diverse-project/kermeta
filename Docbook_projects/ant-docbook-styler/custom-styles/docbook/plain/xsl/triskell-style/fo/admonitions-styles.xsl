<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
				xmlns:fo="http://www.w3.org/1999/XSL/Format"
				version="1.0">
	<!-- Admonitions : Warning, notes, infos .... -->
	
	<xsl:param name="admon.graphics" select="0"/>
	
	<!-- Warning -->
	
	<xsl:attribute-set name="warning.properties">
	  <xsl:attribute name="background-color">papayawhip</xsl:attribute>
	  <xsl:attribute name="border-left">solid firebrick 2pt</xsl:attribute>
	  <xsl:attribute name="space-before">5pt</xsl:attribute> 
	</xsl:attribute-set>
	
	<xsl:attribute-set name="warning.title.properties">
		<xsl:attribute name="font-size">9pt</xsl:attribute>
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	    <xsl:attribute name="font-weight">bold</xsl:attribute> 
		<xsl:attribute name="color">firebrick</xsl:attribute>
	    <xsl:attribute name="margin-left">1cm</xsl:attribute>
	 	<xsl:attribute name="padding">5pt</xsl:attribute>
	</xsl:attribute-set>
	
	<xsl:attribute-set name="warning.body.properties">
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	    <xsl:attribute name="font-size">9pt</xsl:attribute>
		<xsl:attribute name="margin-left">0.5cm</xsl:attribute>
	  	<xsl:attribute name="padding">5pt</xsl:attribute>
		<xsl:attribute name="padding-left">1cm</xsl:attribute>
	</xsl:attribute-set>
	
	<!-- Note -->
	<xsl:attribute-set name="note.properties">
	  <xsl:attribute name="background-color">GAINSBORO</xsl:attribute>
	  <xsl:attribute name="border-left">solid black 2pt</xsl:attribute>
	  <xsl:attribute name="space-before">5pt</xsl:attribute> 
	</xsl:attribute-set>
	
	<xsl:attribute-set name="note.title.properties">
		<xsl:attribute name="font-size">9pt</xsl:attribute>
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	    <xsl:attribute name="font-weight">bold</xsl:attribute>   
	    <xsl:attribute name="margin-left">1cm</xsl:attribute>
	 	<xsl:attribute name="padding">5pt</xsl:attribute>
	</xsl:attribute-set>
	
	<xsl:attribute-set name="note.body.properties">
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	    <xsl:attribute name="font-size">9pt</xsl:attribute>
		<xsl:attribute name="margin-left">0.5cm</xsl:attribute>
	  	<xsl:attribute name="padding">5pt</xsl:attribute>
		<xsl:attribute name="padding-left">1cm</xsl:attribute>
	</xsl:attribute-set>
	
	<!-- Caution -->
	<xsl:attribute-set name="caution.properties">
	  <xsl:attribute name="background-color">lightyellow</xsl:attribute>
	  <xsl:attribute name="border-left">solid darkorange 2pt</xsl:attribute>
	  <xsl:attribute name="space-before">5pt</xsl:attribute> 
	</xsl:attribute-set>
	
	<xsl:attribute-set name="caution.title.properties">
		<xsl:attribute name="font-size">9pt</xsl:attribute>
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	    <xsl:attribute name="font-weight">bold</xsl:attribute>   
	    <xsl:attribute name="color">darkorange</xsl:attribute>
	    <xsl:attribute name="margin-left">1cm</xsl:attribute>
	 	<xsl:attribute name="padding">5pt</xsl:attribute>
	</xsl:attribute-set>
	
	<xsl:attribute-set name="caution.body.properties">
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	    <xsl:attribute name="font-size">9pt</xsl:attribute>
		<xsl:attribute name="margin-left">0.5cm</xsl:attribute>     
	  	<xsl:attribute name="padding">5pt</xsl:attribute>
		<xsl:attribute name="padding-left">1cm</xsl:attribute>
	</xsl:attribute-set>
	
	<!-- Important -->
	
	<xsl:attribute-set name="important.properties">
	  <xsl:attribute name="background-color">lightcyan</xsl:attribute>
	  <xsl:attribute name="border-left">solid seagreen 2pt</xsl:attribute>
	  <xsl:attribute name="space-before">5pt</xsl:attribute> 
	</xsl:attribute-set>
	
	<xsl:attribute-set name="important.title.properties">
		<xsl:attribute name="font-size">9pt</xsl:attribute>
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	    <xsl:attribute name="font-weight">bold</xsl:attribute>   
	    <xsl:attribute name="color">seagreen</xsl:attribute>
	    <xsl:attribute name="margin-left">1cm</xsl:attribute>
	 	<xsl:attribute name="padding">5pt</xsl:attribute>
	</xsl:attribute-set>
	
	<xsl:attribute-set name="important.body.properties">
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	    <xsl:attribute name="font-size">9pt</xsl:attribute>
		<xsl:attribute name="margin-left">0.5cm</xsl:attribute>
	  	<xsl:attribute name="padding">5pt</xsl:attribute>
		<xsl:attribute name="padding-left">1cm</xsl:attribute>
	</xsl:attribute-set>
	
	
	<!-- Tip -->
	
	<xsl:attribute-set name="tip.properties">
	  <xsl:attribute name="background-color">lightsteelblue</xsl:attribute>
	  <xsl:attribute name="border-left">solid midnightblue 2pt</xsl:attribute>
	  <xsl:attribute name="space-before">5pt</xsl:attribute> 
	</xsl:attribute-set>
	
	<xsl:attribute-set name="tip.title.properties">
		<xsl:attribute name="font-size">9pt</xsl:attribute>
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	    <xsl:attribute name="font-weight">bold</xsl:attribute>   
		<xsl:attribute name="color">midnightblue</xsl:attribute>
	    <xsl:attribute name="margin-left">1cm</xsl:attribute>
	 	<xsl:attribute name="padding">5pt</xsl:attribute>
	</xsl:attribute-set>
	
	<xsl:attribute-set name="tip.body.properties">
		<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	    <xsl:attribute name="font-size">9pt</xsl:attribute>
		<xsl:attribute name="margin-left">0.5cm</xsl:attribute> 
	  	<xsl:attribute name="padding">5pt</xsl:attribute>
		<xsl:attribute name="padding-left">1cm</xsl:attribute>
</xsl:attribute-set>


<xsl:template name="nongraphical.admonition">
	<xsl:variable name="local.kind" select="local-name(.)" />	
	<xsl:choose>
		<!-- Warning -->
		<xsl:when test="$local.kind='warning'">
			<fo:block xsl:use-attribute-sets="warning.properties">
				<fo:block keep-with-next='always'  xsl:use-attribute-sets="warning.title.properties">
		        	<xsl:apply-templates select="." mode="object.title.markup"/>
		      	</fo:block>
			  	<fo:block xsl:use-attribute-sets="warning.body.properties">
		      		<xsl:apply-templates/>
		    	</fo:block>
			</fo:block>
		</xsl:when>
		<!-- Note -->
		<xsl:when test="$local.kind='note'">
			<fo:block xsl:use-attribute-sets="note.properties">
				<fo:block keep-with-next='always'  xsl:use-attribute-sets="note.title.properties">
		        	<xsl:apply-templates select="." mode="object.title.markup"/>
		      	</fo:block>
			  	<fo:block xsl:use-attribute-sets="note.body.properties">
		      		<xsl:apply-templates/>
		    	</fo:block>
			</fo:block>
		</xsl:when>
		<!-- Caution -->
		<xsl:when test="$local.kind='caution'">
			<fo:block xsl:use-attribute-sets="caution.properties">
				<fo:block keep-with-next='always'  xsl:use-attribute-sets="caution.title.properties">
		        	<xsl:apply-templates select="." mode="object.title.markup"/>
		      	</fo:block>
			  	<fo:block xsl:use-attribute-sets="caution.body.properties">
		      		<xsl:apply-templates/>
		    	</fo:block>
			</fo:block>
		</xsl:when>
		<!-- Important -->
		<xsl:when test="$local.kind='important'">
			<fo:block xsl:use-attribute-sets="important.properties">
				<fo:block keep-with-next='always'  xsl:use-attribute-sets="important.title.properties">
		        	<xsl:apply-templates select="." mode="object.title.markup"/>
		      	</fo:block>
			  	<fo:block xsl:use-attribute-sets="important.body.properties">
		      		<xsl:apply-templates/>
		    	</fo:block>
			</fo:block>
		</xsl:when>
		<!-- Important -->
		<xsl:when test="$local.kind='tip'">
			<fo:block xsl:use-attribute-sets="tip.properties">
				<fo:block keep-with-next='always'  xsl:use-attribute-sets="tip.title.properties">
		        	<xsl:apply-templates select="." mode="object.title.markup"/>
		      	</fo:block>
			  	<fo:block xsl:use-attribute-sets="tip.body.properties">
		      		<xsl:apply-templates/>
		    	</fo:block>
			</fo:block>
		</xsl:when>
	</xsl:choose>
	
</xsl:template>


</xsl:stylesheet>