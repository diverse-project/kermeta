<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                version='1.0'>


	<!-- <xsl:param name="use.extensions" select="'1'"/> -->
	
	<xsl:param name="section.autolabel" select="1" />
	<xsl:param name="generate.toc">book toc,figure</xsl:param>
	
	<xsl:param name="draft.mode">no</xsl:param>
	
	<xsl:param name="ulink.footnotes" select="0"/>
	<xsl:param name="ulink.show" select="0"/>
	
	<!-- No line in footers-->
	<xsl:param name="footer.rule" select="0" />
		
	<!--
	<xsl:param name="page.margin.inner">2.5cm</xsl:param>
	<xsl:param name="page.margin.outer">2.5cm</xsl:param>
	
	-->
	
	<xsl:include href="triskell-titlepage.xsl"/>
	
	<xsl:include href="table-of-contents-styles.xsl"/>
	<xsl:include href="list-of-figures-styles.xsl"/>
	
	<xsl:include href="header-styles.xsl"/>
	<xsl:include href="admonitions-styles.xsl"/>
	<xsl:include href="program-listing-styles.xsl"/>
	<xsl:include href="object-styles.xsl"/>
	<xsl:include href="blockquote-styles.xsl"/>
		
</xsl:stylesheet>

