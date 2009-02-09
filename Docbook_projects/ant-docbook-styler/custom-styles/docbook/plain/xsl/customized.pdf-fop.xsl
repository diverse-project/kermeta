<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                version='1.0'
                xmlns:xslthl="http://xslthl.sf.net"
                exclude-result-prefixes="xslthl">




<xsl:import href="@ant.docbook.styler.fileuri@/docbook/xsl/fo/docbook.xsl" />
<xsl:import href="@docbook.style.fileuri@/xsl/triskell-style/fo/customized.triskell-fo-base.xsl" />

<xsl:param name="fop.extensions" select="1" />
<!-- should be 200a, but fop does not support it. -->
<xsl:param name="ulink.hyphenate">&#x200b;</xsl:param>

<!-- support for highlighting -->
<xsl:param name="highlight.source" select="1"/>
<xsl:template match='xslthl:keyword'>
  <fo:inline font-weight="bold"><xsl:apply-templates/></fo:inline>
</xsl:template>
<xsl:template match='xslthl:string'>
  <fo:inline font-style="italic"><xsl:apply-templates/></fo:inline>
</xsl:template>
<xsl:template match='xslthl:comment'>
  <fo:inline font-style="italic" color="darkgrey"><xsl:apply-templates/></fo:inline>
</xsl:template>
 
</xsl:stylesheet>

